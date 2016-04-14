package demo.sphinx.helloworld;

public class DateAndTime {

	static boolean morning = false;
	static boolean noon = false;
	static boolean evening = false;
	static boolean night = false;

	public static void isDateAndTime(String resultText) {
		{
			if (resultText.equalsIgnoreCase("Good Morning")) {
				try {
					morning = true;
					GetTime.morningCheck();
				} catch (Exception ae) {
				}
			} else if (resultText.equalsIgnoreCase("Good Afternoon")) {
				try {
					noon = true;
					GetTime.noonCheck();
				} catch (Exception ae) {
				}
			} else if (resultText.equalsIgnoreCase("Good Evening")) {
				try {
					evening = true;
					GetTime.eveningCheck();
				} catch (Exception er) {
				}
			} else if (resultText.equalsIgnoreCase("Good Night")) {
				try {
					night = true;
					GetTime.nightCheck();
				} catch (Exception er) {
				}
			} else if (resultText.equalsIgnoreCase("What is the time") || resultText.equalsIgnoreCase("Tell me the time")) {
				try {
					GetTime.getTime();
				} catch (Exception ae) {
				}
			}
		}
	}
}