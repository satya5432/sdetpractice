package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
@Test
public void login() {
	Reporter.log("login success", true);
}
public void openbrowser() {
	Reporter.log("browser open success", true);
}
public void logout() {
	Reporter.log("logout success", true);
}
}
