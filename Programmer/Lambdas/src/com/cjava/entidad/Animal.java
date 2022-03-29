package com.cjava.entidad;

public class Animal {
    private String nombre;
    private boolean puedeNadar;
    private boolean puedeSaltar;
    public Animal(String especie, boolean puedeNadar, boolean puedeSaltar) {
        this.nombre = especie;
        this.puedeNadar = puedeNadar;
        this.puedeSaltar = puedeSaltar;
    }
    public String getNombre() {
        return nombre;
    }
    public boolean puedeNadar() {
        return puedeNadar;
    }
    public boolean puedeSaltar() {
        return puedeSaltar;
    }
}
