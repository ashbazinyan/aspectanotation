package net.quizful.aop;

/**
 * Created by Anna on 3/1/2016.
 */
public class PerformerImpl implements  Performer {
    public void doSmth() {
        System.out.println(print());
    }

    public String print() {
        return "Performer is working...";
    }
}
