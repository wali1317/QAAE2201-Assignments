package Loops;

public class MultiplicationTableWhileLoop {
    public static void main(String[] args) {

        int number = 5;
        int i = 1;
        while (i<=10)
        {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
            i++;
        }
    }
}
