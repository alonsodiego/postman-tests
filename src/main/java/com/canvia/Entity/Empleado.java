package com.canvia.Entity;


import java.util.Random;

public class Empleado {

    private Long id;
    private String nombre;
    private String apellido;

    public Empleado(String nombre, String apellido) {
        this.id = new Random().nextLong();
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
