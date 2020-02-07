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
    
    /**
     * 
     * @param _posX posicion x de la que parte
     * @param _posY posicion t de la que parte
     * @param _lados tamaño lados
     */
    public TiraLineas(int posX, int posY, Color _color ) {
        x = posX;
        y = posY;
        color = _color;
    }
    
    /**
     * 
     * @param g2 Graphics2D
     * @param posX posición x de la que parte
     * @param posY posición y de la que parte
     * @param grosor grosor de la línea
     */
    public void dibujate(Graphics2D g2, int posX, int posY ,int grosor) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(grosor));
        g2.drawLine( x, y, posX, posY);
    }
}
