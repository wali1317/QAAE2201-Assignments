public class SwapValue {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        System.out.println("Before swapping: num1= "+num1 + ", num2= " + num2);

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("After swapping: num1= "+num1 + ", num2= " + num2);
    }
}
