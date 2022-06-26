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
        izaanHomeChrome.close();
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