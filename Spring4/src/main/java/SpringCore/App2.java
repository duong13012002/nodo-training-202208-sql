package SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class App2 {
    public static void main(String[] args) {
      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
      ctx.register(AppConfig.class);
      ctx.refresh();
      HelloClass obj = new HelloClass();
      obj = (HelloClass) ctx.getBean("bean2");
      obj.initMessage();
    }

}
