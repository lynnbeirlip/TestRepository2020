package TutorialSelenium;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    printStars();
	}
		
	static void printStars(){
		int i,j;
		for(i=0;i<=6;i++){
			for(j=1;j<=7-i;j++){
				System.out.print("*");
			}
				System.out.println("");
			
    	}
	}
}
