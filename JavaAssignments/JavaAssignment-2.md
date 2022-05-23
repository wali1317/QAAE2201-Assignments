#### Java Basic Assignment 2

### Q1. What do you understand by variable?

Ans. A variable is a container that holds values that are used in a Java program. Every variable must be declared to 
use a data type. For example, a variable could be declared to use one of the eight primitive data types: byte, short, 
int, long, float, double, char or boolean. And, every variable must be given an initial value before it can be used.

Example: int myAge = 21;

The variable "myAge" is declared to be an int data type and initialized to a value of 21.

### Q2. Name types of variables.

Ans. There are three types of variables in java:

- local variable
- instance variable
- static variable

### Q3. What is the difference between static and instance variables?

Ans. Static Variable:

1. A static variable is a property of a class.
2. A static variable is created only once when the classloader loads the class.
3. A static variable is used when you want to store a value that represents all the instances like count, sum, 
average etc.

Instance Variable:
1. An instance variable is a property of an instance.
2. An instance variable is created everytime an instance is created.
3. An instance variable is used to store a value that represents property of single instance.

### Q4. Which type of variable requires a keyword to determine its scope?

Ans. Static variable.

### Q5. Which thing specifies the size and type of variable?

Ans. Data type

### Q6. Can we use a variable without declaring it?

Ans. No

### Q7. How can we declare a variable?

Ans. To declare (create) a variable, we have to specify the type, leave at least one space, then the name for the 
variable and end the line with a semicolon ( ; )

### Q8. How can we initialize a variable?

Ans. We can initialize the variable by specifying an equal sign and a value. Keep in mind. You can initialize the 
variable by specifying an equal sign and a value. Keep in mind that the initialization expression must result in a 
value of the same (or compatible) type as that specified for the variable.

### Q9. Make a list of common Java data types.

Ans. 

1. Primitive Data type:
   - short
   - int
   - long
   - byte
   - char
   - boolean
   - float
   - double
2. Strings
3. Reference Types
   - class
   - interface
   - array
   
### Q10. Which data types are created by programmers and are not defined by Java?

Ans. Class, object, array, string, and interface are called non-primitive data types in Java. These data types are not 
predefined in Java. They are created by programmers.

### Q11. Java has how many primitive data types?

Ans. Java has 8(eight) type primitive type data.

### Q12. What data type would you use for storing the number of students in a class?

Ans. byte

### Q13. What data type would you use for storing the average test score in a class?

Ans. float

### Q14. How would you declare a variable storing the tax rate?

Ans. double

### Q15. How would you declare a variable that tells the grade (A, B, C, or D) of students?

Ans. char

### Q16. List the name conventions you learned in class about variables.

Ans. 
1. Variable names should not start with _ or dollar sign $ characters, even though both are allowed.
2. Variable names should be short yet meaningful.
3. The choice of a variable name should be mnemonic - that is, designed to indicate the casual observer the 
indent of its use.
4. One-character variable names should be avoided except the temporary "throwaway" variables. Common names for temporary 
variables are i, j, k, m, and n for integers; c, d, and e for characters. 

### Q17. Name the Data type used for an object 'Pen'.

Ans. String

### Q18. Write a program and declare the variable of each data type you learned in class. Initialize each variable with appropriate values and print them.

Ans.
```java
public class DataType {
    public static void main(String[] args) {
        short x = 32760;
        System.out.println("variable 'x' is a 'short' type data. Value is " + x);

        int y = 1936784593;
        System.out.println("variable 'y' is a 'int' type data. Value is " + y);

        long z = 90254853325L;
        System.out.println("variable 'z' is a 'long' type data. Value is " + z);

        byte a = 120;
        System.out.println("variable 'a' is a 'byte' type data. Value is " + a);

        char grade = 'A';
        System.out.println("variable 'grade' is a 'char' type data. Value is " + grade);

        boolean areYouGood = true;
        System.out.println("variable 'areYouGood' is a 'boolean' type data. Value is " + areYouGood);

        float value1 = 8;
        System.out.println("variable 'value1' is a 'float' type data. Value is " + value1);

        double value2 = 8.9;
        System.out.println("variable 'value2' is a 'double' type data. Value is " + value2);


    }
}
```

OUtput:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=58880:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\PracticeJava\out\production\PracticeJava" DataType
variable 'x' is a 'short' type data. Value is 32760
variable 'y' is a 'int' type data. Value is 1936784593
variable 'z' is a 'long' type data. Value is 90254853325
variable 'a' is a 'byte' type data. Value is 120
variable 'grade' is a 'char' type data. Value is A
variable 'areYouGood' is a 'boolean' type data. Value is true
variable 'value1' is a 'float' type data. Value is 8.0
variable 'value2' is a 'double' type data. Value is 8.9

Process finished with exit code 0
```

### Q19. Write a program to print your name, email, address, phone number, and id.

Ans.
```java
public class PersonalInfo {
    public static void main(String[] args) {

        String name = "WALI UR RASHID";
        String email = "wali27jcc@gmail.com";
        String address = "3702 Nicholson Street, Hyattsville \n" +
                "Maryland-20782";
        String input = "2408796290";
        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        System.out.println("Name: " +name);
        System.out.println("Email: " +email);
        System.out.println("Address: " +address);
        System.out.println("Phone No: " +number);
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=56443:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\PracticeJava\out\production\PracticeJava" PersonalInfo
Name: WALI UR RASHID
Email: wali27jcc@gmail.com
Address: 3702 Nicholson Street, Hyattsville 
Maryland-20782
Phone No: (240) 879-6290

Process finished with exit code 0
```

### Q20. What do you understand by typecasting?

Ans. You can convert one data type to another, by an operation called 'casting'. Converting from one type to another is 
necessary, because sometimes a function f accept type A, and your expression e has type B and you want to do f(e). So, 
you need to convert your e to type A.

### Q21.In which type casting Java automatically converts one data type to another data type?

Ans. In Widening Casting, Java automatically converts one data type to another data type. The numeric data types are 
compatible with each other but no automatic conversion is supported from numeric type to char or boolean. Also, char 
and boolean are not compatible with each other.

Automatic conversion happens for a smaller type to a larger type size:

byte ----> short ----> int ----> long ----> float ----> double

### Q22.Write a program to convert int to double and print a message stating which type casting you did?

Ans.

```java
public class WideningCasting {
    public static void main(String[] args)  {
        int value1 = 12;
        double value2 = value1;

        System.out.println("Integer value was " + value1);
        System.out.println("Value is converted into double using Widening Casting: " + value2);
    }
}
```

Out put:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=56200:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\PracticeJava\out\production\PracticeJava" WideningCasting
Integer value was 12
Value is converted into double using Widening Casting: 12.0

Process finished with exit code 0
```