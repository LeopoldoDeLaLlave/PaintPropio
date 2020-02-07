/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *Autores: Ramiro Diego, Sofia Rico, Javier de la Llave
 */
package codigo;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Javier
 */
public class VentanaHerramientas extends javax.swing.JPanel {

    public boolean relleno = false;//Indica si la forma está rellena o no
    public int formaElegida = 11;//indica la herramienta que usaremos, por defecto es el lápiz
    boolean goma = false; //Nos indica si estamos usando la goma
    int grosorLinea = 1;//Grosor de los trazos que hagamos

    VentanaPaint miPaint = null;

    /**
     * Creates new form VentanaHerramientas
     */
    public VentanaHerramientas() {
        initComponents();
        poneIconos();
    }

    //Cargo la imagen en el jButton 
    public void afinaIcono(ImageIcon _miImagen, JButton _boton) {
        _boton.setIcon(_miImagen);
    }

    //Pone los iconos
    private void poneIconos() {

        //Boton pincel
        ImageIcon miImagen = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/picel3.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen, botonPincel);

        //BotonGoma
        ImageIcon miImagen2 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/goma6.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen2, botonGoma);

        //BotonSpray
        ImageIcon miImagen3 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/spray2.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen3, botonSpray);

        //BotonPluma
        ImageIcon miImagen4 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/pluma2.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen4, botonPluma);

        //BotonPipeta
        ImageIcon miImagen5 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/pipeta.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen5, botonPipeta);



        //BotonTiraLineas
        ImageIcon miImagen7 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/linea.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen7, botonTiraLineas);

        //BotonRectanguloLibre
        ImageIcon miImagen8 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/rectangulo_1.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen8, botonRectanguloLibre);

        //Boton Triángulos
        ImageIcon miImagen9 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/triangle.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen9, botonTriangulo);

        //Boton cuadrado
        ImageIcon miImagen10 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/cuadrado.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen10, botonCuadrado);

        //Boton pentágono
        ImageIcon miImagen11 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/pentagon.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen11, botonPentagono);

        //Boton estrella
        ImageIcon miImagen12 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/estrella.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen12, botonEstrella);

        //Boton circulo
        ImageIcon miImagen13 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/circle.png"))
                .getImage()
                .getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setBounds(10, 10, 10, 10);

        afinaIcono(miImagen13, botonCirculo2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCuadrado = new javax.swing.JButton();
        botonPentagono = new javax.swing.JButton();
        botonEstrella = new javax.swing.JButton();
        botonCirculo2 = new javax.swing.JButton();
        botonTriangulo = new javax.swing.JButton();
        checkRelleno = new javax.swing.JCheckBox();
        botonPincel = new javax.swing.JButton();
        botonGoma = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        botonTiraLineas = new javax.swing.JButton();
        botonSpray = new javax.swing.JButton();
        botonPipeta = new javax.swing.JButton();
        botonRectanguloLibre = new javax.swing.JButton();
        botonPluma = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuadradoActionPerformed(evt);
            }
        });

        botonPentagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPentagonoActionPerformed(evt);
            }
        });

        botonEstrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstrellaActionPerformed(evt);
            }
        });

        botonCirculo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCirculo2ActionPerformed(evt);
            }
        });

        botonTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrianguloActionPerformed(evt);
            }
        });

        checkRelleno.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        checkRelleno.setText("Relleno");
        checkRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRellenoActionPerformed(evt);
            }
        });

        botonPincel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPincelActionPerformed(evt);
            }
        });

        botonGoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGomaActionPerformed(evt);
            }
        });

        jSlider1.setMaximum(15);
        jSlider1.setMinimum(1);
        jSlider1.setValue(1);
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider1MouseReleased(evt);
            }
        });

        botonTiraLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTiraLineasActionPerformed(evt);
            }
        });

        botonSpray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSprayActionPerformed(evt);
            }
        });

        botonPipeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPipetaActionPerformed(evt);
            }
        });

        botonRectanguloLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRectanguloLibreActionPerformed(evt);
            }
        });

        botonPluma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlumaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkRelleno, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonSpray, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPluma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonPincel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGoma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonPentagono, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCirculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonPipeta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonTiraLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonRectanguloLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEstrella, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPincel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGoma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSpray, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPluma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonPipeta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonTiraLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonRectanguloLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEstrella, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonPentagono, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCirculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(checkRelleno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuadradoActionPerformed
        formaElegida = 4;
    }//GEN-LAST:event_botonCuadradoActionPerformed

    private void botonPentagonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPentagonoActionPerformed
        formaElegida = 5;
    }//GEN-LAST:event_botonPentagonoActionPerformed

    private void botonEstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstrellaActionPerformed
        formaElegida = 256;
    }//GEN-LAST:event_botonEstrellaActionPerformed

    private void botonCirculo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCirculo2ActionPerformed
        formaElegida = 1;
    }//GEN-LAST:event_botonCirculo2ActionPerformed

    private void checkRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRellenoActionPerformed
        relleno = checkRelleno.isSelected();
    }//GEN-LAST:event_checkRellenoActionPerformed

    private void botonTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrianguloActionPerformed
        formaElegida = 3;
    }//GEN-LAST:event_botonTrianguloActionPerformed

    private void botonPincelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPincelActionPerformed
        formaElegida = 11;
        goma = false;
    }//GEN-LAST:event_botonPincelActionPerformed

    private void botonGomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGomaActionPerformed
        formaElegida = 11;
        goma = true;

    }//GEN-LAST:event_botonGomaActionPerformed

    private void jSlider1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseReleased
        grosorLinea = jSlider1.getValue();
    }//GEN-LAST:event_jSlider1MouseReleased

    private void botonTiraLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTiraLineasActionPerformed
        formaElegida = 0;
    }//GEN-LAST:event_botonTiraLineasActionPerformed

    private void botonSprayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSprayActionPerformed
        formaElegida = 12;
    }//GEN-LAST:event_botonSprayActionPerformed

    private void botonPipetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPipetaActionPerformed
        formaElegida = 14;
    }//GEN-LAST:event_botonPipetaActionPerformed

    private void botonRectanguloLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRectanguloLibreActionPerformed
        formaElegida = 15;
    }//GEN-LAST:event_botonRectanguloLibreActionPerformed

    private void botonPlumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlumaActionPerformed
        formaElegida = 17;
    }//GEN-LAST:event_botonPlumaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCirculo2;
    private javax.swing.JButton botonCuadrado;
    private javax.swing.JButton botonEstrella;
    private javax.swing.JButton botonGoma;
    private javax.swing.JButton botonPentagono;
    private javax.swing.JButton botonPincel;
    private javax.swing.JButton botonPipeta;
    private javax.swing.JButton botonPluma;
    private javax.swing.JButton botonRectanguloLibre;
    private javax.swing.JButton botonSpray;
    private javax.swing.JButton botonTiraLineas;
    private javax.swing.JButton botonTriangulo;
    private javax.swing.JCheckBox checkRelleno;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
