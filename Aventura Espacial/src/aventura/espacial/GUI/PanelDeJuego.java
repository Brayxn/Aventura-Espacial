
package aventura.espacial.GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDeJuego extends JPanel {
    private Image fondo;
    private Image personaje;
    private Image nave;
    
    private int x = 20; 
    private int y = 180; 
    
    private int naveX = 315; 
    private int naveY = 420; 

    public PanelDeJuego() {
    fondo = new ImageIcon("src/img/fondo (1).jpg").getImage();
    personaje = new ImageIcon("src/img/personaje.png").getImage();
    nave = new ImageIcon("src/img/Nave.png").getImage();
    
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                moverPersonaje(e);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, null);
        g.drawImage(nave, naveX, naveY, this);
        g.drawImage(personaje, x, y, this);
    }

    private void moverPersonaje(KeyEvent e) {
        int velocidad = 10; 
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP: y -= velocidad; break;
            case KeyEvent.VK_DOWN: y += velocidad; break;
            case KeyEvent.VK_LEFT: x -= velocidad; break;
            case KeyEvent.VK_RIGHT: x += velocidad; break;
        }
        if (colisionaNave()) {
            mostrarMenu();
        }
        repaint();
    }

    private boolean colisionaNave() {
      
        return x > naveX && x < naveX + nave.getWidth(this) &&
                y > naveY && y < naveY + nave.getHeight(this);
    }

    private void mostrarMenu() {
       
        JDialog menuDialog = new JDialog((Frame)null, "Menú", true);
        menuDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        menuDialog.setSize(300, 200);
        menuDialog.setLayout(new GridLayout(3, 1));

        JButton iniciarAventuraButton = new JButton("Iniciar Aventura");
        JButton viajarButton = new JButton("Viajar a Otro Planeta");
        JButton mejorarNaveButton = new JButton("Mejorar Nave");

      
        iniciarAventuraButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "¡Aventura iniciada!");
            menuDialog.dispose();
        });
        viajarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "¡Viajando a otro planeta!");
            menuDialog.dispose();
        });
        mejorarNaveButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "¡Nave mejorada!");
            menuDialog.dispose();
        });

       
        menuDialog.add(iniciarAventuraButton);
        menuDialog.add(viajarButton);
        menuDialog.add(mejorarNaveButton);

       
        menuDialog.setLocationRelativeTo(this);
        menuDialog.setVisible(true);
    }
}
