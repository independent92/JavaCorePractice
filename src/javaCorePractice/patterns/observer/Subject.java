package javaCorePractice.patterns.observer;

public class Subject {
    private EventManager eventManager;

    Subject(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void doEvent() {
        System.out.println("Subject doEvent!");
        eventManager.notifyListeners();
    }
}
