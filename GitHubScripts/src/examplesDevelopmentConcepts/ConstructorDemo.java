package examplesDevelopmentConcepts;

import examplesDevelopmentConcepts.Car;;

public class ConstructorDemo {

		public static void main(String[] args) {
		Car c1 = new Car();

		c1.setMake("BMW");
		System.out.println(c1.getMake());

		System.out.println(c1.speed);
		System.out.println(c1.gear);

		}


}
