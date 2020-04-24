package modelo;

import java.util.ArrayList;

public class Paciente{
    private int dni;
    private String apellido;
    private String nombre;
    private String telefono;
    private String domicilio;
    private ArrayList<Sintoma> sintomas;

    public Paciente() {
        sintomas = new ArrayList<>();
    }

    public Paciente(int dni, String apellido, String nombre, String telefono, String domicilio) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
        sintomas = new ArrayList<>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Sintoma> getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList<Sintoma> sintomas) {
        this.sintomas = sintomas;
    }
    
    public void agregarSintomas(Sintoma sintoma){
        
    }
    
    public void quitarSintoma(Sintoma sintoma){
        
    }
}
