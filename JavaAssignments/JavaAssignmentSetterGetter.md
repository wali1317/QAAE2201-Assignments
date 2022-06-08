# Practice Assignment (Java Assignment Setter Getter)

##### Q1. Create a class named "Teacher". This class has 3 private variables: String name, String subject, int students. Create following methods: setName: This method set the value for name variable. getName: This method returns the value of vraiable name. setSubject: This method set the value for subject variable. getSubject: This method returns the value of vraiable subject. setStudents: This method set the value for student variable. getStudents: This method returns the value of student.

Ans.

```java
public class Teacher {
    private String name;
    private String subject;
    private int students;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getStudents() {
        return students;
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        teacher1.setName("Jahidul Islam");
        teacher1.setSubject("QAAE");
        teacher1.setStudents(15);

        System.out.println("Teacher's Name: " + teacher1.getName());
        System.out.println("Subject: " + teacher1.getSubject());
        System.out.println("Total Number of Students: " + teacher1.getStudents());
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=56595:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" GetterSetter.Teacher
Teacher's Name: Jahidul Islam
Subject: QAAE
Total Number of Students: 15

Process finished with exit code 0
```

##### Q2. Create a class named "MobilePhone". This class has 3 private variables: String brandName, String colour, int modelNo. Create following methods: setBrandName: This method set the value for brandName variable. getBrandName: This method returns the value of vraiable brandName. setColour: This method set the value for colour variable. getColour: This method returns the value of vraiable colour. setModelNo: If value of modelNo is less than 25 and more than 50 it sets value of modelNo to 0. In other case it will set the value to whatever value user has passed. getModelNo: This method returns the value of modelNo.

Ans.
```java
public class MobilePhone {
    private String brandName;
    private String colour;
    private int modelNo;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        if (modelNo < 25 || modelNo > 50) {
            this.modelNo = 0;
        }
        else {
            this.modelNo = modelNo;
        }
    }

    public static void main(String[] args) {
        MobilePhone model1 = new MobilePhone();
        MobilePhone model2 = new MobilePhone();

        model1.setBrandName("Samsung");
        model1.setColour("Black");
        model1.setModelNo(30);

        model2.setBrandName("I Phone");
        model2.setColour("Golden");
        model2.setModelNo(15);

        System.out.println("Brand Name: " + model1.getBrandName());
        System.out.println("Colour: " + model1.getColour());
        System.out.println("Model Number: " + model1.getModelNo());
        System.out.printf("%n");
        System.out.println("Brand Name: " + model2.getBrandName());
        System.out.println("Colour: " + model2.getColour());
        System.out.println("Model Number: " + model2.getModelNo());
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=56602:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" GetterSetter.MobilePhone
Brand Name: Samsung
Colour: Black
Model Number: 30

Brand Name: I Phone
Colour: Golden
Model Number: 0

Process finished with exit code 0
```

##### Q3. Create a class named "Employee". This class has 4 private variables: String name, String email, int id and float salary. Create following methods: setName: This method set the value for name variable. getName: This method returns the value of vraiable name. setEmail: This method set the value for email variable. getEmail: This method returns the value of vraiable email. setId: If value of id is more than 50 it sets value of id to 0. In other case it will set the value to whatever value user has passed. getId: This method returns the value of vraiable id. setSalary: This method set the value for salary variable. getSalary: This method display the message "It is not a good manner to ask someone's salary" if salary is more than 10000 or less than 5000. In other case it will print the salary.

Ans.
```java
public class Employee {
    private String name;
    private String email;
    private int id;
    private float salary;

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 50) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    public float getSalary() {
        if (salary < 5000 || salary > 10000) {
            System.out.println("It is not a good manner to ask someone's salary");
            return 0;
        } else {
            return salary;
        }
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setName("ARISH ABTAHI");
        employee1.setEmail("arishabtahi@gmail.com");
        employee1.setId(51);
        employee1.setSalary(3000);

        employee2.setName("YARA ALVEENA");
        employee2.setEmail("yaraalveena@gmail.com");
        employee2.setId(45);
        employee2.setSalary(8000);

        System.out.println("Name of the employee: " + employee1.getName());
        System.out.println("Email Address: " + employee1.getEmail());
        System.out.println("ID No: " + employee1.getId());
        System.out.println("Salary: $" + employee1.getSalary());
        System.out.printf("%n");
        System.out.println("Name of the employee: " + employee2.getName());
        System.out.println("Email Address: " + employee2.getEmail());
        System.out.println("ID No: " + employee2.getId());
        System.out.println("Salary: $" + employee2.getSalary());
    }
}
```

