package TutorialSelenium;

public class WhileLoops3 {
	public static void main(String[] args) {
		int i = 10;
		while (i < 20) {
			i++;
			if (i == 17) {
				continue;
			}
			System.out.println("Value of I is " + i);
		}
		System.out.println("Outside loop...");
	}

}
