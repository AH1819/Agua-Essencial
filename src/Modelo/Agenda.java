package Modelo;

public class Agenda {
    private int id_agenda;
    private int id_dia;
    private String Dia;
    private int id_mes;
    private String Mes;
    private int id_cliente;
    private String nombre;

    public Agenda() {
    }

    public Agenda(int id_dia, int id_mes, int id_cliente) {
        this.id_dia = id_dia;
        this.id_mes = id_mes;
        this.id_cliente = id_cliente;
    }
    
    public Agenda(int id_agenda, int id_dia, String Dia, int id_cliente,String nombre) {
        this.id_agenda = id_agenda;
        this.id_dia = id_dia;
        this.Dia = Dia;
        this.id_cliente = id_cliente;
        this.nombre =nombre;
    }
    
    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public int getId_dia() {
        return id_dia;
    }

    public void setId_dia(int id_dia) {
        this.id_dia = id_dia;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public int getId_mes() {
        return id_mes;
    }

    public void setId_mes(int id_mes) {
        this.id_mes = id_mes;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
