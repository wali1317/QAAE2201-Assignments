import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0, k;

        System.out.println("Enter First number: ");
        number1 = input.nextInt();

        System.out.println("Enter Second Number: ");
        number2 = input.nextInt();

        k = number1 % number2;

        if (k == 0)
            System.out.println(+ number1 + " is a multiple of " + number2);
        else
            System.out.println(+ number1 + " is not a multiple of " + number2);

        }
}
