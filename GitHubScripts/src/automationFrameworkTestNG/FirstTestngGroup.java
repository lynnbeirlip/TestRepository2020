package automationFrameworkTestNG;

import org.testng.annotations.Test;

public class FirstTestngGroup {
	@Test (groups = { "Car" })
	 public void Car1() {
	      System.out.println("Group Car - Test car 1");
	 }
	 @Test (groups = { "Car" })
	 public void Car2() {
	      System.out.println("Group Car - Test car 2");
	 }
	 @Test (groups = { "Scooter" })
	 public void Scooter1() {
	      System.out.println("Group Scooter - Test scooter 1");
	 }
	 @Test (groups = { "Scooter" })
	 public void Scooter2() {
	      System.out.println("Group Scooter - Test scooter 2");
	 }
	 @Test (groups = { "Car", "Sedan Car" })
	 public void Sedan1() {
	      System.out.println("Group Sedan Car - Test sedan 1");
	 }
}
