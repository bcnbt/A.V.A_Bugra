package demo.sphinx.helloworld;

public class getOS {
	static String os = System.getProperty("os.name");
	static boolean osIdentified = false;

	static void identify() {
		Ai.sayOS("Operating System: " + os);

		if (os.contains("Mac")) {
			Ai.sayOS("You are using a Mac!");
			HelloWorld.OS = "Mac";
			osIdentified = true;

		} else if (os.contains("Windows")) {
			Ai.sayOS("You are using a Windows!");
			HelloWorld.OS = "Windows";
			osIdentified = true;

		} else if (os.contains("Linux")) {
			Ai.sayOS("You are using a Linux computer!");
			osIdentified = true;
			HelloWorld.OS = "Linux";
		}
	}

	public static void main(String[] args) {
		identify();
	}
}
