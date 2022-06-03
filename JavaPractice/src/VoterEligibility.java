public class VoterEligibility {
    public static void main(String[] args) {
    voterEligibility(21);

    }
    public static void voterEligibility(int age) {
        if (age >= 18)
            System.out.println("You are eligible for voting");
        else
            System.out.println("You are not eligible to vote");
    }
}
