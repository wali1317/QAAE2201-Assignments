public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String t, String s, String r) {
        title = t;
        studio = s;
        rating = r;
    }

    public Movie (String t, String s) {
        title = t;
        studio = s;
        rating = "PG";
    }
}
