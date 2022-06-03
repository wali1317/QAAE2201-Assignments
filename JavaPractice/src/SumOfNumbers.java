public class SumOfNumbers {
    public static void main(String arg[])
    {
        int input = 5;
        int sum = 0;

        for(int i = 1; i <= input; i++)
        {
            sum = sum + i;
            System.out.println("Sum after adding " + i + " is : " + sum);
        }
        System.out.println();
        System.out.println("Sum of numbers till " + input + " is " + sum);
    }
}
