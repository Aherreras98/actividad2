package com.adrian.modelo;

import java.util.ArrayList;
import java.util.List;

public class Dragon {
    private String nombre;
    private String raza;
    private String tamaño;
    private String color;
    private List<ObservadorDragon> observadores = new ArrayList<>();

    public Dragon() {
        this.nombre = "";
        this.raza = "";
        this.tamaño = "";
        this.color = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        notificarObservadores();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
        notificarObservadores();
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
        notificarObservadores();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        notificarObservadores();
    }

    public void agregarObservador(ObservadorDragon observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(ObservadorDragon observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (ObservadorDragon observador : observadores) {
            observador.actualizar(this);
        }
    }

    public interface ObservadorDragon {
        void actualizar(Dragon dragon);
    }
}
