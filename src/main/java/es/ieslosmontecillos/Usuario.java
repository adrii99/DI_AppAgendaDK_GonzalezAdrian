package es.ieslosmontecillos;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.XmlElement;

public class Usuario {

    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty usuario = new SimpleStringProperty();
    private final StringProperty contrasena = new SimpleStringProperty();

    //campo id
    @XmlElement(name = "id")

    public int getId() {return id.get();}
    public IntegerProperty idProperty() {return id;}
    public void setId(int id) {this.id.set(id);}

    //campo usuario
    @XmlElement(name = "usuario")

    public String getUsuario() {return usuario.get();}
    public StringProperty usuarioProperty() {return usuario;}
    public void setUsuario(String usuario) {this.usuario.set(usuario);}

    //campo contrasena
    @XmlElement(name = "contrasena")

    public String getContrasena() {return contrasena.get();}
    public StringProperty contrasenaProperty() {return contrasena;}
    public void setContrasena(String contrasena) {this.contrasena.set(contrasena);}
}
