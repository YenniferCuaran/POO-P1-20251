

package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.App;
import co.edu.uniquindio.poo.proyectofinal.controller.LibroController;
import co.edu.uniquindio.poo.proyectofinal.model.Libro;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class LibroViewController {

    LibroController libroController;
    ObservableList<Libro> listLibros = FXCollections.observableArrayList();
    Libro selectedLibro;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtAutor;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TableView<Libro> tblListLibro;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnActualizarLibro;

    @FXML
    private TableColumn<Libro, String> tbcAutor;

    @FXML
    private TextField txtGenero;

    @FXML
    private TableColumn<Libro, String> tbcGenero;

    @FXML
    private Button btbAgregarLibro;

    @FXML
    private TableColumn<Libro, String> tbcTitulo;

    @FXML
    private TextField txtTitulo;
    private App app;

    @FXML
    void onAgregarLibro() {
        agregarLibro();
    }

    @FXML
    void onActualizarLibro() {
        actualizarLibro();
    }

    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }

    @FXML
    void onEliminar() {
        eliminarLibro();
    }

    @FXML
    void initialize() {
        this.app=app;
        libroController = new LibroController(app.bibliotecario);
        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerLibros();

        // Limpiar la tabla
        tblListLibro.getItems().clear();

        // Agregar los elementos a la tabla
        tblListLibro.setItems(listLibros);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbcTitulo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTitulo()));
        tbcAutor.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAutor()));
        tbcGenero.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getGenero()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerLibros() {
        listLibros.addAll(libroController.getListLibros());
    }

    private void listenerSelection() {
        tblListLibro.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedLibro = newSelection;
            mostrarInformacionLibro(selectedLibro);
        });
    }

    private void mostrarInformacionLibro(Libro libro) {
        if (libro != null) {
            txtTitulo.setText(libro.getTitulo());
            txtAutor.setText(libro.getAutor());
            txtGenero.setText(libro.getGenero());
        }
    }

    private void agregarLibro() {
        Libro libro = buildLibro();
        if (libroController.registrarLibro(libro)) {
            listLibros.add(libro);
            limpiarCamposLibro();
        }
    }

    private Libro buildLibro() {
        Libro libro = new Libro(txtTitulo.getText(), txtAutor.getText(), txtGenero.getText());
        return libro;
    }

    private void eliminarLibro() {
        if (libroController.eliminarLibro(txtTitulo.getText())) {
            listLibros.remove(selectedLibro);
            limpiarCamposLibro();
            limpiarSeleccion();
        }
    }

    private void actualizarLibro() {

        if (selectedLibro != null &&
                libroController.actualizarLibro(selectedLibro.getTitulo(), buildLibro())) {

            int index = listLibros.indexOf(selectedLibro);
            if (index >= 0) {
                listLibros.set(index, buildLibro());
            }

            tblListLibro.refresh();
            limpiarSeleccion();
            limpiarCamposLibro();
        }
    }

    private void limpiarSeleccion() {
        tblListLibro.getSelectionModel().clearSelection();
        limpiarCamposLibro();
    }

    private void limpiarCamposLibro() {
        txtTitulo.clear();
        txtAutor.clear();
        txtGenero.clear();
    }

    public void setApp(App app) {
        this.app = app;
    }
}
