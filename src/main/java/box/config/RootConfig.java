package box.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"box"},
            excludeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION,
            value= EnableWebMvc.class)})
@ImportResource(locations = "spring-mybatis.xml")
public class RootConfig {
}
