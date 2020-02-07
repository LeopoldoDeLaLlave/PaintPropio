/*
 * Mientras mantienes pulsado el ratón, dibuja una línea de diferentes grosores
 * Inspirado en el paint de Ángel, Juan y David.
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;

/**
 *
 * Autores: Ramiro Diego, Sofía Rico, Javier de la Llave
 */
public class Pincel extends Polygon{
    
    //Nos indican los puntos desde los que parten las líneas
    public int x, y;
    //Color del que se pintará la línea
    public Color color;

    /**
     * 
     * @param posX: posición x en la que se pinta
     * @param posY: posición y en la que se pinta
     * @param _color: Color del que se pinta 
     */
    public Pincel(int posX, int posY, Color _color ) {
        x = posX;
        y = posY;
        color = _color;
    }
    
    /**
     * 
     * @param g2: Graphics2D que se utiliza para pintar
     * @param posX: posición x en la que se pinta
     * @param posY: posición y en la que se pinta
     * @param grosor: grosor de las líneas 
     */
    public void dibujate(Graphics2D g2, int posX, int posY ,int grosor) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(grosor));
        g2.drawLine(posX, posY, x, y);
        x = posX;
        y = posY;

    }
}
