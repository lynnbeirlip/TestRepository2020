package TutorialSelenium;

public class Car {
	
	private String make;
	
	public static void main(String[] args){
		
		Car c1 = new Car();
		Car c2 = new Car();

		c1.setMake("Ford");
		c2.setMake("Chevrolet");

		System.out.println("The first car is a " +c1.getMake());
		System.out.println("The second car is a " +c2.getMake());
	}

	public void setMake(String carMake) {
	make = carMake;
	}

	public String getMake() {
	return make;
	}
	
	


}
