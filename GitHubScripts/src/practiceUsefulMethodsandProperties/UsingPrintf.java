package practiceUsefulMethodsandProperties;

public class UsingPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringVal = "formatting a string";;
		String line1 = "Welcome to";
		String line2 = "Java Programming!";
		int intVal = 5280;
		double pi = Math.PI; //This is the value of pi used in math
				
		//Print the text "Printing a string" and the stringVal variable on the same line and advance to the next line after printing
		System.out.printf("Printing a string: %s\n", stringVal);
		
		//Print the first seven characters of the text "formatting a string" and advance to the next line after printing
		System.out.printf("%10.7s\n", stringVal);
		
		//Print the value of pi as a floating decimal number. Advance to the next line afterwards. 
		System.out.printf("%f%n", pi);       // -->  "3.141593"
	      
		//Print the value of pi as a floating decimal number with only three numbers after the decimal. Round the last number if needed.
		//Advance to the next line after printing
		System.out.printf("%.3f%n", pi);     // -->  "3.142"
		
		//Print the value of pi as a floating decimal number with a 10 character width including 3 places after the decimal. 
		//Advance to the next line after printing
	     System.out.printf("%10.3f%n", pi);   // -->  "     3.142"
		
		//Print "Welcome to Java Programming!" with a line break after the word "to"
		System.out.printf( "%s\n%s\n", line1, line2);
		
		//Print the value of the intVal variable using comma separators for numbers greater than 1,000 
		System.out.printf("The value of i is: %,d%n", intVal);
		
		//Print the value of the intVal variable without including comma separators
		System.out.printf("The value of i is: %d%n", intVal);
		
		//Print the value of the intVal variable using a + sign for positive numbers
		System.out.printf("The value of i is: +%d%n", intVal);
	}
}
