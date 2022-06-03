public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title =title;
    }

    public void setAuthor(String author) {
        this.author =author;
    }

    public void setPrice(double price) {
        this.price =price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "The details of the book are: " + title + ", " + author + ", " + price;
    }
}
