/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ExercicioRelogio;
import java.awt.*;    
import java.awt.event.*; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;
/**
 *
 * @author a
 */
public class relogio extends javax.swing.JFrame implements KeyListener {
    
    private int velocidade=10;
    
    /**
     * Creates new form relogio
     */
    public relogio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        boneco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitulo.setText("HORÁRIO");
        getContentPane().add(lbTitulo);
        lbTitulo.setBounds(119, 14, 166, 48);

        lbHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbHora);
        lbHora.setBounds(30, 90, 334, 50);

        boneco.setText("jButton1");
        boneco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonecoActionPerformed(evt);
            }
        });
        boneco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bonecoKeyPressed(evt);
            }
        });
        getContentPane().add(boneco);
        boneco.setBounds(159, 278, 79, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               ThreadAtualiza ta = new ThreadAtualiza(lbHora);
               ta.start();
    }//GEN-LAST:event_formWindowOpened

    
    private void bonecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bonecoKeyPressed
        
        
        //System.out.println(this.getMinimumSize().getHeight()+ "" + this.getMinimumSize().getWidth());
        
        
        switch(evt.getKeyCode())
        {
            case KeyEvent.VK_UP:
                System.out.println("cima");
                
                boneco.setLocation(boneco.getX(),boneco.getY()-velocidade);
                break;
            
            case KeyEvent.VK_DOWN:
                System.out.println("baixo");
                 boneco.setLocation(boneco.getX(),boneco.getY()+velocidade);
                break;
            
            case KeyEvent.VK_RIGHT:
                System.out.println("direita");
                 boneco.setLocation(boneco.getX()+velocidade,boneco.getY());
                break;
            
            case KeyEvent.VK_LEFT:
                System.out.println("esquerda");
                if(boneco.getX()-velocidade > 0)
                 boneco.setLocation(boneco.getX()-velocidade,boneco.getY());
                else if(boneco.getX()-velocidade < velocidade )
                  boneco.setLocation(0, boneco.getY());
                else
                    boneco.setLocation(boneco.getX()-velocidade, boneco.getY());
                break;
                
        }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_bonecoKeyPressed

    private void bonecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bonecoActionPerformed


    
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
            java.util.logging.Logger.getLogger(relogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(relogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(relogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(relogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new relogio().setVisible(true);
            
           
            
            }
        });
    }


   
    private int horas,minutos,segundos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boneco;
    protected static javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
