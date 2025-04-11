package com.adrian.controlador;

import com.adrian.modelo.Dragon;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControladorDragon {
    private Dragon modelo;
    private Stage escenarioPrincipal;
    private Parent vistaFormulario;
    private Parent vistaVisualizacion; 

    public ControladorDragon(Dragon modelo) {
        this.modelo = modelo;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void setVistaFormulario(Parent vistaFormulario) {
        this.vistaFormulario = vistaFormulario;
    }

    public void setVistaVisualizacion(Parent vistaVisualizacion) {
        this.vistaVisualizacion = vistaVisualizacion;
    }

    public void cambiarAVistaVisualizacion() {
        escenarioPrincipal.setScene(new Scene(vistaVisualizacion, 700, 500));
    }

    public void cambiarAVistaFormulario() {
        escenarioPrincipal.setScene(new Scene(vistaFormulario, 700, 500));
    }

    public void actualizarDragon(String nombre, String raza, String tamaño, String color) {
        modelo.setNombre(nombre);
        modelo.setRaza(raza);
        modelo.setTamaño(tamaño);
        modelo.setColor(color);
    }

    public Dragon getDragon() {
        return modelo;
    }

    public void actualizarNombre(String nombre) {
        modelo.setNombre(nombre);
    }

    public void actualizarRaza(String raza) {
        modelo.setRaza(raza);
    }

    public void actualizarTamaño(String tamaño) {
        modelo.setTamaño(tamaño);
    }

    public void actualizarColor(String color) {
        modelo.setColor(color);
    }
}