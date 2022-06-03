# Java Basic Assignment 4

### Q1. Write a java program with a following methods: method "sum" which returns sum of two numbers, method "multiplication" which returns product of two numbers, method "Subtraction" which returns difference of two numbers, method "division" which returns quotient value. For example if first number is 2 and second number is 3 then output should be like: Sum of 2 and 3 is: 5 Product of 2 and 3 is: 6 ..... and so on

Ans.

```java
public class ArithmeticMethod {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 3;

        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + sum(number1, number2));
        System.out.println("Product of " + number1 + " and " + number2 + " is: " + multiplication(number1, number2));
        System.out.println("Difference of " + number1 + " and " + number2 + " is: " + subtraction(number1, number2));
        System.out.println("Quotient of " + number1 + " and " + number2 + " is: " + division(number1, number2));
    }

    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int multiplication(int x, int y) {
        int prod = x * y;
        return prod;
    }

    public static int subtraction(int x, int y) {
        int diff = x -y;
        return  diff;
    }

    public static float division(int x, int y) {
        float div = ((float)x) / y;
        return div;
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=54336:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" ArithmeticMethod
Sum of 2 and 3 is: 5
Product of 2 and 3 is: 6
Difference of 2 and 3 is: -1
Quotient of 2 and 3 is: 0.6666667

Process finished with exit code 0
```

### Q2. Write a Java method to check whether a string is a valid password. Password rules: A password must have at least ten characters. A password consists of only letters and digits. A password must contain at least two digits.

Ans.
```java
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        int Min_char = 10;
        int Num_Digits = 2;
        int digitCounter = 0;

        System.out.println("Enter the Password\n");
        Scanner input = new Scanner(System.in);

        String password = input.nextLine();

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c))
                digitCounter++;
        }

        if (password.length() >= Min_char && digitCounter >= Num_Digits) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Your Password does not contain the following: ");

            if (password.length() < Min_char)
                System.out.println("At least 10 characters");

            if (digitCounter < Num_Digits)
                System.out.println("Minimum 2 number of numeric digits");
        }
    }
}
```
Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=57207:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PasswordValidation
Enter the Password

1asd
Your Password does not contain the following: 
At least 10 characters
Minimum 2 number of numeric digits

Process finished with exit code 0
```
```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=57213:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PasswordValidation
Enter the Password

123abcdefgh
Valid Password

Process finished with exit code 0
```

### Q3. Define a method to find out if number is prime or not.

Ans.
```java
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        int number = Integer.MAX_VALUE;
        System.out.println("Enter the Number to check if prime or not \n");
        Scanner input = new Scanner(System.in);

        while (number != 0) {
            number = input.nextInt();
            System.out.printf("Does %d is prime Number? %s %n", number, isPrimeOrNot(number));
        }
    }

    public static String isPrimeOrNot(int num) {
        if (num < 0) {
            return "Not Valid";
        }
        if (num == 0 || num ==1) {
            return "No, not a Prime number";
        }
        if (num == 2 || num == 3) {
            return "Yes, Prime Number";
        }
        if ((num * num -1) % 24 == 0) {
            return "Yes, Prime Number";
        } else {
            return "No, not a Prime number";
        }
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:51610,suspend=y,server=n "-javaagent:C:\Users\MYPC~1\AppData\Local\Temp\captureAgentjars\debugger-agent.jar" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice;D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar" PrimeChecker
Connected to the target VM, address: '127.0.0.1:51610', transport: 'socket'
Enter the Number to check if prime or not 

1
Does 1 is prime Number? No, not a Prime number 
2
Does 2 is prime Number? Yes, Prime Number 
3
Does 3 is prime Number? Yes, Prime Number 
4
Does 4 is prime Number? No, not a Prime number 
5
Does 5 is prime Number? Yes, Prime Number 
8
Does 8 is prime Number? No, not a Prime number 
```

### Q4. Define a method to find out number is even or odd.

Ans.
```java
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner inbox = new Scanner(System.in);

        System.out.println("Enter the number to check odd or even: ");

        int number = inbox.nextInt();
        OddEven(number);

    }
    public static void OddEven(int number) {
        if(number % 2 == 0)
            System.out.println(number+" is even");
        else
            System.out.println(number+" is odd");
    }
}
```


Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=55577:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" OddEven
Enter the number to check odd or even: 
10
10 is even

Process finished with exit code 0
```

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=55584:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" OddEven
Enter the number to check odd or even: 
7
7 is odd

