package SpringCore;

import org.apache.log4j.Logger;
public class HelloWorld{
    private final static Logger LOGGER = Logger.getLogger(HelloWorld.class);
    String message;


    private HelloClass class1;
    public HelloWorld(String name,HelloClass helloClass) {
        message = "From HelloWorld constructor: "+name+":"+ helloClass.message;
    }

    public HelloWorld() {

    }
    public void setMessage(String value){
        this.message = value;
    }
    public void sayHello(){
        class1.printMessage();
        LOGGER.info("From Hello World: "+message);
    }


    public void setClazz(HelloClass clazz) {
        this.class1 = clazz;
    }
}
