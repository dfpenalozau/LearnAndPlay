package learnandplay;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Paises extends javax.swing.JFrame {
    
    BufferedImage Imagen;
    private int Respuesta;
    
    public void SetRespuesta(int Respuesta){
        this.Respuesta=Respuesta;
    }
    
    public int GetRespuesta(){
        return this.Respuesta;
    }
    
    
    
    void CargarImagen(File miArchivo){
        
        try {
            
            Imagen=ImageIO.read(miArchivo);
            ImageIcon miIcono=new ImageIcon(Imagen);
            int Width=this.Imagen.getWidth();
            int Heigth = this.Imagen.getHeight();
            miImagenGrafica.setIcon(miIcono);
            this.miImagenGrafica.setSize(Width,Heigth);
            this.miPanel.setSize(Width,Heigth);
            miPanel.add(miImagenGrafica);
            
        } catch (IOException ex) {
            
        }
    }

    public Paises() {
        initComponents();
        File Archivo=new File("Paises.jpg");
        this.CargarImagen(Archivo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miPanel = new javax.swing.JPanel();
        miImagenGrafica = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        BotonEcuador = new javax.swing.JToggleButton();
        BotonArgentina = new javax.swing.JToggleButton();
        BotonBolivia = new javax.swing.JToggleButton();
        BotonBrasil = new javax.swing.JToggleButton();
        BotonColombia = new javax.swing.JToggleButton();
        BotonChile = new javax.swing.JToggleButton();
        BotonParaguay = new javax.swing.JToggleButton();
        BotonPeru = new javax.swing.JToggleButton();
        BotonUruguay = new javax.swing.JToggleButton();
        BotonVenezuela = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonVolver.setText("VOLVER");
        BotonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonVolverMouseClicked(evt);
            }
        });
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        BotonEcuador.setText("ECUADOR");
        BotonEcuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEcuadorActionPerformed(evt);
            }
        });

        BotonArgentina.setText("ARGENTINA");
        BotonArgentina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonArgentinaMouseClicked(evt);
            }
        });
        BotonArgentina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArgentinaActionPerformed(evt);
            }
        });

        BotonBolivia.setText("BOLIVIA");
        BotonBolivia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBoliviaMouseClicked(evt);
            }
        });
        BotonBolivia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBoliviaActionPerformed(evt);
            }
        });

        BotonBrasil.setText("BRASIL");
        BotonBrasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBrasilMouseClicked(evt);
            }
        });
        BotonBrasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBrasilActionPerformed(evt);
            }
        });

        BotonColombia.setText("COLOMBIA");
        BotonColombia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonColombiaMouseClicked(evt);
            }
        });
        BotonColombia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonColombiaActionPerformed(evt);
            }
        });

        BotonChile.setText("CHILE");
        BotonChile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonChileMouseClicked(evt);
            }
        });
        BotonChile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonChileActionPerformed(evt);
            }
        });

        BotonParaguay.setText("PARAGUAY");
        BotonParaguay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonParaguayActionPerformed(evt);
            }
        });

        BotonPeru.setText("PERÚ");
        BotonPeru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPeruActionPerformed(evt);
            }
        });

        BotonUruguay.setText("URUGUAY");
        BotonUruguay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUruguayActionPerformed(evt);
            }
        });

        BotonVenezuela.setText("VENEZUELA");
        BotonVenezuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVenezuelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout miPanelLayout = new javax.swing.GroupLayout(miPanel);
        miPanel.setLayout(miPanelLayout);
        miPanelLayout.setHorizontalGroup(
            miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miPanelLayout.createSequentialGroup()
                .addComponent(miImagenGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1339, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelLayout.createSequentialGroup()
                        .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonBolivia, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonArgentina, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonBrasil, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonColombia, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonChile, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonEcuador, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonParaguay, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonPeru, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonUruguay, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonVenezuela, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(181, 181, 181))
        );
        miPanelLayout.setVerticalGroup(
            miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miPanelLayout.createSequentialGroup()
                .addComponent(miImagenGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEcuador, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonArgentina, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBolivia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonParaguay, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBrasil, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonPeru, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonColombia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonUruguay, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonChile, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVenezuela, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(miPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
    
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverMouseClicked
        this.setVisible(false);
        SurAmerica jFrame= new SurAmerica();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonVolverMouseClicked

    private void BotonEcuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEcuadorActionPerformed
        this.setVisible(false);
        Aviso miGrafica=new Aviso();
        miGrafica.setVisible(true);
        Respuesta=6;
    }//GEN-LAST:event_BotonEcuadorActionPerformed

    private void BotonArgentinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArgentinaActionPerformed

    }//GEN-LAST:event_BotonArgentinaActionPerformed

    private void BotonBoliviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBoliviaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBoliviaActionPerformed

    private void BotonBrasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBrasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBrasilActionPerformed

    private void BotonColombiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonColombiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonColombiaActionPerformed

    private void BotonChileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonChileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonChileActionPerformed

    private void BotonParaguayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonParaguayActionPerformed
        this.setVisible(false);
        Aviso miGrafica=new Aviso();
        miGrafica.setVisible(true);
        Respuesta=8;
    }//GEN-LAST:event_BotonParaguayActionPerformed

    private void BotonPeruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPeruActionPerformed
        this.setVisible(false);
        Aviso miGrafica=new Aviso();
        miGrafica.setVisible(true);
        Respuesta=7;
    }//GEN-LAST:event_BotonPeruActionPerformed

    private void BotonUruguayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUruguayActionPerformed
        this.setVisible(false);
        Aviso miGrafica=new Aviso();
        miGrafica.setVisible(true);
        Respuesta=9;
    }//GEN-LAST:event_BotonUruguayActionPerformed

    private void BotonVenezuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVenezuelaActionPerformed
        this.setVisible(false);
        Aviso miGrafica=new Aviso();
        miGrafica.setVisible(true);
        Respuesta=10;
    }//GEN-LAST:event_BotonVenezuelaActionPerformed

    private void BotonArgentinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonArgentinaMouseClicked
        this.setVisible(false);
        Aviso miGrafica=new Aviso();
        miGrafica.setVisible(true);
        Respuesta=1;
    }//GEN-LAST:event_BotonArgentinaMouseClicked

    private void BotonBoliviaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBoliviaMouseClicked
        this.setVisible(false);
        Aviso miGrafica=new Aviso();
        miGrafica.setVisible(true);
        Respuesta=2;
    }//GEN-LAST:event_BotonBoliviaMouseClicked

    private void BotonBrasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBrasilMouseClicked
       this.setVisible(false);
        Aviso miGrafica=new Aviso();
        miGrafica.setVisible(true);
        Respuesta=3;
    }//GEN-LAST:event_BotonBrasilMouseClicked

    private void BotonColombiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonColombiaMouseClicked
        this.setVisible(false);
        Aviso miGrafica=new Aviso();
        miGrafica.setVisible(true);   
        Respuesta=5;
    }//GEN-LAST:event_BotonColombiaMouseClicked

    private void BotonChileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonChileMouseClicked
        this.setVisible(false);
        Aviso miGrafica=new Aviso();
        miGrafica.setVisible(true);
        Respuesta=4;
    }//GEN-LAST:event_BotonChileMouseClicked

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
            java.util.logging.Logger.getLogger(Paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Paises().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonArgentina;
    private javax.swing.JToggleButton BotonBolivia;
    private javax.swing.JToggleButton BotonBrasil;
    private javax.swing.JToggleButton BotonChile;
    private javax.swing.JToggleButton BotonColombia;
    private javax.swing.JToggleButton BotonEcuador;
    private javax.swing.JToggleButton BotonParaguay;
    private javax.swing.JToggleButton BotonPeru;
    private javax.swing.JToggleButton BotonUruguay;
    private javax.swing.JToggleButton BotonVenezuela;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel miImagenGrafica;
    private javax.swing.JPanel miPanel;
    // End of variables declaration//GEN-END:variables
}
