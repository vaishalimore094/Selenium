package Hard_assertstudy;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_failmethod {
  @Test
  public void Assert_fail() {
	  Reporter.log("tc passed 123", true);
	  Assert.fail(" failed tc for negative testing");//-----use -ve testing
	  Reporter.log("tc passed 452", true);
	  
  }
}
