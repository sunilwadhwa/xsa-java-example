package tinyworld.tinyjava.tinyweb;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "tinyworld.tinyjava.tinyweb")
public class TinyWebConfiguration {
	
}
