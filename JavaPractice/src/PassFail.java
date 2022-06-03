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
