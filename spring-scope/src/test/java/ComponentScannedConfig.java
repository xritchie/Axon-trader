import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Created by shawnritchie on 15/04/15.
 */
@Configuration
@ComponentScan(excludeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION, value=Configuration.class)})
public class ComponentScannedConfig {
}
