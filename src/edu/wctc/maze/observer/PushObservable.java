package edu.wctc.maze.observer;

public interface PushObservable {
    void addObserver(PushObserver observer);

    void notifyObservers();

    void removeObserver(PushObserver observer);

}
