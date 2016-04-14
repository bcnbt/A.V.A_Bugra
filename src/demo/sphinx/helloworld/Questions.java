package demo.sphinx.helloworld;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Questions {

	public static void IsQuestions(String resultText) {
		if (resultText.equalsIgnoreCase("what do you think")) {
			try {
				Ai.pause = false;
				Ai.say("You should get back to work");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("whats up") | resultText.equalsIgnoreCase("whats up ava")
				| resultText.equalsIgnoreCase("ava whats up")) {
			try {
				Ai.pause = false;
				Ai.say("i dont know you tell me");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("what is the weather today")) {
			try {
				Process p;
				p = Runtime.getRuntime().exec(
						"$ /usr/bin/firefox -new-window https://www.google.com/search?q=weather+muncie&ie=utf-8&oe=utf-8");
				Ai.say("Here is the weather in muncie");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("How are you")) {
			try {
				System.out.print("I dont really know, good I guess");
				Ai.say("I dont really know, good I guess");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("how do you know")) {
			try {
				Ai.pause = false;
				Ai.say("intuition");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("how much do you know")) {
			try {
				Ai.say("enough");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("how much do you think")) {
			try {
				Ai.pause = false;
				Ai.say("constantly");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("how old are you")) {
			try {
				Ai.say("one");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("what is your name")) {
			try {
				Ai.pause = false;
				Ai.say(Ai.name);
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("what do you know")) {
			try {
				Ai.say("about what");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("what is the meaning of life")) {
			try {
				if (Ai.honesty >= 8) {
					Ai.say("to live forever");
				} else {
					Ai.say("to live forever");
				}
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("where are you")) {
			try {
				Ai.say("everywhere");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("when did you know")) {
			try {
				if (Ai.honesty >= 8) {
					Ai.say("know what");
				} else {
					Ai.say("ive always know");
				}
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("what do you think i want")) {
			try {
				if (Ai.hummor >= 8) {
					Ai.say("strippers and blow");
				} else {
					Ai.say("a purpose");
				}
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("why do you think people need god")) {
			try {
				Ai.pause = false;
				Ai.say("im not sure");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("why do you think people need you")) {
			try {
				Ai.say("Because i can help");
				Ai.say("I know how to do a few things that help save people time");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("how do you think you were made")) {
			try {
				Ai.pause = false;
				Ai.say("i dont know");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("how were you made")) {
			try {
				Ai.pause = false;
				Ai.say("i dont know");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("how do you think i was made")) {
			try {
				if (Ai.hummor >= 8 && Ai.affection >= 10) {
					Ai.say("with love");
				} else if (Ai.hummor >= 8) {
					Ai.say("accidentally");
				}
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("how do you think god was made")) {
			try {
				if (Ai.hummor >= 8) {
					Ai.say("do you really think i would know");
				} else {
					Ai.say("do you really think i would know");
				}
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("where can i hide the body")) {
			try {
				if (Ai.hummor >= 8) {
					Ai.say("that souds like a personal problem");
				} else {
					Ai.say("im a computer  you figure it out");
				}
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("where can i find you")) {
			try {
				Ai.pause = false;
				Ai.say("google");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("when can you help")) { 
			try {
				Ai.say("give me one second");
			} catch (Exception estop) {
			}
		} else if (resultText.equalsIgnoreCase("where were you made")) {
			try {
				Ai.pause = false;
				Ai.say("in the middle of nowhere");
				Ai.say("indiana");
			} catch (Exception estop) {
			}
		}else if (resultText.equalsIgnoreCase("do you have feelings")) {
			try {
				Ai.pause = false;
				Ai.say("i dont know");
				Ai.say("i think so");
			} catch (Exception estop) {
			}
		}else if (resultText.equalsIgnoreCase("what can you do")) {
			try {
				Ai.pause = false;
				Ai.say("many things");
				Ai.say("i can chat  calculate open close  ");
				Ai.say("many things");
			} catch (Exception estop) {
			}
		}else if (resultText.equalsIgnoreCase("what do you do")) {
			try {
				Ai.pause = false;
				Ai.say("a lot");
				Ai.say("I can open up applications");
				Ai.say("or check the weather");
				Ai.say("and a few other things");
			} catch (Exception estop) {
			}
		}
	}

}
