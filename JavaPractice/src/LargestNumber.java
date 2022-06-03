public class LargestNumber {
    public static void main(String[] args) {
        int a = 76;
        int b = 54;
        int c = 89;
        int larger = (a>b)?a:b;
        int largest = (larger>c)?larger:c;
        System.out.println("The largest number among " + a + ", " + b + " and " + c + " is " + largest);
    }
}
