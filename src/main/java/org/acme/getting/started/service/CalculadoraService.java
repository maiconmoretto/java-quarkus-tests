package org.acme.getting.started.service;

import org.acme.getting.started.DTO.Calculadora;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculadoraService {

    public Integer soma(Integer a, Integer b) {
        return a + b;
    }

}