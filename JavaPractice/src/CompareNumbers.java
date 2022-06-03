public class CompareNumbers {
    public static void main(String[] args) {
        compareTwoNumbers(7, 5);
        compareThreeNumbers(15, 8, 42);
        compareFourNumbers(68, 4, 35, 48);
    }

    public static void compareTwoNumbers(int number1, int number2) {
        if (number1 > number2)
            System.out.println("Among two numbers, " + number1 + " is the greater number.");
        else
            System.out.println("Among two numbers, " + number2 + " is the greater number.");
    }

    public static void compareThreeNumbers(int number1, int number2, int number3) {
        int larger = number1 > number2 ? number1 : number2;
        int largest = number3 > larger ? number3 : larger;

        System.out.println("Among three numbers, " + largest + " is the greatest number.");
    }

    public static void compareFourNumbers(int number1, int number2, int number3, int number4) {
        int temp = number1 > number2 ? number1 : number2;
        int larger = number3 > temp ? number3 : temp;
        int largest = number4 > larger ? number4 : larger;

        System.out.println("Among four numbers, " + largest + " is the greatest number.");
    }
}