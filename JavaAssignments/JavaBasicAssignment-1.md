# Java Basic Assignment 1

### Q1. What is a programming language? What is Java and what is Java used for?

Ans. Programming Language: A programming language is a computer language that is used by programmers (developers) to 
communicate with computers. It is a set of instructions written in any specific language ( C, C++, Java, Python) to 
perform a specific task.

What is Java:

Java, not to be confused with Javascript, originated in California, developed by Sun Microsystems, a company founded 
in 1982 by Andreas Bechtolsheim, Vinod Khosla, and Scott McNeally. The language was released in 1995 and has continued 
to evolve consistently in order to keep up with the times.

Key features, properties and qualities of Java include:

- Concurrent: Java gives you the ability to run several programs, or part of a program at the same time, improving 
efficiency

- Class-based and object-oriented: Allows grouping of objects that can be used across projects, saving you time  

- Portable: Java runs on a ‘write once, use anywhere’ principle, meaning that once you have written code it can be 
used on other projects, rather than starting from scratch

- Secure: Once created, all Java code is converted to bytecode, which cannot be read by humans, protecting your work 
from untrusted sources and viruses

what is Java used for:

An enormous amount of applications and websites use java and will not work unless you have Java installed. Denying 
yourself Java is essentially denying yourself access to technological infrastructure.

From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet, Java is a go-to 
language. Some common uses of Java are listed below:

- 97% of Enterprise Desktops run Java.
- 89% of Desktops (or Computers) in the U.S. run Java.
- 9 Million Java Developers exist worldwide.
- 3 billion mobile phones run Java.
- There are currently over 5 billion Java Cards in use.
- 125 million TV devices run Java.
- 5 of the Top 5 Original Equipment Manufacturers Ship Java ME.

### Q2. Which version of Java you are working with? How can you find out the version of Java you are using?

Ans. I am using java version "1.8.0_333"

I found out by executing the following command in my terminal:
```
java -version
```

### Q3. What is IDE? Which IDE you are working with?

Ans. An IDE, or Integrated Development Environment, enables programmers to consolidate the different aspects of writing 
a computer program.

IDEs increase programmer productivity by combining common activities of writing software into a single application: 
editing source code, building executables, and debugging.

I am working with IntelliJ IDEA 2022.1 (Community Edition)

### Q4. What is source code? What is file extension for Java source code?

Ans. Source code is a group of text listing commands, likely with comments, that can be compiled and executed by a 
machine but written and read by a human. Source code is what allows computer programmers to specify, read, and write 
the code that governs the actions of a Java Virtual Machine (JVM).

The file extension of Java source code is .java

### Q5. What is the second stage of Java life cycle?

Ans. The second stage of Java Life cycle is Compiling the source code.

### Q6. Which compiler is used for compiling Java file?

Ans. javac (Java programming language compiler) is used for compiling Java file.

### Q7. What files are the input and output of the compilation stage?

Ans. The input is source file (.java) and output is Bycode File (.class)

### Q8. Which command is used to call Java compiler in terminal or CMD?

Ans. javac

### Q9. What is the third stage of Java Life Cycle?

Ans. The third stage of Java Life cycle is Executing the byte code.

### Q10. At which stage class loader is used and what function does it perform?

Ans. In third stage class loader is used. The file is loaded into memory by the class loader. The bytecode verifier 
confirms that the bytecode are valid and not hostile. Finally, the JVM reads the bytecode in memory and translates them 
into machine code. 

### Q11. Which unit is responsible for translating bytecodes into machine code?

Ans. JVM (Java virtual Machine)

### Q12. What is last stage of Java Life Cycle?

Ans. Execution/ Output

### Q13. Which command is used to run Java program in terminal or CMD?

Ans. java FileName.java

### Q14. At what stage bytecode verifier is used?

Ans. At execution stage the bytecode varifier confirms that the bytecode are valid and not hostile.

### Q15. What is JDK? Briefly explain the components of JDK.

Ans. JDK in Java is an abbreviation for Java Development Kit. It is a bundle of software development tools and 
supporting libraries combined with the Java Runtime Environment (JRE) and Java Virtual Machine (JVM).

The three vital software modules of JDK are:

JVM (Java Virtual Machine):
Java Virtual Machine is a software tool responsible for creating a run-time environment for the Java source code to run. The very powerful feature of Java, "Write once and run anywhere," is made possible by JVM.

