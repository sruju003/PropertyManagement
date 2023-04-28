package InSys.demo;

import org.springframework.stereotype.Repository;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Repository
public class FeedService implements CrudListener<Feed> {

    private final FeedRepo repo;

    public FeedService(FeedRepo repo) {
        this.repo = repo;
    }

    @Override
    public Collection<Feed> findAll() {
        return repo.findAll();
    }

    @Override
    public Feed add(Feed feed) {
        Feed newFeed = Feed.FeedFactory.createFeed(feed.getId(), feed.getQuery());
        return repo.insert(newFeed);
    }

    @Override
    public Feed update(Feed feed) {
        return repo.save(feed);
    }

    @Override
    public void delete(Feed feed) {
        repo.delete(feed);
    }

}
