package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Part10_Assertions_Assert_Mean_likeIfElse {

	String name="agni";
	boolean valueTrue=true;
	boolean valuefalse=false;

	@Test
	public void checkEqual()
	{
	Assert.assertEquals(name, "agni");	
	}
	
	@Test
	public void CheckNotEqual()
	{
		Assert.assertNotEquals(name, "Agni");
	}
	
	@Test
	public void CheckTrue()
	{
		Assert.assertTrue(valueTrue, "The value is true");
	}
	
	@Test
	public void CheckFalse()
	{
		Assert.assertFalse(valuefalse, "The value is false");
	}
}
