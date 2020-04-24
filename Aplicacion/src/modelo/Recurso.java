package modelo;

public class Recurso {
    private IRecurso recurso;
    private Estado estado;

    public Recurso() {
    }

    public Recurso(IRecurso recurso, Estado estado) {
        this.recurso = recurso;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public IRecurso getRecurso() {
        return recurso;
    }

    public void setRecurso(IRecurso recurso) {
        this.recurso = recurso;
    }
    
}
