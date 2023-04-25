package InSys.demo;
import org.springframework.stereotype.Repository;
import org.vaadin.crudui.crud.CrudListener;
import java.util.Collection;

@Repository
public class UserService implements CrudListener<User> {

    private final UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public Collection<User> findAll() {
        return repo.findAll();
    }

    @Override
    public User add(User User) {
        return repo.insert(User);
    }

    @Override
    public User update(User User) {
        return repo.save(User);
    }

    @Override
    public void delete(User User) {
        repo.delete(User);
    }

}