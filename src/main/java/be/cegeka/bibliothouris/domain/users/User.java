package be.cegeka.bibliothouris.domain.users;

import be.cegeka.bibliothouris.domain.books.Book;
import be.cegeka.bibliothouris.domain.extraInfo.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    private  long userID;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


    public User(long id, String name) {
        this.userID = id;
        this.name = name;
    }

    public User(){
    }
    public User(long id, String name, Address address){
        this.userID = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {return books;}

    public long getUserID() {
        return userID;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userID != user.userID) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (userID ^ (userID >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
