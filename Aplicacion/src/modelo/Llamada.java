package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Llamada {
    private LocalDateTime fechaHora;
    private Paciente paciente;
    private NivelDeGravedad nivel;
    private ArrayList<Sintoma> sintomasDelPaciente;
    private Recurso recursosAsignados;

    public Llamada() {
    }

    public Llamada(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public NivelDeGravedad getNivel() {
        return nivel;
    }

    public void setNivel(NivelDeGravedad nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Sintoma> getSintomasDelPaciente() {
        return sintomasDelPaciente;
    }

    public Recurso getRecursosAsignados() {
        return recursosAsignados;
    }

    public void setRecursosAsignados(Recurso recursosAsignados) {
        this.recursosAsignados = recursosAsignados;
    }
    
    public void agregarSintoma(Sintoma sintoma){
        
    }
    
    public void quitarSintoma(Sintoma sintoma){
        
    }
}
