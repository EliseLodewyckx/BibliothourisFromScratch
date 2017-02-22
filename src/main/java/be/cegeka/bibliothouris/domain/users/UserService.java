package be.cegeka.bibliothouris.domain.users;

import be.cegeka.bibliothouris.domain.books.Book;
import be.cegeka.bibliothouris.domain.extraInfo.Address;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.concurrent.atomic.AtomicLong;

import static java.util.UUID.randomUUID;

@Named
public class UserService {

    @Inject
   // private UserRepository userRepository;
    private UserRepositoryWithRealDataBase userRepositoryWithRealDataBase;

    private final AtomicLong counter = new AtomicLong();

    public void addUser(String name){
        userRepositoryWithRealDataBase.save(new User(counter.incrementAndGet() , name));
    }

    public Iterable<User> getAllUsers() {
        return userRepositoryWithRealDataBase.findAll();
    }

    public void addUserWithBook(String userName, String bookTitle, String ISBN, String AuthorFirstName, String AuthorLastName) {
        User user = new User(counter.incrementAndGet(), userName);
        Book book = new Book(randomUUID().toString(), bookTitle, ISBN, AuthorFirstName, AuthorLastName);

        user.addBook(book);

        userRepositoryWithRealDataBase.save(user);
    }

    public void addUserWithAddress(String name, String city, String streetName, String addressNumber) {
        User user = new User(counter.incrementAndGet(), name, new Address(randomUUID().toString(), city,  streetName, addressNumber));
        userRepositoryWithRealDataBase.save(user);
    }
}
