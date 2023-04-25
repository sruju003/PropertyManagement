package InSys.demo;

import org.springframework.stereotype.Controller;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Controller
public class UserController implements CrudListener<User> {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @Override
    public Collection<User> findAll() {
        return service.findAll();
    }

    @Override
    public User add(User user) {
        return service.add(user);
    }

    @Override
    public User update(User user) {
        return service.update(user);
    }

    @Override
    public void delete(User user) {
        service.delete(user);
    }
}
