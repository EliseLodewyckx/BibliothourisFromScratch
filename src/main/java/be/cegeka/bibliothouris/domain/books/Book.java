package be.cegeka.bibliothouris.domain.books;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private long id;
    private String title;
    private String ISBN;
    private String authorFirstName;
    private String authorLastName;

    public Book(long id,String title, String isbn, String authorFirstName, String authorLastName){
        this.id = id;
        this.title = title;
        this.ISBN = isbn;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    public Book(){

    }

    public long getId() {
        return id;
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
