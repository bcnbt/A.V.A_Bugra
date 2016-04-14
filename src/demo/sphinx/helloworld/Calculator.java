package demo.sphinx.helloworld;

public class Calculator {

	public static int numb1 = 0;
	public static int numb2 = 0;
	public static boolean times = false;
	public static boolean dividedBy = false;
	public static boolean plus = false;
	public static boolean minus = false;

	public static void isfunction(String resultText) {

		String phrase = resultText;
		String delims = "[ ]+";
		String[] tokens = phrase.split(delims);
		String newResultText = "";
		int keyword = tokens.length - 1;
		// System.out.print(tokens.length);
		// System.out.print(keyword);
		// System.out.print(tokens[tokens.length - 1]);
		if (tokens.length == 5) {
			// System.out.print(tokens[0]);
			if (tokens[0].contentEquals("what") || tokens[1].contentEquals("is")) {
				String first = tokens[2];
				String second = tokens[3];
				String third = tokens[4];

				getFirstNumber(tokens[2]);
				getFirstNumber(tokens[3]);
				getSecondNumber(tokens[4]);

				if (times == true) {
					System.out.print(numb1);
					System.out.print(" * " + numb2 + " = ");
					int ans = numb1 * numb2;
					System.out.print(ans);
					String strAns = Integer.toString(ans);
					Ai.say(strAns);
					times = false;
				}
				if (dividedBy == true) {
					int ans = numb1 / numb2;
					System.out.print(numb1);
					System.out.print(" / " + numb2 + " = ");
					System.out.print(ans);
					String strAns = Integer.toString(ans);
					Ai.say(strAns);
					dividedBy = false;
				}
				if (minus == true) {
					int ans = numb1 - numb2;
					System.out.print(numb1);
					System.out.print(" - " + numb2 + " = ");
					System.out.print(ans);
					String strAns = Integer.toString(ans);
					Ai.say(strAns);
					minus = false;
				}
				if (plus == true) {
					int ans = numb1 + numb2;
					System.out.print(numb1);
					System.out.print(" + " + numb2 + " = ");
					System.out.print(ans);
					String strAns = Integer.toString(ans);
					Ai.say(strAns);
					plus = false;
				}
			}
		}
		if (tokens.length == 6) {
			if (tokens[0].contentEquals("what") || tokens[1].contentEquals("is")) {
				String first = tokens[2];
				String second = tokens[3];
				String third = tokens[4];
				String fourth = tokens[5];

				getFirstNumber(tokens[2]);
				int numb1P1I = numb1;
				getFirstNumber(tokens[3]);
				if (dividedBy == true || times == true || plus == true || minus == true) {
					getSecondNumber(tokens[4]);
					int numb2P1I = numb2;
					getSecondNumber(tokens[5]);
					numb2 = numb2 + numb2P1I;
				} else {
					numb1 = numb1 + numb1P1I;
					getSecondNumber(tokens[4]);
					getSecondNumber(tokens[5]);
				}

				if (times == true) {
					System.out.print(numb1);
					System.out.print(" * " + numb2 + " = ");
					int ans = numb1 * numb2;
					System.out.print(ans);
					String strAns = Integer.toString(ans);
					Ai.say(strAns);
					times = false;
				}
				if (dividedBy == true) {
					int ans = numb1 / numb2;
					System.out.print(numb1);
					System.out.print(" / " + numb2 + " = ");
					System.out.print(ans);
					String strAns = Integer.toString(ans);
					Ai.say(strAns);
					dividedBy = false;
				}
				if (minus == true) {
					int ans = numb1 - numb2;
					System.out.print(numb1);
					System.out.print(" - " + numb2 + " = ");
					System.out.print(ans);
					String strAns = Integer.toString(ans);
					Ai.say(strAns);
					minus = false;
				}
				if (plus == true) {
					int ans = numb1 + numb2;
					System.out.print(numb1);
					System.out.print(" + " + numb2 + " = ");
					System.out.print(ans);
					String strAns = Integer.toString(ans);
					Ai.say(strAns);
					plus = false;
				}
			}
		}

		if (tokens.length == 7) {
			String first = tokens[2];
			String second = tokens[3];
			String third = tokens[4];
			String fourth = tokens[5];
			String fifth = tokens[6];
		}
		if (tokens.length == 8) {
			String first = tokens[2];
			String second = tokens[3];
			String third = tokens[4];
			String fourth = tokens[5];
			String fifth = tokens[6];
			String sixth = tokens[7];
		}
	}

