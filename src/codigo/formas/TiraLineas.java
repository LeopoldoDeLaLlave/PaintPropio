/*
 * Crea líneas de un punto a otro
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
public class TiraLineas extends Polygon {
    //Nos indican los puntos desde los que parten las líneas
    public int x, y;
    //Color del que se pintará la línea
    public Color color;
    
    public TiraLineas(int posX, int posY, Color _color ) {
        x = posX;
        y = posY;
        color = _color;
    }
    
    public void dibujate(Graphics2D g2, int posX, int posY ,int grosor) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(grosor));
        g2.drawLine( x, y, posX, posY);
    }
}
