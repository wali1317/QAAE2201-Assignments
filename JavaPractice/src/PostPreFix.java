public class PostPreFix {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;  // x is incremented to 11, the original value of x (which is 10) is copied into y. So Y now equals 10.

        System.out.println("y: " + y);
        System.out.println("x: " + x);

        int a = 10;
        int b = ++a; // a is incremented to 11, the new value of a (which is 11) is copied into b. So b now equals 11.

        System.out.println("b: " + b);
        System.out.println("a: " + a);
    }
}