The JVM stays right on top of the host operating system and converts the java source code into ByteCode (machine language), and executes the program.

JDK (Java Development Kit):
We can define the Java Development Kit as a software development environment responsible for creating a run-time environment for the Java source code to run.

JRE (Java Run-time Environment):
Java Run-time Environment is a software platform where all the Java Source codes are executed. JRE is responsible for integrating the software plugins, jar files, and support libraries necessary for the source code to run.

Components of JDK in Java
--------------------------
The fundamental components of JDK in Java are listed below.

- java

It acts as the deployment launcher in the older SUN java. It loads the class files and interprets the source code 
compiled by the javac compiler.

- javac

The javac specifies the java compiler to convert the source code into bytecode.

- javadoc

The javadoc generates documentation for the comments added in the source code.

- jar

The jar helps the archives to manage the jar files in the package library.

- jps

The jps stands for Java Virtual Machine Process Status Tool. It manages the active JVMs for the currently executing program.

- appletviewer

The appletviewer is designed to run and debug Java applets without the help of an internet browser.

- idlj

An IDL-to-Java compiler generates Java bindings from a given Java IDL file.

- javap

The javap acts as a file disassembler.

- JConsole

JConsole acts as a Java Management and Monitoring unit.

- javah

The javah is a stub-generator, and C-Header is employed to write native methods.

- javaws

The javaws acts as the Web Start launcher for JNLP applications.

- jhat

The jhat is a heap analysis tool.

- jmc

The jmc stands as an abbreviation for Java Mission Control.

### Q16. Name main components present in JVM and write function of each component.

Ans. The JVM consists of three distinct components:

- Library Manager: To store Java classes in Oracle Database, you use the loadjava command-line tool, which uses the SQL
CREATE JAVA statements to do its work. When called by the CREATE JAVA {SOURCE | CLASS | RESOURCE} statement, the 
library manager loads Java source, class, or resource files into the database. These Java schema objects are not 
accessed directly, and only an Oracle JVM uses them.

- Compiler: The Oracle JVM includes a standard Java compiler. When the CREATE JAVA SOURCE statement is run, it 
translates Java source files into architecture-neutral, one-byte instructions known as bytecodes. Each bytecode 
consists of an opcode followed by its operands. The resulting Java class files, which conform fully to the Java 
standard, are submitted to the interpreter at run time.

- Interpreter: To run Java programs, the Oracle JVM includes a standard Java 2 bytecode interpreter. The interpreter 
and the associated Java run-time system run standard Java class files. The run-time system supports native methods 
and call-in and call-out from the host environment.

- Class Loader: In response to requests from the run-time system, the Java class loader locates, loads, and initializes 
Java classes stored in the database. The class loader reads the class and generates the data structures needed to run 
it. Immutable data and metadata are loaded into initialize-once shared memory. As a result, less memory is required for
each session. The class loader attempts to resolve external references when necessary. In addition, if the source files 
are available, then the class loader calls the Java compiler automatically when Java class files must be recompiled.

- Verifier: Java class files are fully portable and conform to a well-defined format. The verifier prevents the 
inadvertent use of spoofed Java class files, which might alter program flow or violate access restrictions. Oracle 
security and Java security work with the verifier to protect your applications and data.

- Server-Side JDBC Internal Driver: JDBC is a standard and defines a set of Java classes providing vendor-independent 
access to relational data. The JDBC classes are modeled after ODBC and the X/Open SQL Call Level Interface (CLI) and 
provide standard features, such as simultaneous connections to several databases, transaction management, simple queries, 
calls to stored procedures, and streaming access to LONG column data.

Using low-level entry points, a specially tuned JDBC driver runs directly inside Oracle Database, providing fast access 
to Oracle data from Java stored procedures. The server-side JDBC internal driver complies fully with the standard JDBC 
specification. Tightly integrated with the database, the JDBC driver supports Oracle-specific data types, globalization 
character sets, and stored procedures. In addition, the client-side and server-side JDBC APIs are the same, which makes 
it easy to partition applications.

- Server-Side SQLJ Translator: SQLJ enables you to embed SQL statements in Java programs. It is more concise than JDBC 
and more responsive to static analysis and type checking. The SQLJ preprocessor, which itself is a Java program, takes 
as input a Java source file in which SQLJ clauses are embedded. Then, it translates the SQLJ clauses into Java class 
definitions that implement the specified SQL statements. The Java type system ensures that objects of those classes 
are called with the correct arguments.

