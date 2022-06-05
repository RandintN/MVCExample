package software.robsoncassiano.learn.thompsonexample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import software.robsoncassiano.learn.thompsonexample.entities.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
