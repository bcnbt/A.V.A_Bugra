package demo.sphinx.helloworld;

public class LinCommands {

	public static void isCommand(String resultText) {
		// Calculator
		if (resultText.equalsIgnoreCase("open calculator")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("galculator");
				p.waitFor();
				Ai.say("Opening calculator..");
			} catch (Exception ae) {
			}
		}
		// Browser
		else if (resultText.equalsIgnoreCase("open Browser")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("firefox");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close Browser")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("pkill -f firefox");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("open a new tab")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("firefox -new-window");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("open a new window")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("firefox");
			} catch (Exception ae) {
			}
		}
		// Microsoft Word
		else if (resultText.equalsIgnoreCase("open word")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("LibreOffice Writer");
			} catch (Exception ae) {
			}
		}
		// Excel
		else if (resultText.equalsIgnoreCase("start Excel")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("LibreOffice Numbers");
			} catch (Exception ae) {
			}
		}
		// Powerpoint
		else if (resultText.equalsIgnoreCase("start Excel")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("LibreOffice Slides");
			} catch (Exception ae) {
			}
		}
		// Facebook
		else if (resultText.equalsIgnoreCase("go to face book")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("firefox www.facebook.com");
				Ai.say(HelloWorld.compliments[HelloWorld.randomInt]);
			} catch (Exception ae) {
			}
		}
		// Netflix
		else if (resultText.equalsIgnoreCase("open net fix")) {
			try {
				Ai.say("opening net flix");
				Process p;
				p = Runtime.getRuntime().exec("firefox www.netflix.com");
				Ai.say(HelloWorld.compliments[HelloWorld.randomInt]);
			} catch (Exception ae) {
			}
		}
		// google
		else if (resultText.equalsIgnoreCase("go to go girl") | resultText.equalsIgnoreCase("open go girl")) {
			try {
				Ai.say("opening net flix");
				Process p;
				p = Runtime.getRuntime().exec("firefox www.google.com");
			} catch (Exception ae) {
			}
		}
	}
}
