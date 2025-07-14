package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomobileParameter2 {
	@Parameters({"Softwarecampanyname"})
	@Test
	public void testcase1(String name)
	{
		System.out.println(name);
	}

}


