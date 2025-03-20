package testNg;

import org.testng.annotations.Test;

public class Part07_Grouping_groups_String {

	@Test(groups = {"Moto"})
	public void Moto1()
	{
		System.out.println("Moto 1 mobile");
	}
	@Test(groups = {"Moto"})
	public void Moto2()
	{
		System.out.println("Moto 2 mobile");
	}
	@Test(groups = {"Vivo"})
	public void Vivo1()
	{
		System.out.println("Vivo 1 mobile");
	}
	@Test(groups = {"Vivo"})
	public void Vivo2()
	{
		System.out.println("Vivo 2 mobile");
	}
	@Test(groups = {"Apple"})
	public void Apple1()
	{
		System.out.println("Apple 1 mobile");
	}
	@Test(groups = {"Apple"})
	public void Apple2()
	{
		System.out.println("Apple 2 mobile");
	}
	@Test(groups = {"Redmi"})
	public void Redmi1()
	{
		System.out.println("Redmi 1 mobile");
	}
	@Test(groups = {"Redmi"})
	public void Redmi2()
	{
		System.out.println("Redmi 2 mobile");
	}
}
