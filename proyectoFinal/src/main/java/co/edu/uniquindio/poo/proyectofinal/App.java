package co.edu.uniquindio.poo.proyectofinal;

import co.edu.uniquindio.poo.proyectofinal.model.Bibliotecario;
import co.edu.uniquindio.poo.proyectofinal.model.Estado;
import co.edu.uniquindio.poo.proyectofinal.model.LReferencia;
import co.edu.uniquindio.poo.proyectofinal.model.Libro;
import co.edu.uniquindio.poo.proyectofinal.viewController.LibroViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

import co.edu.uniquindio.poo.proyectofinal.viewController.PrimaryController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    public static Bibliotecario bibliotecario = new Bibliotecario("168UQ", "Jose");

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Gestion de Clientes");
        openViewPrincipal();
    }

    private void openViewPrincipal() {
        inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("primary.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            PrimaryController primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public void openCrudCliente() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            LibroViewController clienteViewController = loader.getController();
            clienteViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //servicios
    public void inicializarData(){
        Libro libro= new LReferencia("El principito",  "Antoine", "novela corta", 1943, Estado.DISPONIBLE, "Bloque B");
        bibliotecario.registrarLibro(libro);
    }
}

