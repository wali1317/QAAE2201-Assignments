//import app.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test()
    public void addTest (){
        int a = 4;
        int b = 6;
        int expected_result = 10;
        System.out.println("Expected Value : " + expected_result);
        int actual_result = Calculator.add(a,b);

//        if (expected_result == actual_result) {
//            System.out.println("Addition Test Passed");
//        }
//        else if (expected_result != actual_result) {
//            System.out.println("Addition Test Failed");
//        }
        Assert.assertEquals(expected_result, actual_result);

        System.out.println("Oh Great app.Calculator App is working.........");
    }

    @Test
    public void deductTest() {
//        int a = 4;
//        int b = 6;
        int expected_result = 2;
        System.out.println("Expected Value : " + expected_result);
        int actual_result = Calculator.deduct();

//        if (expected_result == actual_result) {
//            System.out.println("Deduction Test Passed");
//        }
//        else if (expected_result != actual_result) {
//            System.out.println("Deduction Test Failed");
//        }
        Assert.assertEquals(expected_result, actual_result);
    }
}
