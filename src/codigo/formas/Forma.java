/*
 * Nos permite crear el resto de formas
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
public class Forma extends Polygon {

    public Color color;
    public boolean relleno;
    //coordenadas del centro de la forma
    public int x;
    public int y;

    /**
     *
     * @param _posX: posición x centro del forma
     * @param _posY: : posición Y centro de la forma
     * @param _lados: número de lados que tiene la forma
     * @param _color: color de la forma
     * @param _relleno: si está rellena la forma o no.
     */
    public Forma(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(new int[_lados], new int[_lados], _lados);
        x = _posX;
        y = _posY;

        color = _color;
        relleno = _relleno;

    }

    public void dibujate(Graphics2D g2, int _posX, int _posY, int grosor) {

        calculaVertices(y - _posY, x - _posX);
        g2.setStroke(new BasicStroke(grosor));
        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }

    }

    //Este método calcula la posición de los vértices en un polígono regular
    public void calculaVertices(int _radio, double _giro) {
        for (int i = 0; i < npoints; i++) {
            xpoints[i] = (int) (x + _radio * Math.cos((2 * Math.PI * i + _giro / 40) / npoints));
            ypoints[i] = (int) (y + _radio * Math.sin((2 * Math.PI * i + _giro / 40) / npoints));

        }
    }
}
