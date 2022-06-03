import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner inbox = new Scanner(System.in);

        System.out.println("Enter the number to check odd or even: ");

        int number = inbox.nextInt();
        OddEven(number);

    }
    public static void OddEven(int number) {
        if(number % 2 == 0)
            System.out.println(number+" is even");
        else
            System.out.println(number+" is odd");
    }
}
