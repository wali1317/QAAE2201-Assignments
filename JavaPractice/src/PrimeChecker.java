import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        int number = Integer.MAX_VALUE;
        System.out.println("Enter the Number to check if prime or not \n");
        Scanner input = new Scanner(System.in);

        while (number != 0) {
            number = input.nextInt();
            System.out.printf("Does %d is prime Number? %s %n", number, isPrimeOrNot(number));
        }
    }

    public static String isPrimeOrNot(int num) {
        if (num < 0) {
            return "Not Valid";
        }
        if (num == 0 || num ==1) {
            return "No, not a Prime number";
        }
        if (num == 2 || num == 3) {
            return "Yes, Prime Number";
        }
        if ((num * num -1) % 24 == 0) {
            return "Yes, Prime Number";
        } else {
            return "No, not a Prime number";
        }
    }
}
