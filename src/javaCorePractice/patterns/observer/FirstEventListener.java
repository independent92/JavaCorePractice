package javaCorePractice.patterns.observer;

public class FirstEventListener implements EventListener {
    public int a;

    @Override
    public void callback() {
        System.out.println("FirstEventListener callback!");
    }
}
