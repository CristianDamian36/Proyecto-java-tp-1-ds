package modelo;

public class Medico implements IRecurso{
    private String numeroInterno;
    private String nombre;

    public Medico() {
    }

    public Medico(String numeroInterno, String nombre) {
        this.numeroInterno = numeroInterno;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNumeroInterno() {
        return numeroInterno;
    }

    public void setNumeroInterno(String numeroInterno) {
        this.numeroInterno = numeroInterno;
    }

    @Override
    public String mostrarAtributos() {
        return "";
    }
    
}
