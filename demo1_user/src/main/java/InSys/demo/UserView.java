package InSys.demo;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

@Route("")
@PageTitle("User")
public class UserView extends VerticalLayout {
    public UserView(UserController controller){
        GridCrud<User> crud = new GridCrud<>(User.class);
        crud.setCrudListener(controller);
        add(new H1("User Management"), crud);
        setSizeFull();
    }
}
