package GetterSetter;

public class MobilePhone {
    private String brandName;
    private String colour;
    private int modelNo;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        if (modelNo < 25 || modelNo > 50) {
            this.modelNo = 0;
        }
        else {
            this.modelNo = modelNo;
        }
    }

    public static void main(String[] args) {
        MobilePhone model1 = new MobilePhone();
        MobilePhone model2 = new MobilePhone();

        model1.setBrandName("Samsung");
        model1.setColour("Black");
        model1.setModelNo(30);

        model2.setBrandName("I Phone");
        model2.setColour("Golden");
        model2.setModelNo(15);

        System.out.println("Brand Name: " + model1.getBrandName());
        System.out.println("Colour: " + model1.getColour());
        System.out.println("Model Number: " + model1.getModelNo());
        System.out.printf("%n");
        System.out.println("Brand Name: " + model2.getBrandName());
        System.out.println("Colour: " + model2.getColour());
        System.out.println("Model Number: " + model2.getModelNo());
    }
}
