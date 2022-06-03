import com.sun.javafx.event.EventDispatchTreeImpl;

public class StringToInt {
    public static void main(String[] args) {
        String value1 = "12";
        int value2 = Integer.valueOf(value1);

        System.out.println("String Type value was:" + value1);
        System.out.println("Converted value to Integer using Integer.valueof is: " + value2);

    }
}
