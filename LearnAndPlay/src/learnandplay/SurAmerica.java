package learnandplay;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class SurAmerica extends javax.swing.JFrame {
    
    BufferedImage Imagen;
    
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
    
    public SurAmerica() {
        initComponents();
        File Archivo=new File("America.jpg");
        this.CargarImagen(Archivo); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        miPanel = new javax.swing.JPanel();
        miImagenGrafica = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        BotonBrasil = new javax.swing.JRadioButton();
        BotonVenezuela = new javax.swing.JRadioButton();
        BotonColombia = new javax.swing.JRadioButton();
        BotonEcuador = new javax.swing.JRadioButton();
        BotonPerú = new javax.swing.JRadioButton();
        BotonChile = new javax.swing.JRadioButton();
        BotonBolivia = new javax.swing.JRadioButton();
        BotonUruguay = new javax.swing.JRadioButton();
        BotonParaguay = new javax.swing.JRadioButton();
        BotonArgentina = new javax.swing.JRadioButton();

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

        BotonBrasil.setBackground(new java.awt.Color(255, 0, 0));
        BotonBrasil.setBorder(null);
        BotonBrasil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonBrasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBrasilMouseClicked(evt);
            }
        });

        BotonVenezuela.setBackground(new java.awt.Color(255, 0, 0));
        BotonVenezuela.setBorder(null);
        BotonVenezuela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonVenezuela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonVenezuelaMouseClicked(evt);
            }
        });

        BotonColombia.setBackground(new java.awt.Color(255, 0, 0));
        BotonColombia.setBorder(null);
        BotonColombia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonColombia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonColombiaMouseClicked(evt);
            }
        });

        BotonEcuador.setBackground(new java.awt.Color(255, 0, 0));
        BotonEcuador.setBorder(null);
        BotonEcuador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonEcuador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEcuadorMouseClicked(evt);
            }
        });

        BotonPerú.setBackground(new java.awt.Color(255, 0, 0));
        BotonPerú.setBorder(null);
        BotonPerú.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonPerú.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPerúMouseClicked(evt);
            }
        });

        BotonChile.setBackground(new java.awt.Color(255, 0, 0));
        BotonChile.setBorder(null);
        BotonChile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonChile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonChileMouseClicked(evt);
            }
        });

        BotonBolivia.setBackground(new java.awt.Color(255, 0, 0));
        BotonBolivia.setBorder(null);
        BotonBolivia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonBolivia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBoliviaMouseClicked(evt);
            }
        });

        BotonUruguay.setBackground(new java.awt.Color(255, 0, 0));
        BotonUruguay.setBorder(null);
        BotonUruguay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonUruguay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonUruguayMouseClicked(evt);
            }
        });

        BotonParaguay.setBackground(new java.awt.Color(255, 0, 0));
        BotonParaguay.setBorder(null);
        BotonParaguay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonParaguay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonParaguayMouseClicked(evt);
            }
        });

        BotonArgentina.setBackground(new java.awt.Color(255, 0, 0));
        BotonArgentina.setBorder(null);
        BotonArgentina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonArgentina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonArgentinaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout miPanelLayout = new javax.swing.GroupLayout(miPanel);
        miPanel.setLayout(miPanelLayout);
        miPanelLayout.setHorizontalGroup(
            miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miPanelLayout.createSequentialGroup()
                .addComponent(miImagenGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelLayout.createSequentialGroup()
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, miPanelLayout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(miPanelLayout.createSequentialGroup()
                                .addComponent(BotonPerú)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                .addComponent(BotonBrasil)
                                .addGap(371, 371, 371))
                            .addGroup(miPanelLayout.createSequentialGroup()
                                .addComponent(BotonColombia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonChile)
                            .addComponent(BotonVenezuela))
                        .addGap(65, 65, 65)
                        .addComponent(BotonParaguay)
                        .addGap(411, 411, 411)))
                .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(miPanelLayout.createSequentialGroup()
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(BotonEcuador))
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(677, 677, 677)
                        .addComponent(BotonUruguay))
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(612, 612, 612)
                        .addComponent(BotonBolivia))
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(626, 626, 626)
                        .addComponent(BotonArgentina)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        miPanelLayout.setVerticalGroup(
            miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miPanelLayout.createSequentialGroup()
                .addComponent(miImagenGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(BotonVenezuela)
                        .addGap(15, 15, 15)
                        .addComponent(BotonColombia)))
                .addGap(18, 18, 18)
                .addComponent(BotonEcuador)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BotonBrasil))
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(BotonPerú)))
                .addGap(29, 29, 29)
                .addComponent(BotonBolivia)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BotonChile))
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BotonParaguay)))
                .addGap(48, 48, 48)
                .addComponent(BotonUruguay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonArgentina)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        BotonBrasil.getAccessibleContext().setAccessibleDescription("");

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(miPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverMouseClicked
        this.setVisible(false);
        Jugar jFrame= new Jugar();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonVolverMouseClicked

    private void BotonVenezuelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVenezuelaMouseClicked
        this.setVisible(false);
        Paises jFrame= new Paises();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonVenezuelaMouseClicked

    private void BotonColombiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonColombiaMouseClicked
        this.setVisible(false);
        Paises jFrame= new Paises();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonColombiaMouseClicked

    private void BotonEcuadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEcuadorMouseClicked
        this.setVisible(false);
        Paises jFrame= new Paises();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonEcuadorMouseClicked

    private void BotonPerúMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPerúMouseClicked
        this.setVisible(false);
        Paises jFrame= new Paises();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonPerúMouseClicked

    private void BotonBrasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBrasilMouseClicked
        this.setVisible(false);
        Paises jFrame= new Paises();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonBrasilMouseClicked

    private void BotonBoliviaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBoliviaMouseClicked
        this.setVisible(false);
        Paises jFrame= new Paises();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonBoliviaMouseClicked

    private void BotonChileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonChileMouseClicked
        this.setVisible(false);
        Paises jFrame= new Paises();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonChileMouseClicked

    private void BotonParaguayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonParaguayMouseClicked
        this.setVisible(false);
        Paises jFrame= new Paises();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonParaguayMouseClicked

    private void BotonUruguayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonUruguayMouseClicked
        this.setVisible(false);
        Paises jFrame= new Paises();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonUruguayMouseClicked

    private void BotonArgentinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonArgentinaMouseClicked
        this.setVisible(false);
        Paises jFrame= new Paises();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonArgentinaMouseClicked

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
            java.util.logging.Logger.getLogger(SurAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SurAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SurAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SurAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new SurAmerica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonArgentina;
    private javax.swing.JRadioButton BotonBolivia;
    private javax.swing.JRadioButton BotonBrasil;
    private javax.swing.JRadioButton BotonChile;
    private javax.swing.JRadioButton BotonColombia;
    private javax.swing.JRadioButton BotonEcuador;
    private javax.swing.JRadioButton BotonParaguay;
    private javax.swing.JRadioButton BotonPerú;
    private javax.swing.JRadioButton BotonUruguay;
    private javax.swing.JRadioButton BotonVenezuela;
    private javax.swing.JButton BotonVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel miImagenGrafica;
    private javax.swing.JPanel miPanel;
    // End of variables declaration//GEN-END:variables
}
