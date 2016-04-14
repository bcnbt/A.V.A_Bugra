package demo.sphinx.helloworld;

public class WinCommands {

	public static void isCommand(String resultText) {
		// Command prompt
		if (resultText.equalsIgnoreCase("open command"))

		{
			try {
				Process p;
				p = Runtime.getRuntime().exec("");
			} catch (Exception er) {
			}
		} else if (resultText.equalsIgnoreCase("close command"))

		{
			try {
				Process p;
				p = Runtime.getRuntime().exec("");
			} catch (Exception ae) {
			}
		}
		// Calculator
		else if (resultText.equalsIgnoreCase("open calculator")) {// open
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start calc");
				p.waitFor();
				Ai.say("Opening calculator..");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close calculator")) { // close
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskkill /im calc.exe /f");
			} catch (Exception ae) {
			}
		}
		// Paint
		else if (resultText.equalsIgnoreCase("open paint"))

		{
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start mspaint");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close paint")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskkill /im mspaint.exe /f");
			} catch (Exception ae) {
			}
		}
		// Browser
		else if (resultText.equalsIgnoreCase("open Browser")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start chrome.exe");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close Browser")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskkill /im chrome.exe /f");
			} catch (Exception ae) {
			}
		}
		// Microsoft Word
		else if (resultText.equalsIgnoreCase("open word")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start winword");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close word")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskkill /im winword.exe /f");
			} catch (Exception ae) {
			}
		}
		// Excel
		else if (resultText.equalsIgnoreCase("start Excel")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start excel");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("stop Excel")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskkill /im excel.exe /f");
			} catch (Exception ae) {
			}
		}
		// Powerpoint
		else if (resultText.equalsIgnoreCase("start Excel")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start Powerpoint");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("stop powerpoint")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskkill /im excel.exe /f");
			} catch (Exception ae) {
			}
		}
		// Word Pad
		else if (resultText.equalsIgnoreCase("start word pad")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c  write");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("stop word pad")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c  start taskkill /im wordpad.exe /f");
			} catch (Exception ae) {
			}
		}
		// Firewall
		else if (resultText.equalsIgnoreCase("start firewall")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start firewall.cpl");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("stop fire wall")) {
			try {
				Process p;
				String status = "status eq Windows Firewall";
				p = Runtime.getRuntime().exec("cmd /c taskkill /f /fi " + status);
			} catch (Exception ae) {
			}
		}

		// Access
		else if (resultText.equalsIgnoreCase("open Access"))

		{
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start msaccess");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close access"))

		{
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskkill /im msaccess.exe /f");
			} catch (Exception ae) {
			}
		}

		// Device Manager
		else if (resultText.equalsIgnoreCase("open device Manager"))

		{
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start devmgmt.msc");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close device manager")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskkill /im devmgmt.msc /f");
			} catch (Exception ae) {
			}
		}
		// Task Manager
		else if (resultText.equalsIgnoreCase("open task manager")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskmgr.exe");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close task manager")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskkill /im taskmgr.exe /f");
			} catch (Exception ae) {
			}
		} // Facebook
		else if (resultText.equalsIgnoreCase("go to face book")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start chrome www.facebook.com");
			} catch (Exception ae) {
			}
		}
		// Netflix
		else if (resultText.equalsIgnoreCase("open net fix")) {
			try {
				// recognizer.wait();
				Ai.say("opening netflix");
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start Firefox www.netflix.com");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("go to net fix")) {
			try {
				// recognizer.wait();
				Ai.say("opening net flix");
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start Firefox www.netflix.com");
			} catch (Exception ae) {
			}
		}
		// google
		else if (resultText.equalsIgnoreCase("go to go girl") | resultText.equalsIgnoreCase("open go girl")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start chrome www.google.com");
			} catch (Exception ae) {
			}
		}
		// mail
		else if (resultText.equalsIgnoreCase("go to mail")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start chrome https://mail.google.com");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("close mail")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start taskkill /im chrome https://mail.google.com /f");
			} catch (Exception ae) {
			}
		}
		// Miscelaneons
		else if (resultText.equalsIgnoreCase("Program")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start appwiz.cpl");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("Control")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c control");
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("start photo shop")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start photoshop");

			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("Adobe")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec("cmd /c start acrord32.exe");
			} catch (Exception ae) {
			}
		}
	}
}
