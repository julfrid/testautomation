package selenium.uj.project.utils;

import org.testng.ITestResult;


public class CustomTestResult {

    public String getResultMessageLog (ITestResult result) {
        return "RESULT - " + result.getMethod().getMethodName() + " - " + getResultName(result.getStatus());
    }

    private String getResultName(int result) {
        if (result == ITestResult.SUCCESS) {
            return "SUCCESS";
        } else if (result == ITestResult.FAILURE) {
            return "FAILURE";
        } else if (result == ITestResult.SKIP) {
            return "SKIP";
        } else {
            return "UNKNOWN";
        }
    }
}
