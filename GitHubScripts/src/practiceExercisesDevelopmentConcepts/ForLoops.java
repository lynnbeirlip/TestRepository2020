package practiceExercisesDevelopmentConcepts;

public class ForLoops{
	public static void main(String[] args){
		printStars();
	}

	static void printStars(){
		int i, j;
		for (i = 0; i <= 6; i++) {
			for (j = 1; j <= 7 - i; j++) {
				System.out.print("*");
		}
		System.out.println("");
	}
	}
}
