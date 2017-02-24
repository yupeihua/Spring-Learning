package concert;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
//启用AspectJ自动代理
@ComponentScan
public class ConcertConfig {
//	@Bean
//	public Audience audience() {
//		return new Audience();
//	}
}
