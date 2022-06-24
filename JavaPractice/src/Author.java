public class Author {
    public String first_name;
    public String Last_name;

    public Author(String first, String Last_name){
        first_name = first;
        this.Last_name = Last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public static void main(String[] args) {
        Author author = new Author("Wali", "Rashid");
        System.out.println(author.getFirst_name());
    }
}

