package com.codecool.elevator;

import java.util.ArrayList;
import java.util.List;

public class ControlPanel {
    private final List<Observer> observers = new ArrayList<>();
    private final List<Request> requests = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addRequest(Request request) {
        requests.add(request);
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<Request> getRequests() {
        return requests;
    }
}
