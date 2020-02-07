/*
 * Crea una estrella/espiral en pantalla
 */
package codigo.formas;

import java.awt.Color;

/**
 *
 * Autores: Ramiro Diego, Sofía Rico, Javier de la Llave
 */
public class Estrella extends Forma {
        /**
     * 
     * @param _posX: posición x centro del forma
     * @param _posY: : posición Y centro de la forma
     * @param _color: color de la forma
     * @param _relleno: si está rellena la forma o no.
     */
    public Estrella(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del triángulo correctamente para que guarde 3 lados
        super(_posX, _posY, 256, _color, _relleno);
    }

    
    @Override 
    public void calculaVertices(int _radio, double _giro){
        int n = 20; 
        for(int i=0; i<npoints; i++){
            this.xpoints[i] = (int) (x + (_radio/(i%n +1))*Math.cos((2*Math.PI * i + _giro/(i%n +1))/npoints));
            this.ypoints[i] = (int) (y + (_radio/(i%n +1))*Math.sin((2*Math.PI * i + _giro/(i%n +1))/npoints));
        }
    }
    
}
