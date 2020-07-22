package practiceExercisesDevelopmentConcepts;

public class DoWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookSeats();
	}

	static void bookSeats() {
		int a = 0;
		int w = 0;
		for (w = 0; w <= 4 - a; w++) {
			System.out.println("There are " + (4 - w) + " window seats left.");
		}
		for (a = 0; a <= 4; a++) {
			System.out.println("There are " + (4 - a) + " aisle seats left.");

		}
		int totalSeats = (a - 1) + (w - 1);
		System.out.println("There have been a total of " + totalSeats + " passengers booked.");
	}
}
