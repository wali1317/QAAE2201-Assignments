public class PositiveToNegative {
    public static void main(String[] args) {
        int positiveValue = 1317;
        int negativeValue = (~(positiveValue - 1));

        System.out.println("Positive value converted to negative value: " + negativeValue);
    }
}
