package be.cegeka.bibliothouris.application;

import be.cegeka.bibliothouris.domain.books.Book;
import be.cegeka.bibliothouris.domain.books.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
@RequestMapping("/book")
public class BookController {

    @Inject
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    Iterable<Book> getBooks(){return bookService.getAllBooks();}

    @RequestMapping(method = RequestMethod.POST)
    public
    @ResponseBody
    void addBook(@RequestParam(value = "title", required = true) String title,
                 @RequestParam(value="isbn", required = true) String isbn,
                 @RequestParam(value = "authorFirstName", required = true) String authorFirstName,
                 @RequestParam(value = "authorLastName", required = true) String authorLastName
                 )

    {bookService.addBook(title, isbn, authorFirstName, authorLastName);}

}


