package examplesDevelopmentConcepts;

public class TwoDArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] names = {
	            {"Mr. ", "Mrs. ", "Ms. "},
	            {"Baker", "Campbell", "Jones", "Smith"}
		};
		
		// Print “Mr. Baker”
	            System.out.println(names[0][0] + names[1][0]);
	    // Print “Ms. Jones”
	            System.out.println(names[0][2] + names[1][2]);

		}
	}

