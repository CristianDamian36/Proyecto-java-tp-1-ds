package modelo;

import java.util.ArrayList;

public class NivelDeGravedad {
    private int codigo;
    private String descripcion;
    private ArrayList<Sintoma> sintomas;

    public NivelDeGravedad() {
        sintomas = new ArrayList<>();
    }

    public NivelDeGravedad(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        sintomas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void agregarSintoma(Sintoma sintoma){
        
    }
    
    public void quitarSintoma(Sintoma sintoma){
        
    }
}
