package GetterSetter;

public class BankAccount {
    private String name;
    private String email;
    private int id;
    private String accountType;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        if(id < 10){
            this.id = 11;
        }
        else {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setAccountType( String accountType) {
        if (accountType=="s") {
            this.accountType = "Savings Account";
        }
        else if (accountType == "c") {
            this.accountType = "Current Account";
        }
        else {
            this.accountType = "You have entered wrong value. Please enter 'c' or 's' as account type.\n" +
                    "Remember values are case sensitive";
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.setName("Arish Abtahi");
        account1.setEmail("arishabtahi@gmail.com");
        account1.setId(15);
        account1.setAccountType("c");

        account2.setName("Yara Alveena");
        account2.setEmail("yaraalveena@gmail.com");
        account2.setId(7);
        account2.setAccountType("s");

        account3.setName("Wali ur Rashid");
        account3.setEmail("wali@gmail.com");
        account3.setId(20);
        account3.setAccountType("S");

        System.out.printf("%n");
        System.out.println("Account Name: " + account1.getName());
        System.out.println("Email Address: " + account1.getEmail());
        System.out.println("Account ID: " + account1.getId());
        System.out.println("Account Type: " + account1.getAccountType());
        System.out.printf("%n");
        System.out.printf("%n");
        System.out.println("Account Name: " + account2.getName());
        System.out.println("Email Address: " + account2.getEmail());
        System.out.println("Account ID: " + account2.getId());
        System.out.println("Account Type: " + account2.getAccountType());
        System.out.printf("%n");
        System.out.println("Account Name: " + account3.getName());
        System.out.println("Email Address: " + account3.getEmail());
        System.out.println("Account ID: " + account3.getId());
        System.out.println("Account Type: " + account3.getAccountType());
    }
}
