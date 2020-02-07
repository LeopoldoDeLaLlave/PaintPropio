/*
 * Permite crear rectángulos en la dirección que se quiera
 */
package codigo.formas;

import codigo.VentanaHerramientas;
import codigo.VentanaPaint;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * Autores: Ramiro Diego, Sofía Rico, Javier de la Llave
 */
public class RectanguloLibre extends Polygon {

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
    public RectanguloLibre(int posX, int posY, Color _color) {
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
     * @param _relleno 
     */
    public void dibujate(Graphics2D g2, int posX, int posY, int grosor, boolean _relleno) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(grosor));

        if (_relleno) {
            if (posX > x && posY > y) {
                g2.fillRect(x, y, (posX - x), (posY - y));
            } else if (posX < x && posY > y) {
                g2.fillRect(posX, y, (x - posX), (posY - y));
            } else if (posX > x && posY < y) {
                g2.fillRect(x, posY, (posX - x), (y - posY));
            } else {
                g2.fillRect(posX, posY, (x - posX), (y - posY));
            }
        } else {
            if (posX > x && posY > y) {
                g2.drawRect(x, y, (posX - x), (posY - y));
            } else if (posX < x && posY > y) {
                g2.drawRect(posX, y, (x - posX), (posY - y));
            } else if (posX > x && posY < y) {
                g2.drawRect(x, posY, (posX - x), (y - posY));
            } else {
                g2.drawRect(posX, posY, (x - posX), (y - posY));
            }
        }
        
    }
}
