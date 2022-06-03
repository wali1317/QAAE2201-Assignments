import java.util.Scanner;

public class CompareEquality {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter First number: ");

        int num1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter Second number: ");

        int num2 = number2.nextInt();

        Scanner number3 = new Scanner(System.in);
        System.out.println("Enter Third number: ");

        int num3 = number3.nextInt();

        equity(num1, num2, num3);

    }

    public static void equity( int a, int b, int c) {
        if ( a==b && b==c)
            System.out.println("All numbers are equal");
        else if (a !=b && a!=c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal nor different");
    }
}
