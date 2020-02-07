/*
 * Pinta puntos sueltos dando efecto de spray
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Random;

/**
 *
 * Autores: Ramiro Diego, Sofía Rico, Javier de la Llave
 */
public class Spray extends Polygon {
   
    public int x, y;//Nos indican los puntos desde los que parten las líneas
    
    public Color color;//Color del que se pintará la línea
   
    Random random = new Random();//Sorteamos que píxeles se rellenan y cuales no
    int valorRandom; //Guardaremos el valor random

    /**
     * 
     * @param _posX posicion x de la que parte
     * @param _posY posicion y de la que parte
     * @param _lados tamaño lados
     */
    public Spray(int posX, int posY, Color _color) {
        x = posX;
        y = posY;
        color = _color;
    }

    /**
     * 
     * @param g2 Grphics2D
     * @param posX
     * @param posY
     * @param grosor: grosor de las líneas
     */
    public void dibujate(Graphics2D g2, int posX, int posY, int grosor) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(1));       
        grosor += 7;//Para que se aprecie
        for (int i = 0; i < grosor; i++) {
            for (int j = 0; j < grosor; j++) {
                valorRandom = random.nextInt(5);//Uno de cada 5
                if (valorRandom == 3) {
                    g2.drawLine(x + i, y + j, x + i, y + j);
                }
            }

        }
        
        

    }
}
