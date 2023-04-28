package InSys.demo;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

@Route("")
@PageTitle("Property")
public class PropertyView extends VerticalLayout {
    public PropertyView(PropertyController controller){
        GridCrud<Property> crud = new GridCrud<>(Property.class);
        crud.setCrudListener(controller);
        add(new H1("Property Management"), crud);
        setSizeFull();
    }
}
