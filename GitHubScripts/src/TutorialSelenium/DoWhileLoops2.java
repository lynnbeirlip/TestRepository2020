package TutorialSelenium;

public class DoWhileLoops2 {
	public static void main(String[] args) {
		int i = 10;
		while (i < 10) {
			i++;
			if (i == 17) {
				continue;
			}
			System.out.println("Value of i" + i);
		}
		System.out.println("Outside loop...");
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
	}
}