Output:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=62129:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" GetterSetter.Employee
Name of the employee: ARISH ABTAHI
Email Address: arishabtahi@gmail.com
ID No: 0
It is not a good manner to ask someone's salary
Salary: $0.0

Name of the employee: YARA ALVEENA
Email Address: yaraalveena@gmail.com
ID No: 45
Salary: $8000.0

Process finished with exit code 0
```

##### Q4. Create a class named "BankAccount". This class has 4 private variables: String name, String email, int id and String accountType. Create following methods: setName: This method set the value for name variable. getName: This method returns the value of vraiable name. setEmail: This method set the value for email variable. getEmail: This method returns the value of vraiable email. setId: If value of id is less than 10 it sets value of id to 11. In other case it will set the value to whatever value user has passed. getId: This method returns the value of vraiable id. setAccountType:(For this method you can pass two values only "s" or "c") It sets the value of accountType variable to "Savings Account" if user pass value "s" in other case when user will pass value "c" it will set value of AccountType variable to "Current Account". getAccountType: This method returns the value of vriable accountType.

Ans.
```java
public class BankAccount {
    private String name;
    private String email;
    private int id;
    private String accountType;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        if(id < 10){
            this.id = 11;
        }
        else {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setAccountType( String accountType) {
        if (accountType=="s") {
            this.accountType = "Savings Account";
        }
        else if (accountType == "c") {
            this.accountType = "Current Account";
        }
        else {
            this.accountType = "You have entered wrong value. Please enter 'c' or 's' as account type.\n" +
                    "Remember values are case sensitive";
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.setName("Arish Abtahi");
        account1.setEmail("arishabtahi@gmail.com");
        account1.setId(15);
        account1.setAccountType("c");

        account2.setName("Yara Alveena");
        account2.setEmail("yaraalveena@gmail.com");
        account2.setId(7);
        account2.setAccountType("s");

        account3.setName("Wali ur Rashid");
        account3.setEmail("wali@gmail.com");
        account3.setId(20);
        account3.setAccountType("S");

        System.out.printf("%n");
        System.out.println("Account Name: " + account1.getName());
        System.out.println("Email Address: " + account1.getEmail());
        System.out.println("Account ID: " + account1.getId());
        System.out.println("Account Type: " + account1.getAccountType());
        System.out.printf("%n");
        System.out.printf("%n");
        System.out.println("Account Name: " + account2.getName());
        System.out.println("Email Address: " + account2.getEmail());
        System.out.println("Account ID: " + account2.getId());
        System.out.println("Account Type: " + account2.getAccountType());
        System.out.printf("%n");
        System.out.println("Account Name: " + account3.getName());
        System.out.println("Email Address: " + account3.getEmail());
        System.out.println("Account ID: " + account3.getId());
        System.out.println("Account Type: " + account3.getAccountType());
    }
}
```

OutPut:

```
"C:\Program Files\Java\jdk1.8.0_333\bin\java.exe" "-javaagent:D:\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=62142:D:\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_333\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_333\jre\lib\rt.jar;D:\IdeaProjects\QAAE2201\QAAE2201-Assignments\JavaPractice\out\production\JavaPractice" GetterSetter.BankAccount

Account Name: Arish Abtahi
Email Address: arishabtahi@gmail.com
Account ID: 15
Account Type: Current Account


Account Name: Yara Alveena
Email Address: yaraalveena@gmail.com
Account ID: 11
Account Type: Savings Account

Account Name: Wali ur Rashid
Email Address: wali@gmail.com
Account ID: 20
Account Type: You have entered wrong value. Please enter 'c' or 's' as account type.
Remember values are case sensitive

Process finished with exit code 0
```