package retryanalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Pgm16_RetryLogic implements IRetryAnalyzer{
	int current_count=0;
	int no_of_retry=2;

	@Override
	public boolean retry(ITestResult result) {
		if(current_count<no_of_retry) {
			current_count++;
			return true;//Give Retry to test case
		}
		return false;//Don't Retry
	}
	
	

}
