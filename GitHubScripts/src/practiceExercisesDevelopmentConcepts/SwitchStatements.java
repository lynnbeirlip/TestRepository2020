package practiceExercisesDevelopmentConcepts;

public class SwitchStatements {
	public static void main(String[] args) {

		int birth_year = 1966;
		switch (birth_year) {
		case 1920:
			System.out.println("You are from the greatest generation!");
			break;
		case 1930:
			System.out.println("You are from the silent generation!");
			break;
		case 1950:
			System.out.println("You are a Baby Boomer!");
			break;
		case 1970:
			System.out.println("You are a GenXer!");
		case 1990:
			System.out.println("You are a Millenial!");
			break;
		case 2010:
			System.out.println("You are a GenZer!");
			break;
		default:
			System.out.println("You can be whatever you want!");
		}
		System.out.println("You were born in a great year: " + birth_year);

	}
}
