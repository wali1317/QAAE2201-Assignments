package com.wali.reporting;

import org.testng.Reporter;

public class TestLogger {
    public static void log(final String message){
        Reporter.log(message,true);
        //ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
        System.out.println(message);
    }
//    public static void log(final StringUtils message){
//        Reporter.log(message + "<br>",true);
//        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
//    }
//    public static void log(final String message, WebDriver driver){
//        Reporter.log(message,true);
//        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
//    }


}
