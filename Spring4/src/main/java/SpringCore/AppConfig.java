package SpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = "bean2")
    @Scope("singleton")
    public HelloClass getHelloBean(){
        HelloClass bean = new HelloClass();
        bean.message = "Hello Node, I'm Duong";
        return bean;
    }
}
