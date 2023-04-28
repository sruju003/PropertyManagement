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
public class Feed {
    @Id
    @EqualsAndHashCode.Include
    private int id;
    private String query;

    public static class FeedFactory {
        public static Feed createFeed(int id, String query) {
            return new Feed(id, query);
        }
    }
}
