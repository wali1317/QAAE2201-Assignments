public class SmallestNumber {
    public static void main(String[] args) {
    int a = 76;
    int b = 54;
    int c = 89;
    int smaller = (a<b)?a:b;
    int smallest = (smaller<c)?smaller:c;
    System.out.println("The smallest number among " + a + ", " + b + " and " + c + " is " + smallest);
    }
}
