# Working with Selenium API 
Note: Before you start -
* Create a Java Maven project in your IDE.
* Import Selenium Library using POM
`<dependency>
  <groupId>org.seleniumhq.selenium</groupId>
  <artifactId>selenium-java</artifactId>
  <version>3.141.59</version>
  </dependency>`

> Ans: POM File:
> 
> ```
> <?xml version="1.0" encoding="UTF-8"?>
> <project xmlns="http://maven.apache.org/POM/4.0.0"
> xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
> xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
> <modelVersion>4.0.0</modelVersion>
>
>   <groupId>com.wali</groupId>
>    <artifactId>SeleniumWabApp</artifactId>
>    <version>1.0-SNAPSHOT</version>
>
>    <properties>
>        <maven.compiler.source>8</maven.compiler.source>
>        <maven.compiler.target>8</maven.compiler.target>
>    </properties>
>
>    <dependencies>
>        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
>        <dependency>
>            <groupId>org.seleniumhq.selenium</groupId>
>            <artifactId>selenium-java</artifactId>
>            <version>3.141.59</version>
>        </dependency>
>    </dependencies>
>
> </project>
> ```
  
1. [What is WebDriver?](https://www.selenium.dev/documentation/webdriver/)
2. Create a ChromeDriver Object 
    * Open a browser
    * Open an url https://www.izaanschool.com
    * Close the browser
    * Great You are doing good!!!
3. Create new method and Go to https://www.izaanschool.com/apply
    * Again go to https://www.izaanschool.com
    * Use back() method to go back to Apply page [Reference](https://www.selenium.dev/documentation/webdriver/browser/navigation/)
    * Use forward() method
    * Use refresh() method
    * It's fun, right??
    
4. It's time to learn locators. It's a way to get take your cursor to the particular
   location of the webpage so that you can do browser action like click, write text.
   Using HTML attribute, xpath, css we can catch or locate a web element
    *  What is locators? Learn from this document [Locator](https://www.selenium.dev/documentation/webdriver/elements/locators/)
    * You can also read about locator from [Here](https://docs.google.com/document/d/1yRdHoJGOkfOQn5N_Gnywa-9963_Cydrq7jEjl0X7Crg/edit?usp=sharing)
    * Well now you know how locators works
    * [Here](https://www.selenium.dev/documentation/webdriver/elements/finders/) you have more sample for your understanding 
5. Let's learn how to do some more interaction with browser. [Reference](https://www.selenium.dev/documentation/webdriver/elements/interactions/) 
    * clik()
    * sendKeys()
    * clear()
    * submit

```java
package com.wali;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.charset.StandardCharsets;

public class BrowserApp {

    public static void openIzaanApp() {
        WebDriver izaanChrome = new ChromeDriver();
        String url = "https://www.izaanschool.com";
        izaanChrome.get(url);
        izaanChrome.close();
        System.out.println("Izaan School web site successfully opened and closed");
    }

    public static void openIzaanApply() {
        WebDriver izaanApplyChrome = new ChromeDriver();
        String url = "https://www.izaanschool.com";
        String urlApply = "https://www.izaanschool.com/apply";
        izaanApplyChrome.get(urlApply);
        izaanApplyChrome.navigate().to(url);
        izaanApplyChrome.navigate().back();
        izaanApplyChrome.navigate().forward();
        izaanApplyChrome.navigate().refresh();
    }

    public static void clickHomeButton(){
        WebDriver izaanHomeChrome = new ChromeDriver();
        String urlApply = "https://www.izaanschool.com/apply";
        izaanHomeChrome.get(urlApply);
        izaanHomeChrome.manage().window().maximize();
        izaanHomeChrome.findElement(By.id("navbarLandings")).click();
        System.out.println("Clicked Home Button");
    }

    public static void sendKeyToGoogle() {
        WebDriver sendKey = new ChromeDriver();
        String googleUrl = "https://www.google.com";
        sendKey.get(googleUrl);
        WebElement searchInput = sendKey.findElement(By.name("q"));
        searchInput.sendKeys("selenium");
        searchInput.clear();
    }

    public static void main(String[] args) {

        String webDriverPath = "WebDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        openIzaanApp();
        openIzaanApply();
        clickHomeButton();
        sendKeyToGoogle();
    }
}
```

6. Let's do more interaction with browser using this website Reference

   * Write a method to check checkboxes.
   * Write a method to select option from dropdown menu.
   * Write a method to do drag and drop operation.
   * Write methods to download and upload files.
   * Write a method to delas with context menu.
   * Write a method to selects option from floating menu.
   * Write a method to handle multiple windows.
   * Write a method to handle key press functionality.
   * Write a method to handle forgot password feature.
   * Write a method to handle horizontal slider.
   * Write a method to handle add/remove element.
   * Write a method to handle basic auth.
   * Write a method to handle form authentication.
   * Write a method to handle infinte scoll.
   * Write a method to handle hovers.
   * Write a method to handle frames.
   * Write a method to handle horizontal slider.
   * Write a method to handle inputs.
   * Write a method to handle nested frames.