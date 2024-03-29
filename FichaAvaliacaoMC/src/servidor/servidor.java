/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package servidor;

import cliente.cliente;
import java.awt.Color;
import mensagem.mensagem;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author a
 */
public class servidor extends javax.swing.JFrame {

    /**
     * Creates new form servidor
     */
    public servidor() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfPorta = new javax.swing.JTextField();
        lbIpLocal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taLogs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Iniciar Servidor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 131, 142, 42));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Servidor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 6, -1, -1));

        jLabel2.setText("Porta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 84, 37, -1));

        tfPorta.setText("12345");
        getContentPane().add(tfPorta, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 79, 75, -1));
        getContentPane().add(lbIpLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 174, 30));

        taLogs.setColumns(20);
        taLogs.setRows(5);
        jScrollPane1.setViewportView(taLogs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 190, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         System.out.println("SERVIDOR");
        if (estadoSvr==false)
        {
        try { //IP DA MAQUINA 
          lbIpLocal.setText(InetAddress.getLocalHost().toString());
        } catch (UnknownHostException ex) {
            Logger.getLogger(servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        Thread t1 = new Thread(){
            @Override
            public void run() {
     //O QUE A THREAD FAZ
                try {
                    servidor = new ServerSocket(Integer.parseInt(tfPorta.getText()));
                    mensagem.msgLog(taLogs,"Servidor na porta: " + tfPorta.getText() + " || Ás");
                   mensagem.msgLog(taLogs,"Servidor na porta"+tfPorta.getText()+ " || Ás");
                do{
                        cliente = servidor.accept();
                        mensagem.msgLog(taLogs,"Cliente ligado: " + cliente.getInetAddress().getHostAddress() + " || Ás");
                        Color randomColor = new Color((int) (Math.random() * 256),
                                              (int) (Math.random() * 256),
                                              (int) (Math.random() * 256));
                      
             
                        ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                        saida.writeObject(randomColor);
                        
                        saida.close();
                }while(estadoSvr);
                
                 cliente.close();
                 servidor.close();
                } catch (IOException ex) {
                    Logger.getLogger(servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        t1.start();
        estadoSvr=true;
           jButton1.setText("Desligar Servidor");
        }
        else{
            jButton1.setText("Ligar Servidor");
            estadoSvr=false;
            try {
                Socket cliente = new Socket("127.0.0.1",Integer.parseInt(tfPorta.getText()));
            } catch (IOException ex) {
                Logger.getLogger(servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new servidor().setVisible(true);
            }
        });
    }

    private boolean estadoSvr = false;
    private ServerSocket servidor;
    private Socket cliente;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIpLocal;
    private javax.swing.JTextArea taLogs;
    private javax.swing.JTextField tfPorta;
    // End of variables declaration//GEN-END:variables
}
