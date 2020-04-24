package principal;

import datos.RepositorioCentral;
import presentador.PresentadorVistas;
import vista.VistaPrincipal;

public class Main {

    public static void main(String[] args) {
        RepositorioCentral.iniciar();
        PresentadorVistas.iniciarPorDefecto(new VistaPrincipal());
    }
    
}
