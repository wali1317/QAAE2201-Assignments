#### Java Basic Assignment 3 (Operators)

### Q39. What are operators?

Ans. Operators are special symbols that perform operations on one, two, or three operands, and then return a result. 

### Q40. Write the types of operators you studied in class.

Ans. Followings are the types of operators we studied in class:

- postfix
- prefix
- multiplicative
- additive
- relational
- equality
- logical AND
- logical OR

### Q41. The operators used in Arithmetic expressions can be classified into which type?

Ans.

- Additive operator
- Subtraction operator
- Multiplication operator
- Division operator
- Remainder operator

### Q42. Examine the following code. The programmer is not getting the same value for result and result2. Why? double result = (20-10/3); double result = ((20-10)/3);

Ans. result = (20-10/3) and result2 = ((20-10)/3) will  not have same valued. In first case firstly 10/3 will 
be executed then it will be deducted from 20. On the other hand, in second case, firstly 10 will be deducted from 20, 
then will be divided by 3. Because the precedence of arithmetic expressions are brackets first, followed by postfix then 
prefix, then multiplicative (*, /, %) and then additive (+,-).

### Q43. Write a program to check if the two numbers 23 and 45 are equal.

Ans.
```java
public class EqualNumber {
    public static void main(String[] args) {
        int firstNumber = 23;
        int secondNumber = 45;
        if ((firstNumber - secondNumber) == 0)
            System.out.println("Numbers are equal");
        else
            System.out.println("Numbers are not equal");
    }
}
```
Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=58248:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" EqualNumber
Numbers are not equal

