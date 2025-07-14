package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterdemo {
	@Test
	@Parameters({"i","j"})
	public void add(int a, int b)
	{
		System.out.println("Add"+a+b);
	}
	@Test
	@Parameters({"i","j"})
	public void sub(int a, int b)
	{
		System.out.println("substraction"+( a-b));
	}
	@Test
	@Parameters({"i","j"})
	public void mul(int a, int b)
	{
		System.out.println("mul"+a*b);
	}

}
