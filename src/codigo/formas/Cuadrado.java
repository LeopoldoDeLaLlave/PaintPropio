/*
 * Crea un cuadrado en pantalla
 */
package codigo.formas;

import java.awt.Color;

/**
 *
 * Autores: Ramiro Diego, Sofía Rico, Javier de la Llave
 */
public class Cuadrado extends Forma{
    
    /**
     * 
     * @param _posX
     * @param _posY
     * @param _lados
     * @param _color
     * @param _relleno 
     */
    public Cuadrado(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(_posX, _posY, 4, _color, _relleno);
    }
    
}
