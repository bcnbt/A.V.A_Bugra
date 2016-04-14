package demo.sphinx.helloworld;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Ai {

	public static String name;
	public static String gender;
	public static int sarcasm;
	public static int hummor;
	public static int honesty;
	public static int affection;
	public static boolean pause = false;

	public Ai(String name, String gender, int hummor, int sarcasm, int honesty, int affection) {
		this.name = name;
		this.gender = gender;
		this.hummor = hummor;
		this.sarcasm = sarcasm;
		this.honesty = honesty;
		this.affection = affection;
	}

	static void startGreetingsBootUp(String[] greetings) {
		greetings[0] = "Hello";
		greetings[1] = "How are you today?";
		greetings[2] = "Hello I am AVA";
		greetings[3] = "Welcome to JARVIS";
		greetings[4] = "Can I help you?";
	}

	static void startComeBackBootUp(String[] comebacks) {
		comebacks[0] = "sure " + HelloWorld.user;
		comebacks[1] = "whatever you say";
		comebacks[2] = "maybe";
		comebacks[3] = "probably not";
		comebacks[4] = "how about no?";
		comebacks[5] = "I dont have to help you?";
	}

	static void startComplimentsBootUp(String[] compliments) {
		compliments[0] = "here ya go";
		compliments[1] = "sounds good";
		compliments[2] = "sorry if its slow";
		compliments[3] = "if it takes forever its not my fault";
		compliments[4] = "I dont know why it hasnt opened?";
	}

	static void say(String text) {
		if (gender == "male" & HelloWorld.OS == "Mac") {
			try {
				String outM = "say " + '"' + text + '"';
				System.out.print(text + "\n" + "Y:");
				Process p;
				p = Runtime.getRuntime().exec(outM);
				p.waitFor();
			} catch (Exception ae) {
			}
		}

		else if (gender == "female" & HelloWorld.OS == "Mac") {
			try {
				String outF = "say -v Victoria " + '"' + text + '"';
				System.out.print(text + "\n" + "Y:");
				Process p;
				p = Runtime.getRuntime().exec(outF);
				p.waitFor();
			} catch (Exception ae) {
			}
		}

		else if (gender == "male" & HelloWorld.OS == "Windows") {
			final String VOICENAME = "kevin16";
			Voice voice;
			VoiceManager vm = VoiceManager.getInstance();
			voice = vm.getVoice(VOICENAME);
			voice.allocate();
			try {
				voice.speak(text);
				System.out.print(text + "\n" + "Y:");
			} catch (Exception e) {
			}
		}

		else if (gender == "female" & HelloWorld.OS == "Windows") {
			final String VOICENAME = "kevin16";
			Voice voice;
			VoiceManager vm = VoiceManager.getInstance();
			voice = vm.getVoice(VOICENAME);
			voice.allocate();
			try {
				voice.speak(text);
				System.out.print(text + "\n" + "Y:");
			} catch (Exception e) {
			}
		}
	}

	static void sayOS(String text1) {
		if (gender == "female" & HelloWorld.OS == "Mac") {
			try {
				String outF = "say -v Victoria " + '"' + text1 + '"';
				System.out.print(text1 + "\n");
				Process p;
				p = Runtime.getRuntime().exec(outF);
				p.waitFor();
			} catch (Exception ae) {
			}
		} else if (gender == "female" & HelloWorld.OS == "Windows") {
			final String VOICENAME = "kevin16";
			Voice voice;
			VoiceManager vm = VoiceManager.getInstance();
			voice = vm.getVoice(VOICENAME);
			voice.allocate();
			try {
				voice.speak(text1);
				System.out.print(text1 + "\n");
			} catch (Exception e) {
			}
		}
	}

	public static void IsRecognized(String resultText) {

		if (pause == false) {
			DateAndTime.isDateAndTime(resultText);
			Calculator.isfunction(resultText);
			//Search.isSearch(resultText);
			getUser.getUsername(resultText);
			if(HelloWorld.OS == "Windows"){
				WinCommands.isCommand(resultText);
			}else if(HelloWorld.OS == "Mac"){
				MacCommands.isCommand(resultText);
			}else if(HelloWorld.OS == "Linux"){
				LinCommands.isCommand(resultText);
			}
			Conversation.isConversation(resultText);
			Questions.IsQuestions(resultText);
			Music.isMusic(resultText);
			Movie.isMovie(resultText);
		} else {
			WakeUpCommand.IsWakeUpCommand(resultText);
		}
	}
}
