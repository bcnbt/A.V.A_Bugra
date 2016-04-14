package demo.sphinx.helloworld;

import java.io.IOException;
import java.util.Scanner;

public class Music {

	static void isMusic(String resultText) {
		if (resultText.equalsIgnoreCase("Play Music")) {
			try {
				Ai.say("Playing Music");
				Process pM = Runtime.getRuntime().exec("afplay /Users/bugracinbat/Desktop/ava_media/learn.mp3");
				stopMusic();
				pM.waitFor();
			} catch (Exception ae) {
			}
		}
	}

	static void stopMusic() throws IOException {
		System.out.println("Type 'stop' if you want to stop the music.");
		Scanner scanner = new Scanner(System.in);
		String musicInput = scanner.next();

		if (musicInput.equals("stop")) {
			Process p = Runtime.getRuntime().exec("killall afplay");
			System.out.println("Music stopped.");
		}
		if (!musicInput.equals("stop")) {
			System.out.println("You entered " + musicInput);
			stopMusic();
		}
		scanner.close();
	}

	public static void main(String[] args) {
		isMusic("Play Music");
	}

}