Process finished with exit code 0
```
### Q44. Write a Java program to find the value of specified expression. a. 301 + 0) / 5 b. 7.0e-6 * 10000000.1 c. true && true d. false && true e. (false && false) || (true && true) f. (false || false) && (true && true)

Ans.
```java
public class SpecifiedExpression {
    public static void main(String[] args) {
        int result1 = (301 + 0)/5;
        double result2 = 7.0e-6 * 10000000.1;
        boolean result3 = true && true;
        boolean result4 = false && true;
        boolean result5 = (false && false) || (true && true);
        boolean result6 = (false || false) && (true && true);

        System.out.println("(301 + 0)/5 = " + result1);
        System.out.println("7.0e-6 * 10000000.1 = " + result2);
        System.out.println("true && true = " + result3);
        System.out.println("false && true = " + result4);
        System.out.println("(false && false) || (true && true) = " + result5);
        System.out.println("(false || false) && (true && true) = " + result6);
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=53374:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" SpecifiedExpression
(301 + 0)/5 = 60
7.0e-6 * 10000000.1 = 70.0000007
true && true = true
false && true = false
(false && false) || (true && true) = true
(false || false) && (true && true) = false

Process finished with exit code 0
```

### Q45. Length and breadth of a rectangle are 9 and 5 respectively. Write a program to calculate the area and perimeter of the rectangle.

Ans.
```java
public class RectangleArea {
    public static void main(String[] args) {
        int length = 9;
        int breadth = 5;
        int area = length * breadth;
        int perimeter = 2 * (length * breadth);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=56559:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" RectangleArea
Area = 45
Perimeter = 90

Process finished with exit code 0
```

### Q46. Write a program to calculate the perimeter of a triangle having sides of length 9,6 and 5 units.

Ans.
```java
public class Triangle {
    public static void main(String[] args) {
        int side1 = 9;
        int side2 = 6;
        int side3 = 5;
        int perimeter = side1 + side2 + side3;

        System.out.println("Perimeter of Traingle = " + perimeter);
    }
}
```

Output:
```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=61236:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Triangle
Perimeter of Traingle = 20

Process finished with exit code 0
```

### Q47. Write a program to find if both the conditions 'a < 50' and 'a < b' are true when value of a is 45 and b is 67.

Ans.
```java
public class Condition1 {
    public static void main(String[] args) {
        int a = 45;
        int b = 67;
        if ((a < 50) && (a < b)) {
            System.out.println("Given Condition is TRUE");
        } else {
            System.out.println("Given condition is FALSE");
        }
    }
}
```
Output:
```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=62232:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Condition1
Given Condition is TRUE

Process finished with exit code 0
```

### Q48. Write a program to find total marks and percentage of students when his marks in three subjects are 87, 39 and 52 respectively (each out of 100 ).

Ans. 
```java
public class Result {
    public static void main(String[] args) {
        int subject1 = 87;
        int subject2 = 39;
        int subject3 = 52;
        int totalMarks = (subject1 + subject2 + subject3);
        int percentage = ((totalMarks * 100 ) / 300);

        System.out.println("Total Marks obtained : " + totalMarks);
        System.out.println("Total Percentage : " + percentage + "%");
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=62478:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Result
Total Marks obtained : 178
Total Percentage : 59%

Process finished with exit code 0
```

### Q49. Write a program to convert temperature from Fahrenheit to Celsius degree. (You can take temperature of your choice)

Ans. 

```java
public class Temperature {
    public static void main(String[] args) {
        float F = 42;
        float C = ((F-32)*5)/9;

        System.out.println("Temperature in Celsius of " + F + " degree Fahrenheit is: " + C );
    }
}
```

Output:
```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=51819:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Temperature
Temperature in Celsius of 42.0 degree Fahrenheit is: 5.5555553

Process finished with exit code 0
```

### Q50. Write a program to find largest number among three numbers: 76,54 and 89.

Ans.

```java
public class LargestNumber {
    public static void main(String[] args) {
        int a = 76;
        int b = 54;
        int c = 89;
        int larger = (a>b)?a:b;
        int largest = (larger>c)?larger:c;
        System.out.println("The largest number among " + a + ", " + b + " and " + c + " is " + largest);
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=53901:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" LargestNumber
The largest number among 76, 54 and 89 is 89

Process finished with exit code 0
```

### Q51. Write a program to find smallest number among three numbers: 76,54 and 89.

Ans.

```java
public class SmallestNumber {
    public static void main(String[] args) {
    int a = 76;
    int b = 54;
    int c = 89;
    int smaller = (a<b)?a:b;
    int smallest = (smaller<c)?smaller:c;
    System.out.println("The smallest number among " + a + ", " + b + " and " + c + " is " + smallest);
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=55983:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" SmallestNumber
The smallest number among 76, 54 and 89 is 54

Process finished with exit code 0
```

### Q52. If num1=5 and num2=4 then write a program to swap values of these numbers.

Ans.
```java
public class SwapValue {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        System.out.println("Before swapping: num1= "+num1 + ", num2= " + num2);

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("After swapping: num1= "+num1 + ", num2= " + num2);
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=62379:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" SwapValue
Before swapping: num1= 5, num2= 4
After swapping: num1= 4, num2= 5

Process finished with exit code 0
```

### Q53. Write a program to convert positive number to negative number. (You can take any number of your choice)

Ans.
```java
public class PositiveToNegative {
    public static void main(String[] args) {
        int positiveValue = 1317;
        int negativeValue = (~(positiveValue - 1));

        System.out.println("Positive value converted to negative value: " + negativeValue);
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=63725:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PositiveToNegative
Positive value converted to negative value: -1317

Process finished with exit code 0
```

### Q54. Consider the following code snippet. arrayOfInts[j] > arrayOfInts[j+1] a. Which operators does the code contain?

Ans. > and +

### Q55. Consider the following code snippet. int i = 10; int n = i++%5; a. What are the values of i and n after the code is executed? b. What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?

Ans. Value of i = 11 and value of n = 0

### Q56. To invert the value of a boolean, which operator would you use?

Ans. The logical complement operator "!" is used to invert the value of boolean.

### Q57. Write a program to show the difference between postfix expr ++ and prefix ++ expr operators. In the comments of your program explain each line of code.

Ans. In the postfix (i.e., i++), the value of i is incremented, but the value of the expression is the original value of i.

In the prefix (i.e., ++i), the value of i is incremented, and the value of the expression is the new value of i.

### Q58. Write a program to show the difference between postfix expr -- and prefix -- expr operators. In the comments of your program explain each line of code.

Ans.

```java
public class PostPreFix {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;  // x is incremented to 11, the original value of x (which is 10) is copied into y. So Y now equals 10.

        System.out.println("y: " + y);
        System.out.println("x: " + x);

        int a = 10;
        int b = ++a; // a is incremented to 11, the new value of a (which is 11) is copied into b. So b now equals 11.

        System.out.println("b: " + b);
        System.out.println("a: " + a);
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=49238:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PostPreFix
y: 10
x: 11
b: 11
a: 11

Process finished with exit code 0
```

### Q59. Which operator is used to compare two values, = or == ?

Ans. ==

### Q60. Explain the following code sample: result = someCondition ? value1 : value2;

Ans. If condition is true it will take value1, if false will take value2

### Q61. Write a program to divide 154 with 7.

Ans.
```java
public class Divide {
    public static void main(String[] args) {
        int value1 = 154;
        int value2 = 7;
        int result = value1/value2;

        System.out.println("The Result is " + result);
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=56596:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Divide
The Result is 22

Process finished with exit code 0
```

### Q62. Write a program to print the sum, product, difference, divide and remainder of two numbers (First number=579 and second number=17).

Ans.

```java
public class Arithmatic {
    public  static void main(String[] args) {
        int number1 = 579;
        int number2 = 17;

        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 - number2;
        float divide = ((float)number1) / number2;
        int remainder = number1 % number2;

        System.out.println("Value of Sum: " + sum);
        System.out.println("Value of Product: " + product);
        System.out.println("Value of Difference: " + difference);
        System.out.println("Value of Divide: " + divide);
        System.out.println("Value of Remainder: " + remainder);
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=58158:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" Arithmatic
Value of Sum: 596
Value of Product: 9843
Value of Difference: 562
Value of Divide: 34.058823
Value of Remainder: 1

Process finished with exit code 0
```
### Q63. Write a Java program to print the area and perimeter of a circle when radius of circle is 4.2 cm.

Ans.

```java
public class PerimeterCircle {
    public static void main(String[] args) {
        double radius = 4.2;
        double pi = 3.14;

        double perimeter =  2 * pi * radius;

        System.out.println("Perimeter of circle: " + perimeter + " cm");
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=59719:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" PerimeterCircle
Perimeter of circle: 26.376 cm

Process finished with exit code 0
```

### Q64. Write a program that compares two number 13 and 16 are not equal.

Ans.
```java
public class CompareNumber {
    public static void main(String[] args) {
        int number1 = 13;
        int number2 = 16;

        if (number1 != number2) {
            System.out.println("Two numbers are not equal");
        }
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=56487:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" CompareNumber
Two numbers are not equal

Process finished with exit code 0
```

### Q65. Write a program to decrease value of variable by 1 without using arithmetic operator. (Value of variable is 13)

Ans.

### Q66. Write a program to increase value of variable by 1 without using arithmetic operator. (Value of variable is 13)

Ans.

```java
public class IncreaseByOne {
    public static void main(String[] args) {
        int value = 13;
        value = increment(13);
        System.out.println(value);
    }

    static int increment(int number) {
        int one = 1;

        /* Flip all the set bits until we find a 0 */
        while((number & one)!=0 ) {
            number = number^one;
            one <<= 1;
        }

        /* flip the rightmost 0 bit */
        number = number^one;
        return number;
    }
}
```
Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=54202:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" DecreaseByOne
14

Process finished with exit code 0
```

### Q67. Write a program that shows the message true first number is greater than second number or third number. (First number= 23, Second number = 32 and third number = 15).

Ans.
```java
public class GreaterOr {
    public static void main(String[] args) {
        int firstNumber = 23;
        int secondNumber = 32;
        int thirdNumber = 15;

        if (firstNumber>secondNumber || firstNumber>thirdNumber) {

            System.out.println("True");
        }
        else {

            System.out.println("False");
        }
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=58107:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" GreaterAnd
True

Process finished with exit code 0
```

### Q68. Write a program that shows message true first number is greater than second number and third number. (First number= 23, Second number = 32 and third number = 15).

Ans.
```java
public class GreaterAnd {
    public static void main(String[] args) {
        int firstNumber = 23;
        int secondNumber = 32;
        int thirdNumber = 15;

        if (firstNumber>secondNumber && firstNumber>thirdNumber) {

            System.out.println("True");
        }
        else {

            System.out.println("False");
        }
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=57918:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" GreaterAnd
False

Process finished with exit code 0
```
