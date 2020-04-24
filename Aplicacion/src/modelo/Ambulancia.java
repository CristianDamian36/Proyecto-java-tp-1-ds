package modelo;

public class Ambulancia implements IRecurso{
    private int numero;

    public Ambulancia() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String mostrarAtributos() {
        return "";
    }
    
}
