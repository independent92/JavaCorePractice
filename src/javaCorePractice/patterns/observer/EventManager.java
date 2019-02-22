package javaCorePractice.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<EventListener> eventListeners;

    EventManager() {
        eventListeners = new ArrayList<>();
    }

    public boolean subscribe(EventListener listener) {
        return eventListeners.add(listener);
    }

    public boolean unsubscribe(EventListener listener) {
       return eventListeners.remove(listener);
    }

    public void notifyListeners() {
        for (EventListener e: eventListeners) {
            e.callback();
        }
    }
}
