package TestNGPracticeExercises;

import org.testng.annotations.*;

public class DependOnMethods {
    @Test(dependsOnMethods = { "testTwo", "testThree" })
    public void testOne() {
        System.out.println("Test method one");
    }
 
    @Test
    public void testTwo() {
        System.out.println("Test method two");
    }
 
    @Test
    public void testThree() {
        System.out.println("Test method three");
    }
}
