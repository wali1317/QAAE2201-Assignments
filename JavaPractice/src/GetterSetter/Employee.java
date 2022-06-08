package GetterSetter;

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
