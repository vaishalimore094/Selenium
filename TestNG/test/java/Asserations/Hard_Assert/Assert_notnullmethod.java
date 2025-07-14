package Hard_assertstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_notnullmethod {
  @Test
  public void Assert_notnull() {
	  //  String s="vaishali";
		 // Assert.assertNotNull(s, "String is  empty");
		//  Reporter.log("test case is passed string is not empty", true);
		  
		  //-------------or-------------------------------------
		  
		  String s=null;
		   Assert.assertNotNull(s, "String is empty");
		  Reporter.log("test case is passed string is empty", true);
			  
  }
}
