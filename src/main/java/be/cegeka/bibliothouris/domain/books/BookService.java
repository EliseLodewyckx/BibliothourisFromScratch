package be.cegeka.bibliothouris.domain.books;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

import static java.util.UUID.randomUUID;

@Named
public class BookService {

    @Inject
    private BookRepositoryDatabase bookRepositoryDatabase;

    public final AtomicLong counter = new AtomicLong();

    public void addBook(String title, String isbn, String authorFirstName, String authorLastName){
       bookRepositoryDatabase.save(new Book(randomUUID().toString(), title, isbn, authorFirstName, authorLastName));
    }

    public Iterable<Book> getAllBooks(){
        return bookRepositoryDatabase.findAll();
    }

    public Book findByTitle(String title) {
        return bookRepositoryDatabase.findByTitle(title);
    }
}
