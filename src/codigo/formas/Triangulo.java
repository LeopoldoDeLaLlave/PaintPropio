/*
 * Dibuja un triángulo
 */
package codigo.formas;

import java.awt.Color;

/**
 *
 * Autores: Ramiro Diego, Sofía Rico, Javier de la Llave
 */
public class Triangulo extends Forma {
    
    /**
     * 
     * @param _posX posicion x de la que parte
     * @param _posY posicion t de la que parte
     * @param _lados tamaño lados
     * @param _color de la figura
     * @param _relleno sí o no
     */
    public Triangulo(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(_posX, _posY, 3, _color, _relleno);
    }
    
}
