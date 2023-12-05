package listenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testing is Successful");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Successfully started");
	}

}
