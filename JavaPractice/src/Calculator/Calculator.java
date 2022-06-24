package Calculator;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello....");
    }

    public static int add(int a, int b) {
        int result = a + b +1;
        System.out.println("Added Value : " + result);
        String calculatorName = "Casio 570";
        return result;
    }

    public static int deduct() {
        int a = 6;
        int b =4;
        int result = a - b;
        System.out.println("Deducted Value : " + result);
        return result;
    }
}
