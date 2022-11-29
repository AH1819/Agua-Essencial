package Modelo;

import java.util.Date;

public class Stock_Salida {
    private int id_salida;
    private int id;
    private Date fecha;
    private String concepto;
    private int cantidad;

    public Stock_Salida() {
    }

    public Stock_Salida(int id, Date fecha, String concepto, int cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.concepto = concepto;
        this.cantidad = cantidad;
    }

    public int getId_salida() {
        return id_salida;
    }

    public void setId_salida(int id_salida) {
        this.id_salida = id_salida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
