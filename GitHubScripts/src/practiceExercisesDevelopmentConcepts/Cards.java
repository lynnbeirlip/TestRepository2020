package practiceExercisesDevelopmentConcepts;

class Cards {
	String suit = "clubs";

	Cards(String suit) {
		this.suit = suit;
	}

	public void display() {
		System.out.println("The current suit is: " + suit);
	}

	public static void main(String args[]) {
		Cards c1 = new Cards("hearts");
		Cards c2 = new Cards("clubs");
		Cards c3 = new Cards("diamonds");
		c1.display();
		c2.display();
		c3.display();
	}
}
