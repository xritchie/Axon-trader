import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by shawnritchie on 15/04/15.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class MontiConfig {

    @Bean
    public Shout talMonti() {
        return new TalMonti();
    }

    @Bean
    public Puluzija puluzija()
    {
        return new Puluzija();
    }

}
