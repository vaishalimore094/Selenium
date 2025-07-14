package soft_assertstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert_nullmethod {
  @Test
  public void notnull() {
	  String s1="Test";
	  String s2=null;
	  String s3="vaisha@111";
	  
	  //----------use softassert to create object----------
	  
	  SoftAssert soft=new SoftAssert();
	  soft.assertNotNull(s1, "string is empty");//--------------passed
	  Reporter.log("String is not empty,tc is passed", true);
	  
//	  sourabhcreated
	  soft.assertNotNull(s1, "string is empty");//--------------passed
	  Reporter.log("String is not empty,tc is passed", true);
	  soft.assertEquals(s1, s3);
	  Reporter.log("String is not equal,tc is passed", true);
	  
	  soft.assertNotNull(s2, "string is empty");
	  Reporter.log("string is not empty testcase is failed",true);
	  //soft.fail();//------------------failed but not stuck bcz use soft asser
	  
	  soft.assertNull(s2, "string is not empty");//--------------passed
	  Reporter.log("string passed", true);
	 //soft.assertAll();//------show the failed tc reason why failed
  }
}
