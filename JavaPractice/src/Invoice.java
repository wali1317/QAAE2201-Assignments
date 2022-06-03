public class Invoice {
    String partNumber;
    String partDescription;
    int itemPurchased;
    double pricePerItem;

    public static void main(String[] args) {
        Invoice a = new Invoice("BL5503", "Impeller", 10, 25.50);
        System.out.println(a.getInvoice());
    }

    public Invoice(String partNumber, String partDescription, int itemPurchased, double pricePerItem){

    }
    public double getInvoice() {
//        if (itemPurchased < 0 || pricePerItem < 0){
//            return 0.0;
//        }
//        else {
            return itemPurchased * pricePerItem;
//        }

    }
}