A highly optimized SQLJ translator runs directly inside the database, where it provides run-time access to Oracle data 
using the server-side internal JDBC driver. SQLJ forms can include queries, data manipulation language (DML) statements, 
data definition language (DDL) statements, transaction control statements, and calls to stored procedures. The 
client-side and server-side SQLJ APIs are identical, making it easy to partition applications.

- System Classes: A set of classes that constitute a significant portion of the implementation of Java in Oracle Database environment 
is known as the System classes. These classes are defined in the SYS schema and exported for all users by public 
synonym. A class with the same name as one of the System classes can be defined in a schema other than the SYS 
schema. But, this is a bad practice because the alternate version of the class may behave in a manner that 
violates assumptions about the semantics of that class that are present in other System classes or in the underlying 
implementation of Java Virtual Machine. Oracle strongly discourages this practice.

### Q17. What is JRE? In which stage of Java life cycle JRE is used?

Ans. A Java runtime environment (JRE) is a set of components to create and run a Java application. A JRE is part of a 
Java development kit (JDK).

A JRE is made up of a Java virtual machine (JVM), Java class libraries, and the Java class loader. JDKs are used to 
develop Java software; JREs provide programming tools and deployment technologies; and JVMs execute Java programs.

In stage three.

### Q18. What is the syntax? Make a list of rules(you learned in a class) you should always follow while creating your Java application.

Ans. Syntax and rules in Java are how the programmer should write his code, much like grammar works in languages. The 
compiler doesn’t care about the syntax – but programmers need to adhere to the correct syntax. Otherwise, it will be 
challenging for other programmers to understand your code. If everyone adheres to the same syntax, then it becomes 
easier for everyone to understand what it is that is programmed!

List of Rules:

- Java is case-sensitive, which means, for example, Number and number have completely different meanings.
- Name of Methods start with a lowercase letter
- Name of a Class starts with a capital letter
- All commands / operations must end with a semicolon  ;
- Special characters do not work in Java

### Q19. How should we name our Java application?

Ans. In Java, the java file name should be always the same as a public class name and Camel Casing. There should not be 
any special character.  

### Q20. Write a structure of a simple Java application.

Ans. 

```java
public class MyApp {
    public static void main(String[] args) {
        int a = 2;
        int y = 3;
        int sum = a + y;
        System.out.println("Sum: " + sum);
    }
}
```
### Q21. What is the importance of comments in the program? Mention different ways in which we can write comments in a program.

Ans. Comments are text notes added to the program to provide explanatory information about the source code. They are 
used in a programming language to document the program and remind programmers of what tricky things they just did with 
the code and also helps the later generation for understanding and maintenance of code.

Comments in Java:

- use // for a single line. Everything from the // to the end of that line of the file is ignored by the program.

- use /* for multiple lines */

### Q22. Write a simple Java program to print the “Hello World” message. Keeping in mind stages of Java Life Cycle draw a flow chart to show journey of your first program

Ans.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

HelloWorld.java -------> Compiler --------> HelloWorld.class --------> Java VM --------> output



### Q23. What is file extension for Java executable code? At which stage of Java Life Cycle we get executable code?

Ans. The file extension of java executable code is .class. At final stage we get executable code

### Q24. When does compile time starts?

Ans. Compile time gets started as soon as you start compiling the java source code using javac compiler.

### Q25. Compile time ends with generation of which file?

Ans.  Compile time ends when a .class file is generated.

### Q26. Can you run the program without compilation? Try running your first program without compilation and share result.

Ans. No. After trying to run the first program without compilation I found the following result

```
My PC@DESKTOP-UBA01OH MINGW64 /d/IdeaProjects/QAAE2201/PracticeJava/First_Code
$ java HelloWorld.java 
Error: Could not find or load main class HelloWorld.java
```

### Q27. When does runtime start?

Ans. As soon as the programmer starts executing the program using java command, runtime gets started, and it ends when 
execution of program ended either successfully or unsuccessfully.

### Q28. During which phase .class file is loaded into memory runtime or compile time? Who loads .class file into memory?

Ans. At execution phase .class file is loaded into memory runtime or compile time. 

The Class Loaders are important and powerful tool in JVM, which loads Java classes into memory when required.