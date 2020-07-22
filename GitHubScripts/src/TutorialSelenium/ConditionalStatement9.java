package TutorialSelenium;

public class ConditionalStatement9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;
		String mygrade;
		if (score > 90){
		     mygrade = "A";
		}
		else if (score > 80) {
		     mygrade = "B";
		}
		else {
		     mygrade = "C";
		}
		System.out.println("Score is:" + score);
		System.out.println("Grade is:" + mygrade);
		}
}
