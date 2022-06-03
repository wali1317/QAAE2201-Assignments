import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check whether positive or negative\n");

        int number = input.nextInt();
        positiveOrNegative(number);

    }
    public static void positiveOrNegative(int number) {
        if (number > 0)
            System.out.println("This is a positive number.");
        else if (number < 0)
            System.out.println("This is a negative number.");
        else
            System.out.println("This is zero");
    }
}
