package learnandplay;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Jugar extends javax.swing.JFrame {
    
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

    public Jugar() {
        initComponents();
        File Archivo=new File("Eleccion.jpg");
        this.CargarImagen(Archivo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miPanel = new javax.swing.JPanel();
        miImagenGrafica = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        BotonSurAmerica = new javax.swing.JButton();
        BotonEuropa = new javax.swing.JButton();
        BotonColombia = new javax.swing.JButton();
        BotonUSA = new javax.swing.JButton();

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

        BotonSurAmerica.setText("SUR AMERICA");
        BotonSurAmerica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSurAmericaMouseClicked(evt);
            }
        });

        BotonEuropa.setText("EUROPA");
        BotonEuropa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEuropaMouseClicked(evt);
            }
        });

        BotonColombia.setText("COLOMBIA");

        BotonUSA.setText("ESTADOS UNIDOS");

        javax.swing.GroupLayout miPanelLayout = new javax.swing.GroupLayout(miPanel);
        miPanel.setLayout(miPanelLayout);
        miPanelLayout.setHorizontalGroup(
            miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miPanelLayout.createSequentialGroup()
                .addComponent(miImagenGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1339, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSurAmerica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEuropa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonColombia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonUSA, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE))
                .addGap(181, 181, 181))
        );
        miPanelLayout.setVerticalGroup(
            miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miPanelLayout.createSequentialGroup()
                .addComponent(miImagenGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonSurAmerica, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonEuropa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonColombia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonUSA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
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
        Introduccion jFrame= new Introduccion();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonVolverMouseClicked

    private void BotonSurAmericaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSurAmericaMouseClicked
        SurAmerica jFrame= new SurAmerica();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonSurAmericaMouseClicked

    private void BotonEuropaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEuropaMouseClicked
        Europa jFrame= new Europa();
        jFrame.setVisible(true);
    }//GEN-LAST:event_BotonEuropaMouseClicked

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
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Jugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonColombia;
    private javax.swing.JButton BotonEuropa;
    private javax.swing.JButton BotonSurAmerica;
    private javax.swing.JButton BotonUSA;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel miImagenGrafica;
    private javax.swing.JPanel miPanel;
    // End of variables declaration//GEN-END:variables
}
