package com.adrian.vista;

import com.adrian.controlador.ControladorDragon;
import com.adrian.modelo.Dragon;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class VistaVisualizacion implements Dragon.ObservadorDragon {

    private ControladorDragon controlador;

    @FXML
    private HBox vistaVisualizacionRoot;

    @FXML
    private Label labelNombre;
    @FXML
    private Label labelRaza;
    @FXML
    private Label labelTamaño;
    @FXML
    private Label labelColor;
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
    private void actualizarNombre() {
        controlador.actualizarNombre(campoNombre.getText());
    }

    @FXML
    private void actualizarRaza() {
        controlador.actualizarRaza(campoRaza.getText());
    }

    @FXML
    private void actualizarTamaño() {
        controlador.actualizarTamaño(campoTamaño.getText());
    }

    @FXML
    private void actualizarColor() {
        controlador.actualizarColor(campoColor.getText());
    }

    @Override
    public void actualizar(Dragon dragon) {
        labelNombre.setText(dragon.getNombre());
        labelRaza.setText(dragon.getRaza());
        labelTamaño.setText(dragon.getTamaño());
        labelColor.setText(dragon.getColor());

        campoNombre.setText(dragon.getNombre());
        campoRaza.setText(dragon.getRaza());
        campoTamaño.setText(dragon.getTamaño());
        campoColor.setText(dragon.getColor());
    }

    public Parent getVista() {
        return vistaVisualizacionRoot;
    }
}