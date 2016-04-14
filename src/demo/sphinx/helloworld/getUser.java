package demo.sphinx.helloworld;

public class getUser {
	static String user;
	static boolean userFound;
	static int count;

	public static void getUsername(String resultText) {

		if (resultText.equalsIgnoreCase("Log in")) {
			try {
				count = 1;
				Ai.say("What is your login?");
			} catch (Exception ae) {
			}
		}
		if (resultText.equalsIgnoreCase("Jarvis") && count > 0) {
			user = "Jarvis";
			Ai.say("Okay, Jarvis");
		}
		if (resultText.equalsIgnoreCase("Ava") && count > 0) {
			try {
				userFound = true;
				user = "Ava";
				Ai.say("Okay, Ava");
			} catch (Exception estop) {
			}
		}
	}
}