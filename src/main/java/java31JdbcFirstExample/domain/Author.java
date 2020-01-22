package java31JdbcFirstExample.domain;

public class Author {
    int isbn ;
    String title;
    String publisher;
    public Author(){
    }

    public Author(int isbn, String title, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.publisher = publisher;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }



    @Override
    public String toString() {
        return "Author{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

}
