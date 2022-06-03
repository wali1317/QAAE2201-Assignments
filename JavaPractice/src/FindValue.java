public class FindValue {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5};
        int Find = 3;
        boolean found = false;

        for (int n : number) {
            if (n == Find) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(Find + " is found.");
        else
            System.out.println(Find + " is not found.");
    }
}
