package Hard_assertstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Truemethod {
  @Test
  public void Assert_true() {
	//  boolean result = false;
	 // Assert.assertTrue(result, "result is false");//------------is not true then failed then run this script
	 // Reporter.log("result is true", true);//------is true then pass otherwise stuck in line no 11
	  
	  //--------------or-----------
	 
		  boolean result = true;
		  Assert.assertTrue(result, "result is false");//----is true then notstuck
		  Reporter.log("result is true", true);//--true thats why run line no 18
		  
		  
  }
}
//---use all method boolen returns
//----is selected
//----is displayed
//----