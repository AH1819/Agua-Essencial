package Modelo;

public class Materia_prima {
    private int id_materia;
    private int id_proveedor;
    private String proveedor;
    private String nombre;
    private String descripcion;
    private String estado;
    private String status;

    public Materia_prima() {
    }

    public Materia_prima(int id_proveedor,String nombre, String descripcion) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Materia_prima(int id_materia, String proveedor,String nombre, String descripcion, String estado) {
        this.id_materia = id_materia;
        this.proveedor = proveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Materia_prima(int id_materia, int id_proveedor, String nombre, String descripcion, String estado) {
        this.id_materia = id_materia;
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Materia_prima(int id_materia, int id_proveedor, String nombre, String descripcion) {
        this.id_materia = id_materia;
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    
    
    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
