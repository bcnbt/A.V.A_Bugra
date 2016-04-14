package demo.sphinx.helloworld;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class GetTime {

	private static String HOUR_FORMAT = "HH:mm";
	static String currentDate = "It's " + GetTime.getCurrentHour();
	static String target = GetTime.getCurrentHour();
	static String morningStart = "08:00";
	static String morningEnd = "12:00";
	static String noonStart = "12:00";
	static String noonEnd = "17:00";
	static String eveningStart = "17:00";
	static String eveningEnd = "20:00";
	static String nightStart = "20:00";
	static String nightEnd = "24:00";

	static boolean isMorning = false;
	static boolean isNoon = false;
	static boolean isEvening = false;
	static boolean isNight = false;

	private GetTime() {
	}

	public static String getCurrentHour() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdfHour = new SimpleDateFormat(HOUR_FORMAT);
		String hour = sdfHour.format(cal.getTime());
		return hour;
	}

	static void morningCheck() {
		if ((target.compareTo(morningStart) >= 0) && (target.compareTo(morningEnd) <= 0)) {
			isMorning = true;
		}
		if (isMorning == true && DateAndTime.morning == true) {
			Ai.say("Good Morning to you too " + HelloWorld.user + "\n" + GetTime.currentDate);
		} else if (isMorning == true && DateAndTime.morning == false) {
			Ai.say("It's currently morning " + HelloWorld.user + "\n" + GetTime.currentDate);
		} else
			noonCheck();
	}

	static void noonCheck() {
		if ((target.compareTo(noonStart) >= 0) && (target.compareTo(noonEnd) <= 0)) {
			isNoon = true;
		}
		if (isNoon == true && DateAndTime.noon == true) {
			Ai.say("Good Afternoon to you as well " + HelloWorld.user + "\n" + GetTime.currentDate);
		} else if (isNoon == true && DateAndTime.noon == false) {
			Ai.say("It's currently afternoon " + HelloWorld.user + "\n" + GetTime.currentDate);
		} else
			eveningCheck();
	}

	static void eveningCheck() {
		if ((target.compareTo(eveningStart) >= 0) && (target.compareTo(eveningEnd) <= 0)) {
			isEvening = true;
		}
		if (isEvening == true && DateAndTime.evening == true) {
			Ai.say("Good Evening to you too " + HelloWorld.user + "\n" + GetTime.currentDate);
		} else if (isEvening == true && DateAndTime.evening == false) {
			Ai.say("It's currently evening " + HelloWorld.user + "\n" + GetTime.currentDate);
			Ai.say(GetTime.currentDate);
		} else
			nightCheck();
	}

	static void nightCheck() {
		if ((target.compareTo(nightStart) >= 0) && (target.compareTo(nightEnd) <= 0)) {
			isNight = true;
		}
		if (isNight == true && DateAndTime.night == true) {
			Ai.say("Good Night to you as well " + HelloWorld.user + "\n" + GetTime.currentDate);
		} else if (isNight == true && DateAndTime.night == false) {
			Ai.say("It's currently night time " + HelloWorld.user + "\n" + GetTime.currentDate);
		} else
			morningCheck();
	}

	static void getTime() throws InterruptedException {
		// compare();
		Ai.say(currentDate);
		Thread.sleep(4000);
	}

}