Process finished with exit code 0
```

### Q5. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below: Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD <=40 Fail

Ans.
```java
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Marks\n");

        float marks = input.nextFloat();
        grade(marks);
    }
    public static void grade(float marks) {
        if (marks >= 91)
            System.out.println("Your grade is AA" );
        else if (marks >= 81)
            System.out.println("Your grade is AB");
        else if (marks >= 71)
            System.out.println("Your grade is BB");
        else if (marks >= 61)
            System.out.println("Your grade is BC");
        else if (marks >= 51)
            System.out.println("Your grade is CD");
        else if (marks >= 41)
            System.out.println("Your grade is DD");
        else if (marks <= 40)
            System.out.println("Your grade is Fail");
    }
}
```
Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=52582:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Grade
Please enter your Marks

80
Your grade is BB

Process finished with exit code 0

"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=61256:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Grade
Please enter your Marks

38
Your grade is Fail

Process finished with exit code 0
```

### Q6. Write a program with following methods: method "printInfo" which displays name, age, phone number and salary of a employee and method "bonus" which displays monthly salary of employee after getting 5% bonus.

Ans.

```java
public class EmployeeBonus {
    public static void main(String[] args) {

        printInfo("Arish", 25, 2408796290L, 12000 );
        bonus(12000);
    }

    public static void printInfo(String name, int age, long phone, int salary) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Name: " + phone);
        System.out.println("Name: " + salary);
    }

    public static void bonus(int salary) {
        int salaryWithBonus = salary+ salary * 5/100;
        System.out.println("Salary after getting bonus: " + salaryWithBonus);
    }
}
```

Output:
```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=53942:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" EmployeeBonus
Name: Arish
Age: 25
Name: 2408796290
Name: 12000
Salary after getting bonus: 12600

Process finished with exit code 0
```

### Q7. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

Ans. 

```java
public class VoterEligibility {
    public static void main(String[] args) {
    voterEligibility(21);

    }
    public static void voterEligibility(int age) {
        if (age >= 18)
            System.out.println("You are eligible for voting");
        else
            System.out.println("You are not eligible to vote");
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=62059:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" VoterEligibility
You are eligible for voting

Process finished with exit code 0
```

### Q8. Write a Java program to get a number from the user and print whether it is positive or negative.

Ans.
```java
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check whether positive or negative\n");

        int number = input.nextInt();
        positiveOrNegative(number);

    }
    public static void positiveOrNegative(int number) {
        if (number > 0)
            System.out.println("This is a positive number.");
        else if (number < 0)
            System.out.println("This is a negative number.");
        else
            System.out.println("This is zero");
    }
}
```

Outputs:
```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=62252:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PositiveNegative
Enter the number to check whether positive or negative

53
This is a positive number.

Process finished with exit code 0

"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=50212:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PositiveNegative
Enter the number to check whether positive or negative

-46
This is a negative number.

Process finished with exit code 0
```

### Q9. Write a program with methods "compareTwoNumbers" which print greater number among 2 numbers, method "compareThreeNumbers" which print greater number among 3 numbers and method "comapreFourNumbers" which print smallest number among 4 numbers. (You can use numbers of your choice)

Ans.

```java
public class CompareNumbers {
    public static void main(String[] args) {
        compareTwoNumbers(7, 5);
        compareThreeNumbers(15, 8, 42);
        compareFourNumbers(68, 4, 35, 48);
    }

    public static void compareTwoNumbers(int number1, int number2) {
        if (number1 > number2)
            System.out.println("Among two numbers, " + number1 + " is the greater number.");
        else
            System.out.println("Among two numbers, " + number2 + " is the greater number.");
    }

    public static void compareThreeNumbers(int number1, int number2, int number3) {
        int larger = number1 > number2 ? number1 : number2;
        int largest = number3 > larger ? number3 : larger;

        System.out.println("Among three numbers, " + largest + " is the greatest number.");
    }

    public static void compareFourNumbers(int number1, int number2, int number3, int number4) {
        int temp = number1 > number2 ? number1 : number2;
        int larger = number3 > temp ? number3 : temp;
        int largest = number4 > larger ? number4 : larger;

        System.out.println("Among four numbers, " + largest + " is the greatest number.");
    }
}
```
Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=51100:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" CompareNumbers
Among two numbers, 7 is the greater number.
Among three numbers, 42 is the greatest number.
Among four numbers, 68 is the greatest number.

Process finished with exit code 0
```

### Q10. Write a Java program that prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

Ans.
```java
import java.util.Scanner;

public class CompareEquality {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter First number: ");

        int num1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter Second number: ");

        int num2 = number2.nextInt();

        Scanner number3 = new Scanner(System.in);
        System.out.println("Enter Third number: ");

        int num3 = number3.nextInt();

