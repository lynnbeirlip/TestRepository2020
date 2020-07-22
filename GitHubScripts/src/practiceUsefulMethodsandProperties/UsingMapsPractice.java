package practiceUsefulMethodsandProperties;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class UsingMapsPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hashmapString = new HashMap<String, String>();
		hashmapString.put("1", "Blue");
		hashmapString.put("2", "Green");
		hashmapString.put("3", "Red");
		hashmapString.put("4", "Yellow");
		hashmapString.put("1", "Pink");
		System.out.println("The pairs in the HashMap are: " + hashmapString);
		
		LinkedHashMap<String,String> lhmapString = new LinkedHashMap<String, String>();
		lhmapString.put("1", "One"); 
		lhmapString.put("2", "Two");
		lhmapString.put("8", "Eight");
		lhmapString.put("4", "Four");
		
		System.out.println("The pairs in the LinkedHashMap are: " + lhmapString);
		
		TreeMap<String, String> treeMapString = new TreeMap<String, String>();
        treeMapString.put("1", "One");
        treeMapString.put("4", "Four");
        treeMapString.put("2", "Two");
        treeMapString.put("8", "Eight");
        System.out.println("The pairs in the TreeMap are: " + treeMapString);
        System.out.println("The size of the TreeMap is: "+treeMapString.size());       
        
	}
	}
	

