package datos;

import java.util.ArrayList;
import modelo.Sintoma;

public class RepositorioSintoma {
    private static ArrayList<Sintoma> listaSintomas;
    
    protected static void cargarDatos(){
        listaSintomas = new ArrayList<>(12);
        listaSintomas.add(new Sintoma(1, "FIEBRE"));
        listaSintomas.add(new Sintoma(1, "TOS SECA"));
        listaSintomas.add(new Sintoma(3, "FATIGA"));
        listaSintomas.add(new Sintoma(4, "FLEMA"));
        listaSintomas.add(new Sintoma(5, "DISNEA"));
        listaSintomas.add(new Sintoma(6, "DOLOR MUSCULAR"));
        listaSintomas.add(new Sintoma(7, "DOLOR EN ARTICULACIONES"));
        listaSintomas.add(new Sintoma(8, "DOLOR DE GARGANTA"));
        listaSintomas.add(new Sintoma(9, "DOLOR DE CABEZA"));
        listaSintomas.add(new Sintoma(10, "ESCALOFRIOS"));
        listaSintomas.add(new Sintoma(11, "NAUSEAS O VOMITOS"));
        listaSintomas.add(new Sintoma(12, "CONGESTION NASAL"));
        listaSintomas.add(new Sintoma(13, "DIFICULTAD PARA RESPIRAR"));
    }

    public static ArrayList<Sintoma> getListaSintomas() {
        return listaSintomas;
    }
    
    public static void agregarNuevoSintoma(Sintoma nuevo){
        if(!listaSintomas.contains(nuevo)){
            listaSintomas.add(nuevo);
        }else{
            System.out.println("Este sintoma ya existe");
        }
    }
    
    public static void eliminarSintoma(Sintoma sintoma){
        if(listaSintomas.contains(sintoma)){
            listaSintomas.remove(sintoma);
        }else{
            System.out.println("Sintoma inexistente");
        }
    }
    
    public static void modificarSintoma(Sintoma viejo, Sintoma nuevo){
        //TODO
    }
}
