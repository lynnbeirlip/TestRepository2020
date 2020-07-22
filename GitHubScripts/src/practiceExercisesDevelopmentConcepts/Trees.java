package practiceExercisesDevelopmentConcepts;

class Trees {
	String tree = "elm";
		
	Trees(String tree) {
		this.tree = tree;
	}	
	
	public void display() {
		System.out.println("This tree is: " + tree);
	}
		
	public static void main (String args[]) {
		Trees t1 = new Trees("maple");
		Trees t2 = new Trees("oak");
		Trees t3 = new Trees("elm");
		t1.display();
		t2.display();
		t3.display();
	}

}
