package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomobileParameters {
	
	@Parameters({"AutomobileName"})
	@Test
	public void testcase1(String name)
	{
		System.out.println(name);
	}

}
