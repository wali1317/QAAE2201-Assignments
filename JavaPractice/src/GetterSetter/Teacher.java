package GetterSetter;

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
