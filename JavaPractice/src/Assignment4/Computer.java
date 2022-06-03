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
