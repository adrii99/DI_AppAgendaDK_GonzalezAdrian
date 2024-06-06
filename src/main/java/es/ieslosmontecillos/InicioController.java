package es.ieslosmontecillos;

import com.gluonhq.charm.glisten.mvc.View;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import java.io.IOException;
public class InicioController {
    @FXML
    private View inicio;
    @FXML
    private Label label;
    @FXML
    private TextField txtUsu;
    @FXML
    private Label label1;
    @FXML
    private TextField txtCont;
    @FXML
    private Label lblError;
    @FXML
    private Button btnEntrar;

    private DataUtil dataUtil;
    private ObservableList olProv;
    private ObservableList olPers;

    //Creamos una lista observable de usuario
    private ObservableList<Usuario> olUsu;

    private Pane rootMain = new Pane();


/*
    @Deprecated
    public void iniciaApp(Event event) {
        try{
            FXMLLoader fxmlLoader = new
                    FXMLLoader(getClass().getResource("fxml/AgendaView.fxml"));
            Pane rootAgendaView = fxmlLoader.load();
            inicio.setVisible(false);
            rootMain.getChildren().add(rootAgendaView);
            AgendaViewController agendaViewController =
                    fxmlLoader.getController();
            agendaViewController.setDataUtil(dataUtil);
            agendaViewController.setOlProvincias(olProv);
            agendaViewController.setOlPersonas(olPers);
            agendaViewController.setOlUsuario(olUsu);
            agendaViewController.cargarTodasPersonas();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }*/


    //Funcion que comprueba si el usuario se encuentra en la base de datos
    public void comprobarUsuario(ActionEvent actionEvent) {

        String usuario = txtUsu.getText();
        String contrasena = txtCont.getText();

        for(Usuario  usu : olUsu)
        {
            if (usuario.equals(usu.getUsuario()))
            {
                if (contrasena.equals(usu.getContrasena()))
                {
                    try{
                            FXMLLoader fxmlLoader = new
                                    FXMLLoader(getClass().getResource("fxml/AgendaView.fxml"));
                            Pane rootAgendaView = fxmlLoader.load();
                            inicio.setVisible(false);
                            rootMain.getChildren().add(rootAgendaView);
                            AgendaViewController agendaViewController =
                                    fxmlLoader.getController();
                            agendaViewController.setDataUtil(dataUtil);
                            agendaViewController.setOlProvincias(olProv);
                            agendaViewController.setOlPersonas(olPers);
                            //Establecemos usuario
                            agendaViewController.setOlUsuario(olUsu);
                            agendaViewController.cargarTodasPersonas();
                        } catch (IOException e) {
                         System.out.println("IOException: " + e);
                    }
                }
                else
                {
                    lblError.setText("Contraseña incorrecta");
                }
            }
            else
            {
                lblError.setText("Usuario incorrecto");
            }
        }

    }

    public void setRootMain(Pane rootMain) {
        this.rootMain = rootMain;
    }
    public void setDataUtil(DataUtil dataUtil) {
        this.dataUtil = dataUtil;
    }
    public void setOlProv(ObservableList olProv) {
        this.olProv = olProv;
    }
    public void setOlPers(ObservableList olPers) {
        this.olPers = olPers;
    }

    //Añadimos el metodo set de olUsu
    public void setOlUsu(ObservableList olUsu) {this.olUsu = olUsu;}

}
