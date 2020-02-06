/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import codigo.formas.Circulo2;
import codigo.formas.Cuadrado;
import codigo.formas.Estrella;
import codigo.formas.Forma;
import codigo.formas.Limpiar;
import codigo.formas.Pentagono;
import codigo.formas.Pincel;
import codigo.formas.Pluma;
import codigo.formas.RectanguloLibre;
import codigo.formas.Spray;
import codigo.formas.Texto;
import codigo.formas.TiraLineas;
import codigo.formas.Triangulo;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.*;

/**
 *
 * @author Javier
 */
public class VentanaPaint extends javax.swing.JFrame {

    //Este buffer acelera la memoria para que podamos dibujar
    BufferedImage buffer, buffer2, buffer3 = null;

    //Permite dibujar, una para el buffer y otra para el panel
    Graphics2D bufferGraphics, bufferGraphics2, bufferGraphics3, jPanelGraphics = null;

    //Guardaremos los buffers cada vez que haya cambio
    //ArrayList<BufferedImage> bufferLista = new ArrayList<BufferedImage>();
    ArrayList<BufferedImage> buffer2Lista = new ArrayList<BufferedImage>();
    
    ArrayList<Graphics2D> g2Lista = new ArrayList<Graphics2D>();
    
    int maxNum = 0;

    Forma miForma = null;
    Pincel miPincel = null;
    TiraLineas miTiraLineas = null;
    Spray miSpray = null;
    RectanguloLibre miRectanguloLibre = null;
    Texto miTexto = null;
    Limpiar miLimpiar = null;
    Pluma miPluma = null;
    VentanaHerramientas misHerramientas = null;
    //Aquí guardaremos el texto para poner en pantalla
    String texto = "";

    //Este indice nos indica que buffer se muestra en pantalla
    int indiceLista = 0;

    int tamanoFuente = 16; //La fuente será 16 por defecto

    String fuente = "Arial"; //La fuente, por defecto será Arial

    /**
     * Creates new form VentanaPaint
     */
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
        jDialogColor.setSize(640, 450);

