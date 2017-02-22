package be.cegeka.bibliothouris.domain.books;

import org.springframework.data.repository.CrudRepository;

public interface BookRepositoryDatabase extends CrudRepository<Book, Long>{
}
