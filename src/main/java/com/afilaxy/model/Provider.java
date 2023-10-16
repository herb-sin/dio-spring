package com.afilaxy.model;

import org.springframework.stereotype.Component;

import com.afilaxy.observer.Observer;

@Component
public class Provider implements Observer {
    // Atributos e métodos da classe Provider

    @Override
    public void update(String message) {
        // Implemente a resposta do provedor à notificação
    }
}
