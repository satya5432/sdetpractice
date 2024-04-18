package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertTest {
@Test
public void softassert() {
	SoftAssert sa = new SoftAssert();
	System.out.println("---line1--");
	System.out.println("---line2--");
	sa.assertEquals("A", "A", "actual and expected not matched");
	System.out.println("---line3--");
	sa.assertAll();
	int a=10;
	sa.assertNull(a);
	sa.assertAll();
	//hihihi
}
}