        //Ponemos icono a la paleta de colores
        ImageIcon miImagen14 = new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/palette.png"))
                .getImage()
                .getScaledInstance(53, 53, Image.SCALE_DEFAULT)));

        botonPaleta.setOpaque(false);
        botonPaleta.setContentAreaFilled(false);
        botonPaleta.setBorderPainted(false);
        //Cargo la imagen en el jButton 
        botonPaleta.setIcon(miImagen14);

        //Icono y titulo de mierda que se le ha ocurrido a Ramiro
        setTitle("Paint Star Wars");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/sw.png")).getImage());

    }

    public void personalizarCursor(ImageIcon img) {
        Cursor cursor;

        Toolkit t = Toolkit.getDefaultToolkit();
        cursor = t.createCustomCursor(img.getImage(), new Point(1, 1), "Cursor");
        setCursor(cursor);

    }

    //Enlaza buffergraphics con jpanel
    private void inicializaBuffers() {

        //Creo una imagen del mismo ancho y alto que el Jpanel       
        buffer = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        buffer2 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        buffer3 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());

        //Creo una imagen modicable
        bufferGraphics = buffer.createGraphics();
        bufferGraphics2 = buffer2.createGraphics();
 

        //Inicializo el buffer para que se pinte de blanco entero
        bufferGraphics.setColor(Color.white);
        bufferGraphics.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());


        bufferGraphics2.setColor(Color.white);
        bufferGraphics2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
 

        //Enlazamos el jPanel1 con el jPanelGraphics
        jPanelGraphics = (Graphics2D) jPanel1.getGraphics();
        

        //Añado el primer buffer a la lista
        BufferedImage clone2 = new BufferedImage(buffer2.getWidth(),
        buffer2.getHeight(), buffer2.getType());
        Graphics2D g2d = clone2.createGraphics();
        g2d.drawImage(buffer2, 0, 0, null);
        g2d.dispose();
        buffer2Lista.add(clone2);


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //pinto el buffer sobre el jpanel
        jPanelGraphics.drawImage(buffer, 0, 0, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogColor = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        aceptarColor = new javax.swing.JButton();
        cancelarColor = new javax.swing.JButton();
        jDialogGuardar = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        panelColores = new codigo.panelColores();
        ventanaHerramientas1 = new codigo.VentanaHerramientas();
        jLabelCoordenadas = new javax.swing.JLabel();
        botonPaleta = new javax.swing.JButton();
        botonescribir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldtext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxFuente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTamanoFuente = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItemUndo = new javax.swing.JMenuItem();
        jMenuItemRehacer = new javax.swing.JMenuItem();

        aceptarColor.setText("Aceptar");
        aceptarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarColorActionPerformed(evt);
            }
        });

        cancelarColor.setText("Cancelar");
        cancelarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogColorLayout = new javax.swing.GroupLayout(jDialogColor.getContentPane());
        jDialogColor.getContentPane().setLayout(jDialogColorLayout);
        jDialogColorLayout.setHorizontalGroup(
            jDialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogColorLayout.createSequentialGroup()
                .addGroup(jDialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogColorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogColorLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(aceptarColor)
                        .addGap(118, 118, 118)
                        .addComponent(cancelarColor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogColorLayout.setVerticalGroup(
            jDialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogColorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jDialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarColor)
                    .addComponent(cancelarColor))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jDialogGuardarLayout = new javax.swing.GroupLayout(jDialogGuardar.getContentPane());
        jDialogGuardar.getContentPane().setLayout(jDialogGuardarLayout);
        jDialogGuardarLayout.setHorizontalGroup(
            jDialogGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        jDialogGuardarLayout.setVerticalGroup(
            jDialogGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogGuardarLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 154, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        botonPaleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPaletaActionPerformed(evt);
            }
        });

        botonescribir.setText("Escribir");
        botonescribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonescribirActionPerformed(evt);
            }
        });

        jLabel1.setText("Texto:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Fuente:");

        jComboBoxFuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Batang", "Comic Sans MS", "Helvetica", "Times New Roman" }));
        jComboBoxFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFuenteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Tamaño:");

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Reiniciar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItemUndo.setText("Deshacer");
        jMenuItemUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUndoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemUndo);

        jMenuItemRehacer.setText("Rehacer");
        jMenuItemRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRehacerActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRehacer);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPaleta)
                .addGap(87, 87, 87)
                .addComponent(jLabelCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldtext, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonescribir, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ventanaHerramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTamanoFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonescribir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTamanoFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ventanaHerramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(botonPaleta)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(panelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Este metodo actua cuando arrastras el raton habiendo pulsado y hasta que sueltas
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        //Esto es lo que se dibuja sobre la pantalla
        bufferGraphics.drawImage(buffer2, 0, 0, null);

        switch (ventanaHerramientas1.formaElegida) {

            //HAce una lina de un punto a otro
            case 0:
                miTiraLineas.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
            //HAce un triángulo
            case 3:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Hace un cuadrado
            case 4:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
            //Hace un pentágono
            case 5:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
            //Hace un círculo
            case 1:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Hace trazo libre 
            case 11:
                miPincel.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Efecto spray
            case 12:
                miSpray = new Spray(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                miSpray.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Dibuja un rectangulo libre
            case 15:
                miRectanguloLibre.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea, ventanaHerramientas1.relleno);
                break;

            //Efecto pluma
            case 17:
                miPluma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Hace la estrella
            case 256:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

        }
        //Refresca la pantalla y pone lo pintado
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        switch (ventanaHerramientas1.formaElegida) {

            case 0:
                miTiraLineas = new TiraLineas(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                miTiraLineas.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
            case 3:
                miForma = new Triangulo(evt.getX(), evt.getY(), 4, panelColores.colorSeleccionado, ventanaHerramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            case 4:
                miForma = new Cuadrado(evt.getX(), evt.getY(), 4, panelColores.colorSeleccionado, ventanaHerramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            case 5:
                miForma = new Pentagono(evt.getX(), evt.getY(), 5, panelColores.colorSeleccionado, ventanaHerramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            case 1:
                miForma = new Circulo2(evt.getX(), evt.getY(), 100, panelColores.colorSeleccionado, ventanaHerramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Este caso sirve de pincel y de goma
            case 11:
                if (ventanaHerramientas1.goma) {
                    miPincel = new Pincel(evt.getX(), evt.getY(), panelColores.colorSeleccionadoGoma);
                } else {
                    miPincel = new Pincel(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                }

                break;

            case 12:

                miSpray = new Spray(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                miSpray.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Pipeta
            case 14:
                Color c = new Color(buffer2.getRGB(evt.getX(), evt.getY()), true);
                panelColores.colorSeleccionado = c;
                panelColores.labelColorSeleccionado.setBackground(c);
                //Volvemos a la herramienta anterior
                ventanaHerramientas1.formaElegida = ventanaHerramientas1.aux;
                break;
            case 15:
                miRectanguloLibre = new RectanguloLibre(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                //miRectanguloLibre.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea, ventanaHerramientas1.relleno);
                break;

            //Escribir
            case 16:
                miTexto = new Texto(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                miTexto.escribete(bufferGraphics2, texto, tamanoFuente, fuente);
                bufferGraphics.drawImage(buffer2, 0, 0, null);
                repaint(0, 0, 1, 1);
                texto = "";
                break;

            case 17:

                miPluma = new Pluma(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                miPluma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
            case 256:
                miForma = new Estrella(evt.getX(), evt.getY(), panelColores.colorSeleccionado, ventanaHerramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased

        if ((ventanaHerramientas1.formaElegida > 0 && ventanaHerramientas1.formaElegida <= 5) || ventanaHerramientas1.formaElegida == 256) {//Para que no dé error cuando no pintemos formas
            miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
        } else if (ventanaHerramientas1.formaElegida == 0) {
            miTiraLineas.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
        } else if (ventanaHerramientas1.formaElegida == 15) {
            miRectanguloLibre.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea, ventanaHerramientas1.relleno);
        }

        //Siempre que no sea la pipeta, al soltar guardará un buffer en la lista
        if (ventanaHerramientas1.formaElegida != 14) {
            indiceLista++;
            
            //Clonamos la imagen para guardarla en la lista de buffers
            BufferedImage clone = new BufferedImage(buffer2.getWidth(),
            buffer2.getHeight(), buffer2.getType());
            Graphics2D g2d = clone.createGraphics();
            g2d.drawImage(buffer2, 0, 0, null);
            g2d.dispose();
            
            if(buffer2Lista.size() <= indiceLista){//Si en la posición en la que vamos a añadir el buffer no ha habido otro antes
                buffer2Lista.add(clone);
            }else{
                buffer2Lista.set(indiceLista, clone);
            }
            
        }

    }//GEN-LAST:event_jPanel1MouseReleased

    //Señala las coordenadas en las que están el ratón
    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved

        jLabelCoordenadas.setText(evt.getX() + " , " + evt.getY());
    }//GEN-LAST:event_jPanel1MouseMoved

    private void botonPaletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPaletaActionPerformed
        jDialogColor.setVisible(true);
    }//GEN-LAST:event_botonPaletaActionPerformed

    private void aceptarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarColorActionPerformed
        jDialogColor.setVisible(false);
        panelColores.colorSeleccionado = jColorChooser1.getColor();
        panelColores.labelColorSeleccionado.setBackground(jColorChooser1.getColor());
    }//GEN-LAST:event_aceptarColorActionPerformed

    private void cancelarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarColorActionPerformed
        jDialogColor.setVisible(false);
    }//GEN-LAST:event_cancelarColorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int seleccion = jFileChooser1.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //Si entra aqui es porque el usuario ha pulsado guardar
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());
            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {

                try {
                    ImageIO.write(buffer, "png", fichero);
                } catch (IOException e) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("archivos de imagen jpg", "jpg"));
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("archivos de imagen png", "png"));
        int seleccion = jFileChooser1.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());

            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {

                    //bufferGraphics2.drawImage(ImageIO.read(fichero), 0, 0, null);
                    bufferGraphics.drawImage(ImageIO.read(fichero), 0, 0, null);
                    repaint(0, 0, 1, 1);
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    private void botonescribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonescribirActionPerformed
        if (!jTextFieldTamanoFuente.getText().isEmpty()) {
            tamanoFuente = Integer.parseInt(jTextFieldTamanoFuente.getText());
            //Para que el tamaño de la fuente esté entre 3 y 120
            if (tamanoFuente < 3) {
                tamanoFuente = 3;
            }
            if (tamanoFuente > 120) {
                tamanoFuente = 120;
            }
        }
        texto = jTextFieldtext.getText();
        ventanaHerramientas1.formaElegida = 16;
    }//GEN-LAST:event_botonescribirActionPerformed

    //Botón para dejar pantalla blanca
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        miLimpiar = new Limpiar();
        miLimpiar.dibujate(bufferGraphics2, jPanel1);
        bufferGraphics.drawImage(buffer2, 0, 0, null);
        bufferGraphics2.drawImage(buffer2, 0, 0, null);
        repaint(0, 0, 1, 1);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    //Botón deshacer, no funciona de momento
    private void jMenuItemUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUndoActionPerformed

        //Si el indice es mayor que 0 retrocedemos una posición en la lista
        if (indiceLista > 0) {
            indiceLista--;
        }

        /////////
        bufferGraphics.drawImage(buffer2Lista.get(indiceLista), 0, 0, null);//Esta linea es capaz de dibujar seguro
        ///////////
        bufferGraphics2.drawImage(buffer2Lista.get(indiceLista), 0, 0, null);

        repaint(0, 0, 1, 1);

    }//GEN-LAST:event_jMenuItemUndoActionPerformed

    private void jComboBoxFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFuenteActionPerformed
        fuente = (String) jComboBoxFuente.getSelectedItem();
    }//GEN-LAST:event_jComboBoxFuenteActionPerformed

    private void jMenuItemRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRehacerActionPerformed
        //Si el indice es mayor que 0 retrocedemos una posición en la lista
        if (indiceLista < buffer2Lista.size()-1) {
            indiceLista++;
        }

        /////////
        bufferGraphics.drawImage(buffer2Lista.get(indiceLista), 0, 0, null);//Esta linea es capaz de dibujar seguro
        ///////////
        bufferGraphics2.drawImage(buffer2Lista.get(indiceLista), 0, 0, null);

        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_jMenuItemRehacerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarColor;
    private javax.swing.JButton botonPaleta;
    private javax.swing.JButton botonescribir;
    private javax.swing.JButton cancelarColor;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBoxFuente;
    private javax.swing.JDialog jDialogColor;
    private javax.swing.JDialog jDialogGuardar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCoordenadas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemRehacer;
    private javax.swing.JMenuItem jMenuItemUndo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldTamanoFuente;
    private javax.swing.JTextField jTextFieldtext;
    private codigo.panelColores panelColores;
    private codigo.VentanaHerramientas ventanaHerramientas1;
    // End of variables declaration//GEN-END:variables

}
