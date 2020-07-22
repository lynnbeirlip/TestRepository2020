package practiceExercisesDevelopmentConcepts;

import org.openqa.selenium.Rectangle;

public class SomethingIsWrongCorrected {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	  Rectangle myRect = new Rectangle(0, 0, 0, 0);
	  myRect.width = 40;
      myRect.height = 50;
      int area = myRect.width * myRect.height;
      System.out.println("myRect's area is " + area);
	}

}
