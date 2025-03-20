package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Part11_Annotations {
  @Test
  public void function1() {
	  System.out.println("I'm function 1");
  }
  @Test
  public void function2() {
	  System.out.println("I'm function 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I'm Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I'm After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I'm Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I'm After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I'm Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I'm After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I'm Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I'm After Suit");
  }

}
