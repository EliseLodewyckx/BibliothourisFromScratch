package be.cegeka.bibliothouris.domain.users;

import org.springframework.data.repository.CrudRepository;

public interface UserRepositoryWithRealDataBase extends CrudRepository <User, Long>{
}
