package InSys.demo;

import org.springframework.stereotype.Controller;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Controller
public class PropertyController implements CrudListener<Property> {

    private final PropertyService service;

    public PropertyController(PropertyService service) {
        this.service = service;
    }

    @Override
    public Collection<Property> findAll() {
        return service.findAll();
    }

    @Override
    public Property add(Property property) {
        return service.add(property);
    }

    @Override
    public Property update(Property property) {
        return service.update(property);
    }

    @Override
    public void delete(Property property) {
        service.delete(property);
    }
}
