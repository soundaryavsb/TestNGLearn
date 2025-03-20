package testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Part08_Parameterization_parameters_annotation_name_value {

	@Test
	@Parameters("Name")
	public void printName(String Personname)
	{
		System.out.println("Name is "+Personname);
	}
}
