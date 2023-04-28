package InSys.demo;

import org.springframework.stereotype.Controller;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Controller
public class FeedController implements CrudListener<Feed> {

    private final FeedService service;

    public FeedController(FeedService service) {
        this.service = service;
    }

    @Override
    public Collection<Feed> findAll() {
        return service.findAll();
    }

    @Override
    public Feed add(Feed feed) {
        return service.add(feed);
    }

    @Override
    public Feed update(Feed feed) {
        return service.update(feed);
    }

    @Override
    public void delete(Feed feed) {
        service.delete(feed);
    }
}
