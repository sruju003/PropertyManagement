package InSys.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepo extends MongoRepository<Feed, Integer> {

}
