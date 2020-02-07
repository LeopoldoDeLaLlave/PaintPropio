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
     * @param posX
     * @param posY
     * @param _color 
     */
    public Pluma(int posX, int posY, Color _color) {
        x = posX;
        y = posY;
        color = _color;
    }

    /**
     * 
     * @param g2
     * @param posX
     * @param posY
     * @param grosor 
     */
    public void dibujate(Graphics2D g2, int posX, int posY, int grosor) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(1));
        g2.setColor(color);

        for (int i = 0; i < 10; i++) {
            g2.drawLine(x + i, y + i, posX + i, posY + i);
        }
        x= posX;
        y = posY;
        
        //Para volver a poner el grosor correcto
        g2.setStroke(new BasicStroke(grosor));
    }
}
