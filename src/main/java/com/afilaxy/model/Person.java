package com.afilaxy.model;

import org.springframework.stereotype.Component;

import com.afilaxy.observer.Observer;
import com.afilaxy.observer.Subject;

@Component
public class Person implements Subject {
    // Atributos e métodos da classe Person

    @Override
    public void registerObserver(Observer observer) {
        // Implemente o registro de observadores
    }

    @Override
    public void removeObserver(Observer observer) {
        // Implemente a remoção de observadores
    }

    @Override
    public void notifyObservers(String message) {
        // Implemente a notificação aos observadores
    }


}