        equity(num1, num2, num3);

    }

    public static void equity( int a, int b, int c) {
        if ( a==b && b==c)
            System.out.println("All numbers are equal");
        else if (a !=b && a!=c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal nor different");
    }
}
```


Outputs:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=63886:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" CompareEquality
Enter First number: 
15
Enter Second number: 
15
Enter Third number: 
15
All numbers are equal
Process finished with exit code 0

"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=63893:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" CompareEquality
E
12
Enter Second number: 
12
Enter Third number: 
17
Neither all are equal nor different
Process finished with exit code 0

"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=64471:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" CompareEquality
Enter First number: 
11
Enter Second number: 
15
Enter Third number: 
17
All numbers are different
Process finished with exit code 0
```

### Q11. Write a Java program that prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000

Ans.
```java
import java.util.Scanner;

public class PositiveNegative2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
```

Output:
```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=51283:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PositiveNegative2
Input value: 10
Positive number

Process finished with exit code 0

"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=51301:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PositiveNegative2
Input value: 1111111
Positive large number

Process finished with exit code 0

"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=51308:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PositiveNegative2
Input value: -11111111
Negative large number

Process finished with exit code 0
```

### Q12. Write a Java program to test if an array contains a specific value.

Ans.
```java
public class FindValue {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5};
        int Find = 3;
        boolean found = false;

        for (int n : number) {
            if (n == Find) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(Find + " is found.");
        else
            System.out.println(Find + " is not found.");
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=52955:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" FindValue
3 is found.

Process finished with exit code 0
```

### Q13. Write a program to sum first numbers using a for loop.

Ans.
```java
public class SumOfNumbers {
    public static void main(String arg[])
    {
        int input = 5;
        int sum = 0;

        for(int i = 1; i <= input; i++)
        {
            sum = sum + i;
            System.out.println("Sum after adding " + i + " is : " + sum);
        }
        System.out.println();
        System.out.println("Sum of numbers till " + input + " is " + sum);
    }
}
```
Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=54120:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" SumOfNumbers
Sum after adding 1 is : 1
Sum after adding 2 is : 3
Sum after adding 3 is : 6
Sum after adding 4 is : 10
Sum after adding 5 is : 15

Sum of numbers till 5 is 15

Process finished with exit code 0
```

### Q14. Write a program which prints "PASS" if marks of student are more than or equal to 50; and prints FAIL otherwise.

Ans.
```java
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Marks Obtained by the student:");

        float marks = input.nextFloat();

        if (marks >= 50)
            System.out.println("PASS");
        else System.out.println("FAIL");
    }
}
```

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=56412:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PassFail
Enter Marks Obtained by the student:
60
PASS

Process finished with exit code 0

"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=56418:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PassFail
Enter Marks Obtained by the student:
39
FAIL

Process finished with exit code 0
```

### Q15. Write a program called which prints "ONE", "TWO",... , "NINE", "OTHER" if the number is 1, 2,... , 9, or other, respectively using nested if statement.

Ans. 
```java
import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number between 1 and 9: ");

        Scanner input = new Scanner(System.in);

        int PrintNumber = input.nextInt();

        if (PrintNumber == 0){
            System.out.println("ONE");
        }
        else if (PrintNumber == 1){
            System.out.println("TWO");
        }
        else if (PrintNumber == 3){
            System.out.println("THREE");
        }
        else if (PrintNumber == 4){
            System.out.println("FOUR");
        }
        else if (PrintNumber == 5){
            System.out.println("FIVE");
        }
        else if (PrintNumber == 6){
            System.out.println("SIX");
        }
        else if (PrintNumber == 7){
            System.out.println("SEVEN");
        }
        else if (PrintNumber == 8){
            System.out.println("EIGHT");
        }
        else if (PrintNumber == 9){
            System.out.println("NINE");
        }
        else{
            System.out.println("OTHER");
        }
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=61395:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PrintNumber
Enter a number between 1 and 9: 
8
EIGHT

Process finished with exit code 0
```

### Q16. Write a program called which prints "ONE", "TWO",... , "NINE", "OTHER" if the number is 1, 2,... , 9, or other, respectively using switch statement.

Ans.
```java
import java.util.Scanner;

public class PrintNumberSwitch {
    public static void main(String[] args) {

        System.out.println("Enter a number between 1 and 9: ");

        Scanner input = new Scanner(System.in);

        int PrintNumber = input.nextInt();

        switch (PrintNumber){

            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=59729:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PrintNumberSwitch
Enter a number between 1 and 9: 
7
SEVEN

Process finished with exit code 0
```

### Q17. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

