
package aventura.espacial.GUI;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AventuraEspacialGUI {

    public AventuraEspacialGUI() {
        JFrame frame = new JFrame("Aventura Espacial 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        PanelDeJuego panelDeJuego = new PanelDeJuego();
        frame.add(panelDeJuego);
        
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AventuraEspacialGUI::new);
    }
}


