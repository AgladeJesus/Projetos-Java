/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagemlabel;

import javax.swing.ImageIcon;

/**
 *
 * @author aglad
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        lblImagem = new javax.swing.JLabel();
        btnImag1 = new javax.swing.JButton();
        btnImag2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblImagem.setText("jLabel1");
        getContentPane().add(lblImagem);
        lblImagem.setBounds(10, 10, 380, 230);

        btnImag1.setText("Imagem1");
        btnImag1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImag1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnImag1);
        btnImag1.setBounds(80, 260, 90, 23);

        btnImag2.setText("Imagem2");
        btnImag2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImag2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnImag2);
        btnImag2.setBounds(220, 260, 80, 23);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImag1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImag1ActionPerformed
        // TODO add your handling code here:
        
        ImageIcon icon = new ImageIcon("C:\\Users\\aglad\\OneDrive\\Documentos\\MeusProjetosGit\\Java\\imagens\\(1).jpeg");
        lblImagem.setIcon(icon);
    }//GEN-LAST:event_btnImag1ActionPerformed

    private void btnImag2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImag2ActionPerformed
        // TODO add your handling code here:
        
        ImageIcon icon = new ImageIcon("C:\\Users\\aglad\\OneDrive\\Documentos\\MeusProjetosGit\\Java\\imagens\\(2).jpeg");
        lblImagem.setIcon(icon);
    }//GEN-LAST:event_btnImag2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImag1;
    private javax.swing.JButton btnImag2;
    private javax.swing.JLabel lblImagem;
    // End of variables declaration//GEN-END:variables
}