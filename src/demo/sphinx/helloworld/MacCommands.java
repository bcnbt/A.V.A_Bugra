package demo.sphinx.helloworld;

public class MacCommands {

	public static void isCommand(String resultText) {
		// Calculator
		if (resultText.equalsIgnoreCase("open calculator")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("open /Applications/Calculator.app/");
				p.waitFor();
				Ai.say("Opening calculator..");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close calculator")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("osascript -e 'quit app " + '"' + "Calculator" + '"' + "'");
				p.waitFor();
				Ai.say("Closing calculator..");
			} catch (Exception ae) {
			}
		}
		// BROWSER
		else if (resultText.equalsIgnoreCase("open Browser")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("open http://www.google.com");
				p.waitFor();
				Ai.say("Opening calculator..");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close Browser")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("kill");
			} catch (Exception ae) {
			}
		}
		// Microsoft Word
		else if (resultText.equalsIgnoreCase("open word")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("open -a 'Microsoft Word'");
			} catch (Exception ae) {
			}
		}
		// Excel
		else if (resultText.equalsIgnoreCase("start Excel")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("open -a 'Microsoft Excel'");
			} catch (Exception ae) {
			}
		}
		// Powerpoint
		else if (resultText.equalsIgnoreCase("start Excel")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("open -a 'Microsoft Powerpoint'");
			} catch (Exception ae) {
			}
		}
		// Facebook
		else if (resultText.equalsIgnoreCase("go to face book")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("open http://www.facebook.com");
			} catch (Exception ae) {
			}
		}
		// Netflix
		else if (resultText.equalsIgnoreCase("open net fix")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("open htttp://www.netflix.com");
			} catch (Exception ae) {
			}
		}
		// google
		else if (resultText.equalsIgnoreCase("go to go girl") | resultText.equalsIgnoreCase("open go girl")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("open htttp://www.google.com");
			} catch (Exception ae) {
			}
		}

	}
}
