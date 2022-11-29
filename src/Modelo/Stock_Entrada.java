package Modelo;

import java.sql.Date;

public class Stock_Entrada {

    private int id_entrada;
    private int id;
    private int factura;
    private Date fecha;
    private int cantidad;
    private float precio_compra;

    public Stock_Entrada() {
    }

    public Stock_Entrada(int id, int factura, Date fecha, int cantidad, float precio_compra) {
        this.id = id;
        this.factura = factura;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precio_compra = precio_compra;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

}
