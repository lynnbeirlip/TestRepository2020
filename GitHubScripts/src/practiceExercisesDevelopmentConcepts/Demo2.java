package practiceExercisesDevelopmentConcepts;

class Demo2 {
	int value1;
	int value2;

	Demo2() {
		value1 = 10;
		value2 = 20;
		System.out.println("Inside 1st Constructor");
	}

	Demo2(int a) {
		value1 = a;
		System.out.println("Inside 2nd Constructor");
	}

	Demo2(int a, int b) {
		value1 = a;
		value2 = b;
		System.out.println("Inside 3rd Constructor");
	}

	public void display() {
		System.out.println("Value1 === " + value1);
		System.out.println("Value2 === " + value2);
	}

	public static void main(String args[]) {
		Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2(30);
		Demo2 d3 = new Demo2(30, 40);
		d1.display();
		d2.display();
		d3.display();
	}
}
