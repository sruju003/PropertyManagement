package InSys.demo;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

@Route("")
@PageTitle("Feedback")
public class FeedView extends VerticalLayout {
    public FeedView(FeedController controller){
        GridCrud<Feed> crud = new GridCrud<>(Feed.class);
        crud.setCrudListener(controller);
        add(new H1("Feedback Management"), crud);
        setSizeFull();
    }
}
