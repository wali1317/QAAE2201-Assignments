public class NewObject {
    public static void main(String[] args) {
        NewObject object101 = new NewObject();
        object101.addNewObject("String class",0);
        object101.addNewObject("Build", 1);
        object101.addNewObject("MainObject", 2);

    }

    public void addNewObject(String object, int indexNumber) {
        String[] listOfObjects = new String[6];
        System.out.println("Add an object");
        System.out.println("Size of the list of object before insertion: " + listOfObjects[0]);
        listOfObjects[indexNumber] = object;
        int i;
        for (i = 0; i < listOfObjects.length; i++) {
            String item = listOfObjects[i];
            System.out.println("Index " + i + " Object from the list " + item);
        }
    }
    public void deleteObject(){
        System.out.println("Delete an object from the list");
    }

    public void updateObject () {
        System.out.println("Update an object from the list");
    }
}
