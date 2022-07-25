package com.jarvis.techlab.pattern.observe;

public interface Subject {

    void registerObserver(Observe observe);

    void removeObserver(Observe observe);

    /**
     * 通知所有观察者
     */
    void notifyObserver();

}
