package org.example.modelo;
import org.bson.codecs.pojo.annotations.BsonId;


public class Pista {
    @BsonId
    private String id;

    private String deporte;
    private String descripcion;
    private boolean disponible;

    //constructor vacio
    public Pista() {}

    public Pista(String id, String deporte, String descripcion, boolean disponible) {
        this.id = id;
        this.deporte = deporte;
        this.descripcion = descripcion;
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Pista{" +
                "id='" + id + '\'' +
                ", deporte='" + deporte + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
