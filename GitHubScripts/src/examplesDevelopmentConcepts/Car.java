package examplesDevelopmentConcepts;

public class Car {
	private String make;
	int speed;
	int gear;

	public Car() {
	this.speed = 0;
	this.gear = 0;
	System.out.println("Executing constructor without arguments");
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}
}
