package javaCorePractice.patterns.observer;

public class SecondEventListener implements EventListener {
    public int b;

    @Override
    public void callback() {
        System.out.println("SecondEventListener callback!");
    }
}
