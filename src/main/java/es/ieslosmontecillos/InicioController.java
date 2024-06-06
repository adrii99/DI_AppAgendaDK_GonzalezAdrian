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

    private DataUtil dataUtil;
    private ObservableList olProv;
    private ObservableList olPers;

    private Pane rootMain = new Pane();



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
            agendaViewController.cargarTodasPersonas();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
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


}
