package SpringCore;

import org.springframework.beans.factory.DisposableBean;

import java.util.Collection;
import java.util.List;

public class HelloClass implements DisposableBean {
    String message;
    private List<JavaClazz> clazzes;

    public HelloClass(HelloClass class1){
        message = class1.message;
    }

    public HelloClass() {
        message = "From Constructor: Say hi to everyone!";
    }

    public void setMessage(String message){
        this.message = "Call From Setter: "+message;
    }
    public void printMessage(){
        System.out.println("Your Message: "+message);
    }
    public void initMessage(){
        System.out.println("Calling init method .......");
        message = "From init method: Say hello Bean";
        System.out.println(message);
    }
    private void release(){
        message = null;
        System.out.println("Message is null");
    }
    public HelloClass(int person){
        message = "From Constructor: Say hello to "+person+" person(s)!";
    }


    @Override
    public void destroy() throws Exception {
     message = null;
     System.out.println("Message is null!");
    }


    public List<JavaClazz> getClazzes() {
        return clazzes;
    }

    public void setClazzes(List<JavaClazz> clazzes) {
        this.clazzes = clazzes;
    }
}
