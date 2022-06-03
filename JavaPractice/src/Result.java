public class Result {
    public static void main(String[] args) {
        int subject1 = 87;
        int subject2 = 39;
        int subject3 = 52;
        int totalMarks = (subject1 + subject2 + subject3);
        int percentage = ((totalMarks * 100 ) / 300);

        System.out.println("Total Marks obtained : " + totalMarks);
        System.out.println("Total Percentage : " + percentage + "%");
    }
}
