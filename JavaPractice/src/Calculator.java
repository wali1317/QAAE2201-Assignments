public class Calculator {
    public int addTwoNumbers(int number1, int number2) {
        int answer = number1 + number2;
        System.out.println(answer);
        return answer;
    }

    public int deductTwoNumbers(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    public int addThreeNumber(int num1, int num2, int num3) {
        int answer = num1 + num2 + num3;
        return answer;
    }

    public int deductThreeNumber(int num1, int num2, int num3) {
        int answer = num1 - num2 - num3;
        return answer;
    }
}