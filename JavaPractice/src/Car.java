import Assignment4.Calculator;

public class Car {
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        if (number <= 5) {
            this.number = 6;
        }
        else {
            this.number=number;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 =new Car();

        car1.setName("Toyota");
        car1.setNumber(4);

        System.out.println(car1.getName());
        System.out.println(car1.getNumber());

    }

}
