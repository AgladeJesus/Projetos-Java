/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author aglad
 */
public class Principal extends javax.swing.JFrame {
    public Connection com = null;
    public Statement stmt;
    public ResultSet rs;

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

        btnSilga = new javax.swing.JLabel();
        btnNome = new javax.swing.JLabel();
        btnDesc = new javax.swing.JLabel();
        txtSigla = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btnInserir = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnSilga.setText("Silga:");
        getContentPane().add(btnSilga);
        btnSilga.setBounds(56, 40, 50, 14);

        btnNome.setText("Nome:");
        getContentPane().add(btnNome);
        btnNome.setBounds(50, 80, 60, 14);

        btnDesc.setText("Descrição:");
        getContentPane().add(btnDesc);
        btnDesc.setBounds(34, 120, 80, 14);
        getContentPane().add(txtSigla);
        txtSigla.setBounds(120, 40, 430, 20);
        getContentPane().add(txtNome);
        txtNome.setBounds(120, 80, 430, 20);

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 120, 430, 150);

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserir);
        btnInserir.setBounds(160, 300, 90, 23);

        btnDeletar.setText("Deletar");
        btnDeletar.setMaximumSize(new java.awt.Dimension(70, 23));
        btnDeletar.setPreferredSize(new java.awt.Dimension(70, 23));
        getContentPane().add(btnDeletar);
        btnDeletar.setBounds(280, 300, 80, 23);

        btnAtualizar.setText("Atualizar");
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(400, 300, 100, 23);

        btnLimparCampos.setText("Limpar");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimparCampos);
        btnLimparCampos.setBounds(23, 250, 80, 23);

        btnPrimeiro.setText("<< Primeiro");
        getContentPane().add(btnPrimeiro);
        btnPrimeiro.setBounds(50, 370, 110, 23);

        btnAnterior.setText("< Anterior");
        getContentPane().add(btnAnterior);
        btnAnterior.setBounds(200, 370, 100, 23);

        btnProximo.setText("Próximo >");
        getContentPane().add(btnProximo);
        btnProximo.setBounds(340, 370, 110, 23);

        btnUltimo.setText("Último >>");
        btnUltimo.setToolTipText("");
        getContentPane().add(btnUltimo);
        btnUltimo.setBounds(490, 370, 90, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Naveção entre os Registros");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 340, 270, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        
        try {
            
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/dbaula4", "root", " ");
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "INSERT INTO cursoVALUES('"
                    + txtSigla.getText() + "','"
                    + txtNome.getText() + "','"
                    + txtDesc.getText() + "')";
        JOptionPane.showMessageDialog(null, sql);
        int i = 0;
            
        
        
        }
        
    }//GEN-LAST:event_btnInserirActionPerformed

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
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JLabel btnDesc;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JLabel btnNome;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JLabel btnSilga;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
