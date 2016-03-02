package net.quizful.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Anna on 3/1/2016.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Performer worker = (Performer)context.getBean("workerBean");
        worker.doSmth();
    }
}

