public class SubString {
    public static void main(String[] args) {
        String sentence = "Let this be the last year tha you doubt yourself, fear, change or quit. Never give up";
        String new_sentence = sentence.substring(10, 26);

        System.out.println("Old = " + sentence);
        System.out.println("New: " + new_sentence);
    }
}
