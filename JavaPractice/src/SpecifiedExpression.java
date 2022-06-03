public class SpecifiedExpression {
    public static void main(String[] args) {
        int result1 = (301 + 0)/5;
        double result2 = 7.0e-6 * 10000000.1;
        boolean result3 = true && true;
        boolean result4 = false && true;
        boolean result5 = (false && false) || (true && true);
        boolean result6 = (false || false) && (true && true);

        System.out.println("(301 + 0)/5 = " + result1);
        System.out.println("7.0e-6 * 10000000.1 = " + result2);
        System.out.println("true && true = " + result3);
        System.out.println("false && true = " + result4);
        System.out.println("(false && false) || (true && true) = " + result5);
        System.out.println("(false || false) && (true && true) = " + result6);
    }
}
