package modelo;

public class Disipador {

    private String nombre;
    private String tipo;              
    private String compatibilidad;    
    private int tamañoVentilador;     
    private double ruido;             

    public Disipador(String nombre, String tipo, String compatibilidad, int tamañoVentilador, double ruido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.compatibilidad = compatibilidad;
        this.tamañoVentilador = tamañoVentilador;
        this.ruido = ruido;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCompatibilidad() {
        return compatibilidad;
    }

    public int getTamañoVentilador() {
        return tamañoVentilador;
    }

    public double getRuido() {
        return ruido;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    public void setTamañoVentilador(int tamañoVentilador) {
        this.tamañoVentilador = tamañoVentilador;
    }

    public void setRuido(double ruido) {
        this.ruido = ruido;
    }


}
