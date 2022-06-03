import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        int Min_char = 10;
        int Num_Digits = 2;
        int digitCounter = 0;

        System.out.println("Enter the Password\n");
        Scanner input = new Scanner(System.in);

        String password = input.nextLine();

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c))
                digitCounter++;
        }

        if (password.length() >= Min_char && digitCounter >= Num_Digits) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Your Password does not contain the following: ");

            if (password.length() < Min_char)
                System.out.println("At least 10 characters");

            if (digitCounter < Num_Digits)
                System.out.println("Minimum 2 number of numeric digits");
        }
    }
}
