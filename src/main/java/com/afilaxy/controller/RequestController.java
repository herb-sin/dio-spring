package com.afilaxy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @PostMapping("/requestBombinha")
    public String requestBombinha() {
        // Utilize person e provider aqui
        return "Solicitação de bombinha de asma recebida.";
    }
}
