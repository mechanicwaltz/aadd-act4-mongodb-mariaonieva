package org.example.modelo;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.codecs.pojo.annotations.BsonId;


public class Reserva {
    @BsonId
    private String id;

    @BsonProperty("id_socio")
    private String idSocio;

    @BsonProperty("id_pista")
    private String idPista;

    private String fecha;

    @BsonProperty("hora_inicio")
    private String horaInicio;

    @BsonProperty("duracion_min")
    private int duracionMin;

    private double precio;

    public Reserva() {}

    public Reserva(String id, String idSocio, String idPista, String fecha, String horaInicio, int duracionMin, double precio) {
        this.id = id;
        this.idSocio = idSocio;
        this.idPista = idPista;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.duracionMin = duracionMin;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(String idSocio) {
        this.idSocio = idSocio;
    }

    public String getIdPista() {
        return idPista;
    }

    public void setIdPista(String idPista) {
        this.idPista = idPista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id='" + id + '\'' +
                ", idSocio='" + idSocio + '\'' +
                ", idPista='" + idPista + '\'' +
                ", fecha='" + fecha + '\'' +
                ", horaInicio='" + horaInicio + '\'' +
                ", duracionMin=" + duracionMin +
                ", precio=" + precio +
                '}';
    }
}
