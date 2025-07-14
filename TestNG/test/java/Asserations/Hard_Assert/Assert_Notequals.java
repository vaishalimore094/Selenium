package Hard_assertstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Notequals {
	@Test
	  public void tc1AssertNotequals()
	  {
		 // String s1="velocity";
		 //String s2="velocity1";	        
		 //Assert.assertNotEquals(s1, s2);;//--passed ----bcz not matching s1&s2 
		// Reporter.log("Both are different", true);
		 
		 //or
		 String s1="velocity";
		 String s2="velocity";	        
		 Assert.assertNotEquals(s1, s2 ,"Both are same");;//--failed--bcz matching s1&s2 
		 Reporter.log("Both are different", true);//-------then stuck in 19 n0 and not come 20 line
		 
		 
		 
}
}