package practiceUsefulMethodsandProperties;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UsingSetsPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashString = new HashSet<String>();
		hashString.add("One");
		hashString.add("Two");
		hashString.add("Three");
		hashString.add("Four");
		hashString.add("Two");
		System.out.println("The elements in the HashSet are: " + hashString);
		
		LinkedHashSet<String> linkedHashString = new LinkedHashSet<String>();
		linkedHashString.add("One");
		linkedHashString.add("Three");
		linkedHashString.add("Two");
		linkedHashString.add("Four");
		System.out.println("The elements in the LinkedHashSet are: " + linkedHashString);
		
		TreeSet<String> treeSetString = new TreeSet<String>();
        treeSetString.add("one");
        treeSetString.add("two");
        treeSetString.add("three");
        System.out.println("The elements in the TreeSet are: " + treeSetString);
        System.out.println("The size of the TreeSet is: "+treeSetString.size());            
       
		}
	}
	

