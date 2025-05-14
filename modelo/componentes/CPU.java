package modelo;

public class CPU {

    private String nombre;
    private String soket;
    private int hilos;
    private int velocidad;
    private int tdp;
    private boolean graficos;

    // Constructor
    public CPU(String nombre, String soket, int hilos, int velocidad, int tdp, boolean graficos) {
        this.nombre = nombre;
        this.soket = soket;
        this.hilos = hilos;
        this.velocidad = velocidad;
        this.tdp = tdp;
        this.graficos = graficos;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getSoket() {
        return soket;
    }

    public int getHilos() {
        return hilos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getTdp() {
        return tdp;
    }

    public boolean tieneGraficos() {
        return graficos;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSoket(String soket) {
        this.soket = soket;
    }

    public void setHilos(int hilos) {
        this.hilos = hilos;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setTdp(int tdp) {
        this.tdp = tdp;
    }

    public void setGraficos(boolean graficos) {
        this.graficos = graficos;
    }
}