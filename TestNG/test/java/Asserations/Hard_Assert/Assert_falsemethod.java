package Hard_assertstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_falsemethod {
	@Test
	  public void Assert_false() {
		// boolean result = false;
		 // Assert.assertFalse(result, "result is false");//------------is is false then passed then run this script
		 // Reporter.log("result is true", true);//------is true then pass otherwise stuck in line no 11
		  
		  //--------------or-----------
		 
			 boolean result = true;
			  Assert.assertFalse(result, "result is false");//----failed bcz then stuck in this line
			  Reporter.log("result is true", true);//--true thats why run line no 18
			  
			  
	  }
}
