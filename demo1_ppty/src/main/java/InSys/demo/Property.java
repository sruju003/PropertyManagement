package InSys.demo;

import com.vaadin.flow.component.template.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Property {
    @Id
    @EqualsAndHashCode.Include
    private int id;
    private String name;
    private String location;
    private String occupied;
    private String tenant;
    private String landlord;
    private PropertyType type;

    public interface PropertyFactory {
        Property createProperty(int id, String name, String location, String occupied, String tenant, String landlord, PropertyType type);
    }

    public enum PropertyType {
        RESIDENTIAL,
        COMMERCIAL,
        INDUSTRIAL
    }
}
