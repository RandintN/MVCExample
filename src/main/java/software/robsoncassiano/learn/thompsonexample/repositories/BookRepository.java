package software.robsoncassiano.learn.thompsonexample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import software.robsoncassiano.learn.thompsonexample.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
