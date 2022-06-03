public class IncreaseByOne {
    public static void main(String[] args) {
        int value = 13;
        value = increment(13);
        System.out.println(value);
    }

    static int increment(int number) {
        int one = 1;

        /* Flip all the set bits until we find a 0 */
        while((number & one)!=0 ) {
            number = number^one;
            one <<= 1;
        }

        /* flip the rightmost 0 bit */
        number = number^one;
        return number;
    }
}
