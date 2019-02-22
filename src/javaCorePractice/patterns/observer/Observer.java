package javaCorePractice.patterns.observer;

public class Observer {
    public static void main(String[] args) {
        Subject subject = new Subject(new EventManager());
        subject.getEventManager().subscribe(new FirstEventListener());
        subject.getEventManager().subscribe(new SecondEventListener());

        subject.doEvent();
    }
}
