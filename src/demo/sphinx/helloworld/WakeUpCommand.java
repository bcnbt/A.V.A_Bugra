package demo.sphinx.helloworld;

public class WakeUpCommand {
	
	public static void IsWakeUpCommand(String resultText) {

		if (resultText.equalsIgnoreCase("jarvis I need your help")) {
			try {
				Ai.pause = false;
				System.out.print("What can i help with?");
				//greeting
				Ai.say("what can i help with");
				//System.exit(0);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("jarvis wake up")) {
			try {
				Ai.pause = false;
				System.out.print("What can i help with?");
				//greeting
				Ai.say("what can i help with");
				//System.exit(0);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("jarvis play")) {
			try {
				Ai.pause = false;
				System.out.print("What can i help with?");
				//greeting
				Ai.say("what can i help with");
				//System.exit(0);
			} catch (Exception estop) {
			}
		}else if (resultText.equalsIgnoreCase("ava wake up")) {
			try {
				Ai.pause = false;
				System.out.print("What can i help with?");
				//greeting
				Ai.say("what can i help with");
				//System.exit(0);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("ava play")) {
			try {
				Ai.pause = false;
				System.out.print("What can i help with?");
				//greeting
				Ai.say("what can i help with");
				//System.exit(0);
			} catch (Exception estop) {
			}
		}else if (resultText.equalsIgnoreCase("ava I need your help")) {
			try {
				Ai.pause = false;
				System.out.print("What can i help with?");
				//greeting
				Ai.say("what can i help with");
				//System.exit(0);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("ava")) {
			try {
				Ai.pause = false;
				System.out.print("What can I do");
				//greeting
				Ai.say("What can I do");
				//System.exit(0);
			} catch (Exception estop) {
			}
		} 
	}
}
