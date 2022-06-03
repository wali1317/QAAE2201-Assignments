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
