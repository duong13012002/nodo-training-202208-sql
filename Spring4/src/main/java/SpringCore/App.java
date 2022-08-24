package SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
//        context.registerShutdownHook();
        HelloWorld hlw = (HelloWorld) context.getBean("helloWorld");
        hlw.sayHello();
        System.out.println(hlw);
        HelloClass obj = new HelloClass();
        obj = (HelloClass) context.getBean("HelloClass");
        obj.printMessage();
        System.out.println(obj);

        HelloClass obj2 = (HelloClass) context.getBean("HelloClass");
        obj2.printMessage();
        System.out.println(obj2==obj2);
//        JavaClazz clazz = (JavaClazz) context.getBean("jee01");
//        System.out.println("Map Implement is "+clazz.getStudents().getClass());
//        System.out.println("There are "+clazz.getStudents().size()+" in the class");
        HelloClass clazz = new HelloClass();
        obj = (HelloClass) context.getBean("HelloClass");
        System.out.println("Total classes is "+ clazz.getClazzes().size());

    }
}
