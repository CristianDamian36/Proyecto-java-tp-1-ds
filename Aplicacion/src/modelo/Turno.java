package modelo;

import java.time.LocalDateTime;

public class Turno implements IRecurso{
    private LocalDateTime fechaHora;

    public Turno() {
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String mostrarAtributos() {
        return "";
    }
    
}
