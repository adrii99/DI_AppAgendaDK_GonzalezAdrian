package es.ieslosmontecillos;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

import javax.swing.text.html.ImageView;

public class PersonaDetalleViewController {

    @javafx.fxml.FXML
    private TextField TextFieldNombre;
    @javafx.fxml.FXML
    private TextField textFieldApellidos;
    @javafx.fxml.FXML
    private TextField textFieldTelefono;
    @javafx.fxml.FXML
    private TextField textFieldEmail;
    @javafx.fxml.FXML
    private TextField textFieldNumHijos;
    @javafx.fxml.FXML
    private TextField textFieldSalario;
    @javafx.fxml.FXML
    private DatePicker datePickerFechaNacimiento;
    @javafx.fxml.FXML
    private RadioButton radioButtonSoltero;
    @javafx.fxml.FXML
    private RadioButton radioButtonCasado;
    @javafx.fxml.FXML
    private RadioButton radioButtonViudo;
    @javafx.fxml.FXML
    private CheckBox checkBoxJubilado;
    @javafx.fxml.FXML
    private ComboBox comboBoxProvincia;
    @javafx.fxml.FXML
    private ImageView imageViewFoto;
    @javafx.fxml.FXML
    private Label Nombre;
    @javafx.fxml.FXML
    private Label Apellidos;
    @javafx.fxml.FXML
    private Label Telefono;
    @javafx.fxml.FXML
    private Label eMail;
    @javafx.fxml.FXML
    private Label FechaNacimiento;
    @javafx.fxml.FXML
    private Label NumHijos;
    @javafx.fxml.FXML
    private Label EstadoCivil;
    @javafx.fxml.FXML
    private Label Salario;
    @javafx.fxml.FXML
    private Label Jubilacion;
    @javafx.fxml.FXML
    private Label Provincia;
    @javafx.fxml.FXML
    private Label Foto;
    @javafx.fxml.FXML
    private Button Guardar;
    @javafx.fxml.FXML
    private Button Cancelar;
    @javafx.fxml.FXML
    private Button Examinar;

    private Pane rootAgendaView;

    public void setRootAgendaView(Pane rootAgendaView){
        this.rootAgendaView = rootAgendaView;
    }


    @javafx.fxml.FXML
    public void onActionButtonGuardar(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onActionButtonCancelar(ActionEvent actionEvent) {
    }
}
