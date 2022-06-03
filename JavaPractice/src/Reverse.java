public class Reverse {
    public static void main(String[] args) {
        String sentence = "Java is my favorite";
        System.out.println("Original String: " + sentence);
        StringBuilder reverseString = new StringBuilder(sentence);
        reverseString.reverse();
        String result = reverseString.toString();

        System.out.println("Reversed String: " + result);
    }
}
