package com.generic.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ListenerIMPclass implements ITestListener {
	
//	private static final String Screenshot = null;
	ExtentReports report;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test=report.createTest(methodName);
		Reporter.log("execution starts from here",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, methodName );
		Reporter.log(methodName+"--->executed successfully" );
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		
		try {
			String screenshot = webdriverUtility.getscreenshot(Baseclass.sdriver, methodname);
			test.log(Status.FAIL, methodname+">>> failed");
			test.log(Status.FAIL, result.getThrowable());
			test.addScreenCaptureFromPath(screenshot);
			Reporter.log(methodname+">> failed");
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname+">>> Skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(methodname+">> Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
	ExtentSparkReporter htmlReport = new ExtentSparkReporter("./ExtendReport/Report.html");
	htmlReport.config().setDocumentTitle("");
	htmlReport.config().setReportName("");
	htmlReport.config().setTheme(Theme.DARK);
	
	report = new ExtentReports();
	report.attachReporter(htmlReport);
	report.setSystemInfo("Base-platform", "window");
	report.setSystemInfo("Base-browser", "chrome");
	report.setSystemInfo("Base-url", "http://rmgtestingserver/domain/Online_Banking_System/");
	report.setSystemInfo("ReporterName", "satya");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
     
}
