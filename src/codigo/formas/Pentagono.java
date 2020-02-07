/*
 * Crea un pentágono
 */
package codigo.formas;

import java.awt.Color;

/**
 *
 * Autores: Ramiro Diego, Sofía Rico, Javier de la Llave
 */
public class Pentagono extends Forma{
    
    /**
     *
     * @param _posX: posición x centro del forma
     * @param _posY: : posición Y centro de la forma
     * @param _lados: número de lados que tiene la forma
     * @param _color: color de la forma
     * @param _relleno: si está rellena la forma o no.
     */
    public Pentagono(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(_posX, _posY, 5, _color, _relleno);
    }
    
}