Ans.
```java
public class Student {
    String name;
    int roll_no;
}
class Solution{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.roll_no = 2;
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " +s.roll_no);
    }
}
```

Output:
```
public class Student {
    String name;
    int roll_no;
}
class Solution{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.roll_no = 2;
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " +s.roll_no);
    }
}
```
### Q18. Write a Java class Author with following features: Instance variables : firstName for the author’s first name of type String. lastName for the author’s last name of type String. Constructor: public Author (String firstName, String lastName): A constructor with parameters, it creates the Author object by setting the two fields to the passed values. Instance methods: public void setFirstName (String firstName): Used to set the first name of author. public void setLastName (String lastName): Used to set the last name of author. public double getFirstName(): This method returns the first name of the author. public double getLastName(): This method returns the last name of the author. public String toString(): This method printed out author’s name to the screen

Ans.

### Q19. Write a Java class Book with following features: Instance variables : title for the title of book of type String. author for the author’s name of type String. price for the book price of type double. Constructor: public Book (String title, Author name, double price): A constructor with parameters, it creates the Author object by setting the the fields to the passed values. Instance methods: public void setTitle(String title): Used to set the title of book. public void setAuthor(String author): Used to set the name of author of book. public void setPrice(double price): Used to set the price of book. public double getTitle(): This method returns the title of book. public double getAuthor(): This method returns the author’s name of book. public String toString(): This method printed out book’s details to the screen

Ans.

```java
public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title =title;
    }

    public void setAuthor(String author) {
        this.author =author;
    }

    public void setPrice(double price) {
        this.price =price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "The details of the book are: " + title + ", " + author + ", " + price;
    }
}
```

### Q20. Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

Ans.

```java
public class Average {
    public static void main(String[] args) {
        average(10, 20, 30);

    }
    public static void average(int number1, int number2, int number3) {
        float avg = (number1 + number2 + number3) / 3;
        System.out.println("The average value is: " + avg);
    }
}
```

Output:
```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=57296:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Average
The average value is: 20.0

Process finished with exit code 0
```


### Q21. The Java class called Holiday is started below. An object of class Holiday represents a holiday during the year. This class has three instance variables: name, which is a String representing the name of the holiday day, which is an int representing the day of the month of the holiday month, which is a String representing the month the holiday is in a) Write a constructor for the class Holiday, which takes a Stringrepresenting the name, an int representing the day, and a String representing the month as its arguments, and sets the class variables to these values. b) Write a method inSameMonth, which compares two instances of the class Holiday,and returns the Boolean value trueif they have the same month, and falseif they do not. c) Write a piece of code that creates a Holidayinstance with the name “Independence Day”, with the day “4”, and with the month “July”.

Ans.

```java
public class Holiday {
    String name;
    int day;
    String month;

    public Holiday(String n, int d, String m) {
        name = n;
        day = d;
        month = m;
    }

    public boolean inSameMonth(Holiday hol) {
        return this.month.equals(hol.month)
    }

    Holiday hol = new Holiday("Independence Day", 4, "July")
}

```

### Q22. The class Movie is started below. An instance of class Movie represents a film. This class has the following three class variables: title, which is a String representing the title of the movie studio, which is a String representing the studio that made the movie rating, which is a String representing the rating of the movie (i.e. PG­13, R, etc) Write a constructor for the class Movie, which takes a Stringrepresenting the title of the movie, a Stringrepresenting the studio, and a Stringrepresenting the rating as its arguments, and sets the respective class variables to these values. b) Write a second constructor for the class Movie, which takes a Stringrepresenting the title of the movie and a Stringrepresenting the studio as its arguments, and sets the respective class variables to these values, while the class variable ratingis set to "PG"

Ans.
```java
public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String t, String s, String r) {
        title = t;
        studio = s;
        rating = r;
    }
    
    public Movie (String t, String s) {
        title = t;
        studio = s;
        rating = "PG";
    }
}

```

### Q23. Write a java program with method that reads two integers, determines whether the first is a multiple of the second and print the result.

Ans.
```java
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0, k;

        System.out.println("Enter First number: ");
        number1 = input.nextInt();

        System.out.println("Enter Second Number: ");
        number2 = input.nextInt();

        k = number1 % number2;

        if (k == 0)
            System.out.println(+ number1 + " is a multiple of " + number2);
        else
            System.out.println(+ number1 + " is not a multiple of " + number2);

        }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=51634:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Q23
Enter First number: 
25
Enter Second Number: 
5
25 is a multiple of 5

Process finished with exit code 0
```

### Q24. Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables‐a part number(type String),a part description(type String),a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables.Provide a method named getInvoice Amount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0.