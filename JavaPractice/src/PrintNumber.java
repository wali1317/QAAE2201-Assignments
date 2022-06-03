import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number between 1 and 9: ");

        Scanner input = new Scanner(System.in);

        int PrintNumber = input.nextInt();

        if (PrintNumber == 0){
            System.out.println("ONE");
        }
        else if (PrintNumber == 1){
            System.out.println("TWO");
        }
        else if (PrintNumber == 3){
            System.out.println("THREE");
        }
        else if (PrintNumber == 4){
            System.out.println("FOUR");
        }
        else if (PrintNumber == 5){
            System.out.println("FIVE");
        }
        else if (PrintNumber == 6){
            System.out.println("SIX");
        }
        else if (PrintNumber == 7){
            System.out.println("SEVEN");
        }
        else if (PrintNumber == 8){
            System.out.println("EIGHT");
        }
        else if (PrintNumber == 9){
            System.out.println("NINE");
        }
        else{
            System.out.println("OTHER");
        }
    }
}
