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