	public static void getFirstNumber(String tempNum) {

		if (tempNum.contains("one")) {
			numb1 = 1;
		} else if (tempNum.contains("two")) {
			numb1 = 2;
		} else if (tempNum.contains("three")) {
			numb1 = 3;
		} else if (tempNum.contains("four")) {
			numb1 = 4;
		} else if (tempNum.contains("five")) {
			numb1 = 5;
		} else if (tempNum.contains("six")) {
			numb1 = 6;
		} else if (tempNum.contains("seven")) {
			numb1 = 7;
		} else if (tempNum.contains("eight")) {
			numb1 = 8;
		} else if (tempNum.contains("nine")) {
			numb1 = 9;
		} else if (tempNum.contains("ten")) {
			numb1 = 10;
		} else if (tempNum.contains("eleven")) {
			numb1 = 11;
		} else if (tempNum.contains("twelve")) {
			numb1 = 12;
		} else if (tempNum.contains("thirteen")) {
			numb1 = 13;
		} else if (tempNum.contains("fourteen")) {
			numb1 = 14;
		} else if (tempNum.contains("fifteen")) {
			numb1 = 15;
		} else if (tempNum.contains("sixteen")) {
			numb1 = 16;
		} else if (tempNum.contains("seventeen")) {
			numb1 = 17;
		} else if (tempNum.contains("eighteen")) {
			numb1 = 18;
		} else if (tempNum.contains("nineteen")) {
			numb1 = 19;
		} else if (tempNum.contains("twenty")) {
			numb1 = 20;
		} else if (tempNum.contains("thirty")) {
			numb1 = 30;
		} else if (tempNum.contains("fourty")) {
			numb1 = 40;
		} else if (tempNum.contains("fifty")) {
			numb1 = 50;
		} else if (tempNum.contains("sixty")) {
			numb1 = 60;
		} else if (tempNum.contains("seventy")) {
			numb1 = 70;
		} else if (tempNum.contains("eighty")) {
			numb1 = 80;
		} else if (tempNum.contains("ninty")) {
			numb1 = 90;
		} else if (tempNum.contains("times")) {
			times = true;
		} else if (tempNum.contains("minus")) {
			minus = true;
		} else if (tempNum.contains("plus")) {
			plus = true;
		} else if (tempNum.contains("divided")) {
			dividedBy = true;
		}
	}

	public static void getSecondNumber(String tempSecondNum) {

		if (tempSecondNum.contains("one")) {
			numb2 = 1;
		} else if (tempSecondNum.contains("two")) {
			numb2 = 2;
		} else if (tempSecondNum.contains("three")) {
			numb2 = 3;
		} else if (tempSecondNum.contains("four")) {
			numb2 = 4;
		} else if (tempSecondNum.contains("five")) {
			numb2 = 5;
		} else if (tempSecondNum.contains("six")) {
			numb2 = 6;
		} else if (tempSecondNum.contains("seven")) {
			numb2 = 7;
		} else if (tempSecondNum.contains("eight")) {
			numb2 = 8;
		} else if (tempSecondNum.contains("nine")) {
			numb2 = 9;
		} else if (tempSecondNum.contains("ten")) {
			numb2 = 10;
		} else if (tempSecondNum.contains("eleven")) {
			numb2 = 11;
		} else if (tempSecondNum.contains("twelve")) {
			numb2 = 12;
		} else if (tempSecondNum.contains("thirteen")) {
			numb2 = 13;
		} else if (tempSecondNum.contains("fourteen")) {
			numb2 = 14;
		} else if (tempSecondNum.contains("fifteen")) {
			numb2 = 15;
		} else if (tempSecondNum.contains("sixteen")) {
			numb2 = 16;
		} else if (tempSecondNum.contains("seventeen")) {
			numb2 = 17;
		} else if (tempSecondNum.contains("eighteen")) {
			numb2 = 18;
		} else if (tempSecondNum.contains("nineteen")) {
			numb2 = 19;
		} else if (tempSecondNum.contains("twenty")) {
			numb2 = 20;
		} else if (tempSecondNum.contains("thirty")) {
			numb2 = 30;
		} else if (tempSecondNum.contains("fourty")) {
			numb2 = 40;
		} else if (tempSecondNum.contains("fifty")) {
			numb2 = 50;
		} else if (tempSecondNum.contains("sixty")) {
			numb2 = 60;
		} else if (tempSecondNum.contains("seventy")) {
			numb2 = 70;
		} else if (tempSecondNum.contains("eighty")) {
			numb2 = 80;
		} else if (tempSecondNum.contains("ninty")) {
			numb2 = 90;
		} else if (tempSecondNum.contains("times")) {
			times = true;
		} else if (tempSecondNum.contains("minus")) {
			minus = true;
		} else if (tempSecondNum.contains("plus")) {
			plus = true;
		} else if (tempSecondNum.contains("divided")) {
			dividedBy = true;
		}
	}
}
