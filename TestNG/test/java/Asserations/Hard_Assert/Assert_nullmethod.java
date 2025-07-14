package Hard_assertstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_nullmethod {
  @Test
  public void Assertnull() {
	 // String s=null;
	 // Assert.assertNull(s, "String is not empty");
	 // Reporter.log("test case is passed string is empty", true);
	  
	  //-------------or-------------------------------------
	  
	  String s=null;
	  String s1="vaishali";
	  
	  Assert.assertNull(s, "String is not empty");
	  Reporter.log("test case is passed string is empty", true);
		  
	  Assert.assertNull(s1, "String is not empty");//--------------validation stuck
	  Reporter.log("test case is passed string is empty", true);
	  
	  Assert.assertNull(s, "String is not empty");//-----------cant run in validation bcz stuck inline no 22
	  Reporter.log("test case is passed string is empty", true);
		  
	  //in one testcase multiple validations use then one validation fail then all tc failed
  }
}
