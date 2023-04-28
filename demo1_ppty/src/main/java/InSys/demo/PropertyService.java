package InSys.demo;
import org.springframework.stereotype.Repository;
import org.vaadin.crudui.crud.CrudListener;
import java.util.Collection;

@Repository
public class PropertyService implements CrudListener<Property> {

    private final PropertyRepo repo;

    public PropertyService(PropertyRepo repo) {
        this.repo = repo;
    }

    @Override
    public Collection<Property> findAll() {
        return repo.findAll();
    }

    @Override
    public Property add(Property Property) {
        return repo.insert(Property);
    }

    @Override
    public Property update(Property Property) {
        return repo.save(Property);
    }

    @Override
    public void delete(Property Property) {
        repo.delete(Property);
    }

}