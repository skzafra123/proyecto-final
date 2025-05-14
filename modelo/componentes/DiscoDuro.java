package modelo;

public class DiscoDuro {

    private String nombre;
    private String tipo;
    private int velocidad;      
    private double tamaño;      

    // Constructor
    public DiscoDuro(String nombre, String tipo, int velocidad, double tamaño) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.tamaño = tamaño;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public double getTamaño() {
        return tamaño;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
