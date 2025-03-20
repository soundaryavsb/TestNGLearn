package testNg;

import org.testng.annotations.Test;

public class Part04_DependanciesManagement_dependsOnMethods {

	@Test(enabled = true)
	public void HighSchool()
	{
		System.out.println("Completed High School");
	}
	
	@Test(dependsOnMethods = "HighSchool")
	public void HigherSecondary()
	{
		System.out.println("Completed Higher Secondary");
	}
	
	@Test(dependsOnMethods="HigherSecondary")
	public void Engineering()
	{
		System.out.println("Completed Engineering");
	}
}
