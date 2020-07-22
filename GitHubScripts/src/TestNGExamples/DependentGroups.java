package TestNGExamples;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import TestNGExamples.MessageUtil;

public class DependentGroups {
	String message = "Manisha";
	MessageUtil messageUtil = new MessageUtil(message);
	
    @Test (groups = { "init" })
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        message = "Manisha";
        AssertJUnit.assertEquals(message, messageUtil.printMessage());
    }
 
    @Test (dependsOnGroups = {  "init.*"  })
    public void testSalutationMessage() {
    	message = "Hi!" + "Manisha";
    	System.out.println(message);
    	AssertJUnit.assertEquals(message, messageUtil.salutationMessage());
    }
 
    @Test(groups = {  "init"  })
    public void initEnvironmentTest() {
        System.out.println("This is initEnvironmentTest()");
    }
}