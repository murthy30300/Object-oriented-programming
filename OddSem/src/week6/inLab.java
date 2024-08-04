package week6;

import java.util.ArrayList;
import java.util.List;

class Topic {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

class Observer {
    public void update(String message) {
        // Do something with the message
    }
}

public class inLab {
    public static void main(String[] args) {
        Topic topic = new Topic();

        Observer observer1 = new Observer() {
            @Override
            public void update(String message) {
                System.out.println("Observer 1 received message: " + message);
            }
        };

        Observer observer2 = new Observer() {
            @Override
            public void update(String message) {
                System.out.println("Observer 2 received message: " + message);
            }
        };

        topic.registerObserver(observer1);
        topic.registerObserver(observer2);

        topic.notifyObservers("Hello, world!");
    }
}
