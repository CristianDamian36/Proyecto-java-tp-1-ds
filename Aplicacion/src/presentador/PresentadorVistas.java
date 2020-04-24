package presentador;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class PresentadorVistas {
    //config comunes a todas las vistas
    
    public static void iniciarPorDefecto(JFrame vista){
        vista.setLocationRelativeTo(null);
        vista.getContentPane().setBackground(Color.gray);
        vista.setVisible(true);
    }
    
    public static void inciarPorDefecto(JDialog vista){
        vista.setLocationRelativeTo(null);
        vista.getContentPane().setBackground(Color.gray);
        vista.setVisible(true);
    }
}
