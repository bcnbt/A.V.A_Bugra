package demo.sphinx.helloworld;

import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import edu.cmu.sphinx.util.props.PropertyException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
	static int i = 1;
	static String resultText;
	static int randomInt;
	public static String gender = "female";
	public static String user = "Bugra";
	public static String OS;
	public static Ai ava;
	public static String[] comebacks = new String[10];
	public static String[] compliments = new String[10];

	public static void main(String[] args) {
		try {
			URL url;
			if (args.length > 0) {
				url = new File(args[0]).toURI().toURL();
			} else {
				url = HelloWorld.class.getResource("helloworld.config.xml");
			}

			Ai ava = new Ai(user, gender, 10, 7, 9, 3);

			Random randomGenerator = new Random();
			if (user == "Sam") {
				randomInt = randomGenerator.nextInt(7);
				OS = "Windows";
			} else if (user == "root") {
				randomInt = randomGenerator.nextInt(4);
				OS = "Linux";
			} else if (user == "guest") {
				randomInt = randomGenerator.nextInt(4);
				OS = "";
			} else if (user == "professor") {
				randomInt = randomGenerator.nextInt(1);
				OS = "";
			} else if (user == "Bugra") {
				randomInt = randomGenerator.nextInt(7);
				OS = "Mac";
			}
			getOS.identify();
			Ai.sayOS("Welcome to JARVIS / AVA 0.3");
			Ai.sayOS("Please wait, your personal assistant is currently loading... \n");

			ConfigurationManager cm = new ConfigurationManager(url);
			Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
			Microphone microphone = (Microphone) cm.lookup("microphone");
			recognizer.allocate();

			String[] greetings = new String[10];
			Ai.startGreetingsBootUp(greetings);
			Ai.startComeBackBootUp(comebacks);
			Ai.startComplimentsBootUp(compliments);

			if (microphone.startRecording()) {

				ava.say("\n" + greetings[randomInt]);

				while (true) {
					Result result = recognizer.recognize();
					if (result != null) {
						resultText = result.getBestFinalResultNoFiller();
						ava.IsRecognized(resultText);
					} else {
						System.out.println("I can't hear what you said.\n");
					}
				}
			} else {
				System.out.println("Cannot start microphone.");
				recognizer.deallocate();
				System.exit(1);
			}

		} catch (IOException e) {
			System.err.println("Problem when loading HelloWorld: " + e);
			e.printStackTrace();
		} catch (PropertyException e) {
			System.err.println("Problem configuring HelloWorld: " + e);
			e.printStackTrace();
		} catch (InstantiationException e) {
			System.err.println("Problem creating HelloWorld: " + e);
			e.printStackTrace();
		}
	}
}