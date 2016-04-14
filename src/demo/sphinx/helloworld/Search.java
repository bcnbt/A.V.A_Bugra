package demo.sphinx.helloworld;

import java.io.IOException;
import java.util.Scanner;

public class Search {

	public static void isSearch(String resultText) {
		if (resultText.equalsIgnoreCase("Play Movie")) {
			try {
				Ai.say("Searching...");
				Process pM = Runtime.getRuntime().exec("/usr/bin/open -a \"/Applications/Google Chrome.app\" 'http://google.com/'");
				stopMovie();
				pM.waitFor();
			} catch (Exception ae) {
			}
		}
	}

	static void stopMovie() throws IOException {
		System.out.println("Type 'stop' if you want to stop the movie..");
		Scanner scanner = new Scanner(System.in);
		String movieInput = scanner.next();

		if (movieInput.equals("stop")) {
			Process pA = Runtime.getRuntime().exec("osascript -e \'quit app \"Calendar\"\'");
			System.out.println("Movie stopped.");
		}
		if (!movieInput.equals("stop")) {
			System.out.println("You entered " + movieInput);
			stopMovie();
		}
		scanner.close();
	}

	public static void main(String[] args) {
		isSearch("Play Movie");
	}

}