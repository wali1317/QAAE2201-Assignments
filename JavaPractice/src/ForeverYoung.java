public class ForeverYoung {
    private String name;
    private int age;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>18) {
            System.out.println("Age is just a number");
        }
        else {
            this.age = age;
            System.out.println("Your age is " + getAge() + " years");
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        ForeverYoung data1 = new ForeverYoung();
        data1.setName("Yara Alveena");
        System.out.println(data1.getName() + ",");
        data1.setAge(15);
        data1.setMessage("Whatever may be the age, to me you are Forever Young");

        System.out.println(data1.getMessage());
    }
}
