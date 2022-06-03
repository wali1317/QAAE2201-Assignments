public class Light {
    boolean lightSwitchPosition;
    static String time = "day";
    int x;

    public Light(){
        System.out.println("This is a default constructor");
    }

    public Light(int y){
        System.out.println("I am in parameterized constructor argument:" + y);
    }

    public void turnOnLight(){
        lightSwitchPosition = true;
        System.out.println("Light is turned on");
    }

    public void turnOffLight(){
        lightSwitchPosition = false;
        System.out.println("Light is turned off");
    }

    public void createLightObjectByParameterizedOperator(){
        Light tubeLight = new Light(2);
        if(time=="day"){
            tubeLight.turnOffLight();
        }
        else {
            tubeLight.turnOnLight();
        }
    }
    public static void main(String[] args){
        Light bedLight = new Light();
        bedLight.createLightObjectByParameterizedOperator();
    }
}
