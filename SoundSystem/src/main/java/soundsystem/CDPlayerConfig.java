package soundsystem;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//标明这是一个注解类
//@ComponentScan
//启用组建扫描
public class CDPlayerConfig {
	@Bean
	//默认名与方法名一致
	//使用@Bean(name = "hehe")修改名字 
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}
	
}
