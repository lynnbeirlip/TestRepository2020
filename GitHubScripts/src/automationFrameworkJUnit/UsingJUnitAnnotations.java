package automationFrameworkJUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsingJUnitAnnotations {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("This method was executed BEFORE all other methods were run");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("This method was executed AFTER all other methods were run");
	}
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("This method was executed BEFORE each individual @Test method was run");
	}
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("This method was executed AFTER each individual @Test method was run");
	}
	@Test
	void test1() {
		System.out.println("This is the 1st primary test method executed using the @Test annotation");
	}
	@Test
	void test2() {
		System.out.println("This is the 2nd primary test method executed using the @Test annotation");
	}
}
