# Java Basic Assignment 1

### Q1. Write a method called turnOnComputer() in Computer class and use this method. Hints you can call the method in the main()
### Q2. Write a method named turnOffComputer in Computer class.
### Q3. Write a method named cleanCache() in Computer class.
### Q4. Write a method named reduceBrightNess() in Computer class. This method shall be able to reduce the brightness by a percentage
### Q5. Write a method named playMusic() in Computer class. 5.1 Write a method to adjustTheVolume() in Computer class.
### Q6. Write a method named openChromeBrowser() in ChromeBrowser class.
### Q7. Write a method named writeUrlInChromeAddressBar() in respective class.
### Q8. Write a method named closeChromeBrowser() in ChromeBrowser class. 8.1 Write a method named openNewTabInChromeBrowser() in ChromeBrowser class.
### Q9. Write a method named openTextEditor() in TextEditor class. This method should return you a TextEditor type of object.
### Q10. Write a method named writeIntoTextFile() in TextEditor class. Method should be able to write anything when called. Thus avoid hard coding.
### Q11. Write a method named closeTextEditor() in TextEditor class.
### Q12. Write a method named openMicrosoftOutlook() in MicrosoftOutLook class. This method should return you a MicrosoftOutLook type of object.
### Q13. Write a method named closeOutLook().in MicrosoftOutLook class. This method shall be used/called without an object but by the class name
### Q14. Write a method to open Calculator, openCalculator() in Calculator class.
### Q15. Write a method to add two numbers in Calculator class.
### Q16. Write a method to deduct two numbers in Calculator class. Return the result
### Q17. Write a method to add three numbers in Calculator class. Return the result.

Ans.
COMPUTER CLASS:

```java
package Assignment4;

public class Computer {
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.turnOnComputer();
        myComputer.turnOffComputer();
        myComputer.cleanCache();
        myComputer.reduceBrightness(30);
        myComputer.playMusic();
        myComputer.adjustTheVolume(50);

        ChromeBrowser open = new ChromeBrowser();
        open.openChromeBrowser();
        open.writeUrlInChromeAddressBar();
        open.closeChromeBrowser();
        open.openNewTabInChromeBrowser();

        TextEditor nano = new TextEditor();
        TextEditor textReturnedValue = nano.openTextEditor();
        System.out.println(textReturnedValue);
        nano.writeIntoTextFile("WALI UR RASHID");
        nano.closeTextEditor();

        MicrosoftOutLook myEmail = new MicrosoftOutLook();
        MicrosoftOutLook Email = myEmail.openMicrosoftOutlook();
        System.out.println(Email);
        myEmail.closeOutLook();

        Calculator myCalculator = new Calculator();
        myCalculator.openCalculator();
        int a = 7;
        int b = 5;
        int c = 3;
        int addTwo = myCalculator.addTwoNumbers(a,b);
        System.out.println("Summation of " + a + " & " + b + " is " + addTwo);
        int deductTwo = myCalculator.deductTwoNumbers(a,b);
        System.out.println("Deduction of " + a + " & " + b + " is " + deductTwo);
        int addThree = myCalculator.addThreeNumbers(a,b,c);
        System.out.println("Summation of " + a + ", " + b + " & " + c + " is " +addThree );
    }

    public void turnOnComputer() {
        System.out.println("Computer is Turned on");
    }
    public void turnOffComputer() {
        System.out.println("Computer is Turned off");
    }
    public void cleanCache() {
        System.out.println("Cache is cleaned");
    }
    public void reduceBrightness(int percentage) {
        System.out.println("Reduce the Brightness by " + percentage + "%");
    }
    public void playMusic() {
        System.out.println("Music is playing");
    }
    public void adjustTheVolume(int volume) {
        System.out.println("Adjust the Volume level to " + volume + "%");
    }
}
```
CHROME BROWSER CLASS:

```java
package Assignment4;

public class ChromeBrowser {
    public void openChromeBrowser() {
        System.out.println("Open Chrome Browser");
    }
    public void writeUrlInChromeAddressBar() {
        System.out.println("Write url in Chrome Address Bar");
    }
    public void closeChromeBrowser() {
        System.out.println("Chrome Browser is closed");
    }
    public void openNewTabInChromeBrowser() {
        System.out.println("Open New Chrome Browser tab");
    }
}

```
TEXT EDITOR CLASS:
```java
package Assignment4;

public class TextEditor {
    public TextEditor openTextEditor() {
        TextEditor myTextEditor = new TextEditor();
        return myTextEditor;
    }
    public void writeIntoTextFile(String inputText) {
        System.out.println(inputText);
    }
    public void closeTextEditor() {
        System.out.println("Text Editor is closed");
    }
}
```
MICROSOFT OUTLOOK CLASS:

```java
package Assignment4;

public class MicrosoftOutLook {
    public MicrosoftOutLook openMicrosoftOutlook() {
        MicrosoftOutLook myMicrosoftOutlook = new MicrosoftOutLook();
        return myMicrosoftOutlook;
    }
    public void closeOutLook() {
        System.out.println("Microsoft Outlook is closed");
    }
}
```

CALCULATOR CLASS:

```java
package Assignment4;

public class Calculator {
    public void openCalculator(){
        System.out.println("Open the Calculator");
    }
    public int addTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }
    public int deductTwoNumbers(int number1, int number2) {
        return number1 - number2;
    }
    public int addThreeNumbers(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

}
```
Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=64935:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Assignment4.Computer
Computer is Turned on
Computer is Turned off
Cache is cleaned
Reduce the Brightness by 30%
Music is playing
Adjust the Volume level to 50%
Open Chrome Browser
Write url in Chrome Address Bar
Chrome Browser is closed
Open New Chrome Browser tab
Assignment4.TextEditor@1b6d3586
WALI UR RASHID
Text Editor is closed
Assignment4.MicrosoftOutLook@4554617c
Microsoft Outlook is closed
Open the Calculator
Summation of 7 & 5 is 12
Deduction of 7 & 5 is 2
Summation of 7, 5 & 3 is 15

Process finished with exit code 0
```

