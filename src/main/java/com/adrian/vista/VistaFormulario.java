package com.adrian.vista;

import com.adrian.controlador.ControladorDragon;
import com.adrian.modelo.Dragon;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class VistaFormulario implements Dragon.ObservadorDragon {
    
    private ControladorDragon controlador;
    
    @FXML
    private VBox vistaFormularioRoot; 
    
    @FXML
    private TextField campoNombre;
    
    @FXML
    private TextField campoRaza;
    
    @FXML
    private TextField campoTamaño;
    
    @FXML
    private TextField campoColor;
    
    public void setControlador(ControladorDragon controlador) {
        this.controlador = controlador;
    }
    
    @FXML
    private void enviarFormulario() {
        controlador.actualizarDragon(
            campoNombre.getText(),
            campoRaza.getText(),
            campoTamaño.getText(),
            campoColor.getText()
        );
        controlador.cambiarAVistaVisualizacion();
    }
    
    @Override
    public void actualizar(Dragon dragon) {
        campoNombre.setText(dragon.getNombre());
        campoRaza.setText(dragon.getRaza());
        campoTamaño.setText(dragon.getTamaño());
        campoColor.setText(dragon.getColor());
    }

    public Parent getVista() {
        return vistaFormularioRoot; 
    }
}