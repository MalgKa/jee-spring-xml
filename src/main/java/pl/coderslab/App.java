package pl.coderslab;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.MessageService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//w beans.xml wstrzyknięto za pomocą konstruktora do klasy HelloWorld wartość "witaj spring" dla atrybutu message
        HelloWorld helloworld1 = context.getBean("helloWorld", HelloWorld.class);
        helloworld1.printMessage();


        //w beans.xml wstrzyknięto napis "witaj sprig-by setter" za pomocą metody ustawiającej czyli settera
        HelloWorld hw2 = context.getBean("helloWorld", HelloWorld.class);
        System.out.println(hw2.getMessage()); //za pomocą gettera

        MessageSender messageSender = (MessageSender) context.getBean("messageSender");
        //inaczej można zapisać i nie trzeba wtedy rzutować
        MessageSender messageSender1 = context.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();
        messageSender1.sendMessageFromProperty();


        context.close();
    }
}
