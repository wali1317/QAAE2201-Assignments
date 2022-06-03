public class ReplaceCharacter {
    public static void main(String[] args) {
        String word = "Automation";
        int index = 9;
        char ch = 'm';

        System.out.println("Original String = " + word);

        word = word.substring(0, index) + ch;

        System.out.println("Modified String = " + word);
    }
}
