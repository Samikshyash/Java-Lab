package Encapsulation;

/*​​Library System:​​Design a class for a library book​​with private attributes such as title,​
​author, and publication date. Use encapsulation to protect the internal state.​ */
public class Library {
    private String title;
    private String author;
    private String date;

    public void setTitle(String title) {
        
        this.title = title;
    };

    public void setAuthor(String author) {
        this.author = author;
    };

    public void setPublicationDate(String date) {
        this.date = date;
    };

    public String getTitle() {
        return title;
    };

    public String getAuthor() {
        return author;
    };

    public String getPublicationDate() {
        return date;
    };

}

class Main1 {
    public static void main(String[] args) {
        Library book1 = new Library();
        book1.setAuthor("James");
        book1.setTitle("Java");
        book1.setPublicationDate("2025-06-26");
        System.out.println(
                " Book Title: " + book1.getTitle() + "," +
                        " Author: " + book1.getAuthor() + "," +
                        " Publication date : " + book1.getPublicationDate());
    }
}
