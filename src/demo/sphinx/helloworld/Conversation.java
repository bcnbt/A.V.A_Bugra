package demo.sphinx.helloworld;

public class Conversation {
	public static int hello = 0;

	public static void isConversation(String resultText) {

		if (resultText.equalsIgnoreCase("Hello")) {
			try {
				if (hello % 2 == 0) {
					Ai.say("How can I help?");
				} else if (hello % 2 == 1) {
					Ai.say("Hello" + HelloWorld.user);
				}
				hello++;
			} catch (Exception ae) {
			}
		} else if (resultText.equalsIgnoreCase("log in user sam")){
			try {
				HelloWorld.user = "sam";
				Ai.say("hello sam you are logged in");
			} catch (Exception er) {
			}
		}
		// ARGUMENTS
		else if (resultText.equalsIgnoreCase("shut up")) {
			try {
				Ai.say(HelloWorld.comebacks[HelloWorld.randomInt]);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("you are dumb")) {
			try {
				Ai.say(HelloWorld.comebacks[HelloWorld.randomInt]);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("you are stupid")) {
			try {
				Ai.say(HelloWorld.comebacks[HelloWorld.randomInt]);
			} catch (Exception estop) {
			}
		}
		// COMPLIMENTS
		else if (resultText.equalsIgnoreCase("you are smart")) {
			try {
				Ai.say("thank you but im only getting smarter");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("you are inteligent")) {
			try {
				Ai.say("thank you but im only getting smarter");
			} catch (Exception estop) {
			}
		}

		// hybernate
		else if (resultText.equalsIgnoreCase("Jarvis chill")) {
			try {
				Ai.pause = true;
				Ai.say("holla when you need me");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("jarvis take a break")) {
			try {
				Ai.pause = true;
				Ai.say("okay ill chill");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("Ava chill")) {
			try {
				Ai.pause = true;
				Ai.say("let me know when you need me");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("Ava take a break")) {
			try {
				Ai.pause = true;
				Ai.say("say my name when you need me");
			} catch (Exception estop) {
			}
		}
		// SHUT DOWN
		else if (resultText.equalsIgnoreCase("jarvis go to sleep")) {
			try {
				Ai.say("goodnight sir");
				System.exit(0);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("go to sleep")) {
			try {
				Ai.say("goodnight sir");
				System.exit(0);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("ava go to sleep")) {
			try {
				Ai.say("goodnight sir");
				System.exit(0);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("ava sleep")) {
			try {
				Ai.say("goodnight sir");
				System.exit(0);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("shut down")) {
			try {
				Ai.say("goodnight sir");
				System.exit(0);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("Ava go to sleep")) {
			try {
				Ai.say("goodnight sir");
				System.exit(0);
			} catch (Exception estop) {
			}
		}
	}
}