package modelo;

public class FuenteAlimentacion {

    private String nombre;
    private int potencia;           
    private String certificacion;   
    private boolean modular;         

    
    public FuenteAlimentacion(String nombre, int potencia, String certificacion, boolean modular) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.certificacion = certificacion;
        this.modular = modular;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public boolean isModular() {
        return modular;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }

    public void setModular(boolean modular) {
        this.modular = modular;
    }


}
