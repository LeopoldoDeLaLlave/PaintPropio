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
    
    public Triangulo(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(_posX, _posY, 3, _color, _relleno);
    }
    
}
