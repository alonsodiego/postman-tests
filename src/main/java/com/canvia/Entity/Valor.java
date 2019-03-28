package com.canvia.Entity;


import java.util.Random;

public class Valor {

    private Long id;
    private String nombre;
    private String valor;

    public Valor(String nombre, String valor) {
        this.id = ( new Random().nextLong() % 100 ) + 1;
        this.nombre = nombre;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
