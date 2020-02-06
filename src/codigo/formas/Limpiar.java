/*
 * Deja la pantalla en blanco
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * Autores: Ramiro Diego, Sofía Rico, Javier de la Llave
 */
public class Limpiar extends Polygon {


    public void dibujate(Graphics2D g2, JPanel _panel) {
        g2.setColor(Color.white);
        g2.fillRect(0, 0, _panel.getWidth(), _panel.getHeight());
        
         
    }
}
