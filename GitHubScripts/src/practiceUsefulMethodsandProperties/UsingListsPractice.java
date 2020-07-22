package practiceUsefulMethodsandProperties;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingListsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listString = new ArrayList<String>();
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		System.out.println("The values in the original array list are: " + listString);
		listString.add(1, "Nine");
		System.out.println("The values in the revised array list are: " + listString);
		listString.remove(1);
		System.out.println("The values in the final array list are: " + listString);
		
		List<String> linkedListString = new LinkedList<String>();
		linkedListString.add("Five");
		linkedListString.add("Six");
		linkedListString.add("Seven");
		linkedListString.add("Eight");
		System.out.println("The values in the original linked list are: " + linkedListString);
		linkedListString.add(1, "Ten");
		System.out.println("The values in the revised linked list are: " + linkedListString);
		
		}
	}
	

