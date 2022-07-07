package com.wali;

public class BrowserApp1 {


    public void createChromeDriver() {
        String userDirectory = System.getProperty("user.dir");
        String chromeDriverPath = userDirectory + "/Webdriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);



    }
    public static void main(String[] args) {
//        String userDirectory = System.getProperty("user.dir");
//        System.out.println(userDirectory);
//        String chromeDriverPath = userDirectory + "/Webdriver";
//        System.out.println(chromeDriverPath);
    }
}
