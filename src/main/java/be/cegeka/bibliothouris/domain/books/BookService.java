package be.cegeka.bibliothouris.domain.books;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

@Named
public class BookService {

    @Inject
    private BookRepositoryDatabase bookRepositoryDatabase;

    public final AtomicLong counter = new AtomicLong();

    public void addBook(String title, String isbn, String authorFirstName, String authorLastName){
       bookRepositoryDatabase.save(new Book(counter.incrementAndGet(), title, isbn, authorFirstName, authorLastName));
    }

    public Iterable<Book> getAllBooks(){
        return bookRepositoryDatabase.findAll();
    }
}
