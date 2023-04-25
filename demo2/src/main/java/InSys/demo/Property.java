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
public class Property {
    @Id
    @EqualsAndHashCode.Include
    private int pid;
    private String name;
    private String lane;
    private String occu;
    private int price;

}
