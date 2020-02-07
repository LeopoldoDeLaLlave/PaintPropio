/*
 * Pinta de forma similar a una pluma
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * Autores: Ramiro Diego, Sofía Rico, Javier de la Llave
 */
public class Pluma extends Polygon {

    //Nos indican los puntos desde los que parten las líneas
    public int x, y;
    //Color del que se pintará la línea
    public Color color;

    /**
     * 
     * @param posX: posición x en la que se pinta.
     * @param posY: posición y en la que se pinta.
     * @param _color :Color del que se pinta
     */
    public Pluma(int posX, int posY, Color _color) {
        x = posX;
        y = posY;
        color = _color;
    }

    /**
     * 
     * @param g2: Graphics2D que se usa.
     * @param posX: posición x en la que se pinta.
     * @param posY: posición y en la que se pinta.
     * @param grosor :Grosor del que se pinta
     */
    public void dibujate(Graphics2D g2, int posX, int posY, int grosor) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(1));
        g2.setColor(color);

        //Pinta 5 rayas
        for (int i = 0; i < 10; i++) {
            g2.drawLine(x + i, y + i, posX + i, posY + i);
        }
        x= posX;
        y = posY;
        
        //Para volver a poner el grosor correcto
        g2.setStroke(new BasicStroke(grosor));
    }
}
