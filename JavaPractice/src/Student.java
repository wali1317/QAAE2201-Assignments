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
