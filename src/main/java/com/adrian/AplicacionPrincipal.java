package com.adrian;

import java.io.IOException;

import com.adrian.controlador.ControladorDragon;
import com.adrian.modelo.Dragon;
import com.adrian.vista.VistaFormulario;
import com.adrian.vista.VistaVisualizacion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AplicacionPrincipal extends Application {

    @Override
    public void start(Stage escenarioPrincipal) {
        try {
            Dragon dragon = new Dragon();

            FXMLLoader cargadorFormulario = new FXMLLoader(
                    getClass().getResource("/com/adrian/vista/vista-formulario.fxml"));
            FXMLLoader cargadorVisualizacion = new FXMLLoader(
                    getClass().getResource("/com/adrian/vista/vista-visualizacion.fxml"));

            Parent vistaFormulario = cargadorFormulario.load();
            Parent vistaVisualizacion = cargadorVisualizacion.load();

            VistaFormulario controladorFormulario = cargadorFormulario.getController();
            VistaVisualizacion controladorVisualizacion = cargadorVisualizacion.getController();

            ControladorDragon controlador = new ControladorDragon(dragon);

            controladorFormulario.setControlador(controlador);
            controladorVisualizacion.setControlador(controlador);

            dragon.agregarObservador(controladorFormulario);
            dragon.agregarObservador(controladorVisualizacion);

            escenarioPrincipal.setTitle("Registro de Dragones - MVC JavaFX");
            escenarioPrincipal.setScene(new Scene(vistaFormulario, 700, 500));

            controlador.setEscenarioPrincipal(escenarioPrincipal);
            controlador.setVistaFormulario(vistaFormulario);
            controlador.setVistaVisualizacion(vistaVisualizacion);

            escenarioPrincipal.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}