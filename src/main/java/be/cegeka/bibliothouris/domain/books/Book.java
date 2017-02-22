package be.cegeka.bibliothouris.domain.books;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @Column(name = "book")
    private String bookID;

    @Column(name = "title")
    private String title;

    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "authorFirstName")
    private String authorFirstName;

    @Column(name = "authorLastName")
    private String authorLastName;

    public Book(String id,String title, String isbn, String authorFirstName, String authorLastName){
        this.bookID = id;
        this.title = title;
        this.ISBN = isbn;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public Book(String id, String title){
        this.bookID = id;
        this.title = title;
    }
    public Book(){

    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN(){return ISBN;}

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }
}
