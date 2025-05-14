package modelo;

public class Caja {

    private String nombre;
    private String tipo;
    private int capacidadVentiladores;
    private int puertos;

    // Constructor
    public Caja(String nombre, String tipo, int capacidadVentiladores, int puertos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadVentiladores = capacidadVentiladores;
        this.puertos = puertos;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidadVentiladores() {
        return capacidadVentiladores;
    }

    public int getPuertos() {
        return puertos;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidadVentiladores(int capacidadVentiladores) {
        this.capacidadVentiladores = capacidadVentiladores;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }
}
