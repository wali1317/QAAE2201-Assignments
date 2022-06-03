public class ArithmeticMethod {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 3;

        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + sum(number1, number2));
        System.out.println("Product of " + number1 + " and " + number2 + " is: " + multiplication(number1, number2));
        System.out.println("Difference of " + number1 + " and " + number2 + " is: " + subtraction(number1, number2));
        System.out.println("Quotient of " + number1 + " and " + number2 + " is: " + division(number1, number2));
    }

    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int multiplication(int x, int y) {
        int prod = x * y;
        return prod;
    }

    public static int subtraction(int x, int y) {
        int diff = x -y;
        return  diff;
    }

    public static float division(int x, int y) {
        float div = ((float)x) / y;
        return div;
    }
}
