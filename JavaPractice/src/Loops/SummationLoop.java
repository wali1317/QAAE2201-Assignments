package Loops;

import java.util.Scanner;

public class SummationLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum;
        char op;
        int number1;
        int number2;

        do{
            System.out.println("Enter first number");
            number1 = input.nextInt();
            System.out.println("Enter second number");
            number2 = input.nextInt();
            sum = number1 + number2;
            System.out.println("Sum: " + sum);
            System.out.println("Do You Wish to perform another Operation?");
            op = input.next().charAt(0);

        }
        while(op == 'Y' || op == 'y');
    }
}
