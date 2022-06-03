public class PersonalInfo {
    public static void main(String[] args) {

        String name = "WALI UR RASHID";
        String email = "wali27jcc@gmail.com";
        String address = "3702 Nicholson Street, Hyattsville \n" +
                "Maryland-20782";
        String input = "2408796290";
        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        System.out.println("Name: " +name);
        System.out.println("Email: " +email);
        System.out.println("Address: " +address);
        System.out.println("Phone No: " +number);
    }
}
