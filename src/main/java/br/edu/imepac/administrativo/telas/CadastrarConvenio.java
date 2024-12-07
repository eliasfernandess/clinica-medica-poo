/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.administrativo.telas;

import java.sql.Connection;

/**
 *
 * @author elias
 */
public class CadastrarConvenio extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarConvenio
     */
    public CadastrarConvenio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    CadastrarConvenio(Connection conn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoNomeConvenio = new javax.swing.JTextField();
        CampoCodigoConvenio = new javax.swing.JTextField();
        CampoDescricao = new javax.swing.JTextField();
        DataTerminoConv = new javax.swing.JFormattedTextField();
        DataInicioConv = new javax.swing.JFormattedTextField();
        StatusConv = new javax.swing.JCheckBox();
        NomeLabel = new javax.swing.JLabel();
        LabelCodigo = new javax.swing.JLabel();
        LabelDesc = new javax.swing.JLabel();
        LabelDataInicio = new javax.swing.JLabel();
        LabelDataTermino = new javax.swing.JLabel();
        LabelStatus = new javax.swing.JLabel();
        BotãoSalvar = new javax.swing.JButton();
        BotãoLimpar = new javax.swing.JButton();
        BotãoCancelar = new javax.swing.JButton();
        BotãoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(830, 600));
        setPreferredSize(new java.awt.Dimension(830, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        CampoNomeConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeConvenioActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNomeConvenio);
        CampoNomeConvenio.setBounds(44, 84, 260, 33);
        getContentPane().add(CampoCodigoConvenio);
        CampoCodigoConvenio.setBounds(44, 156, 260, 33);
        getContentPane().add(CampoDescricao);
        CampoDescricao.setBounds(44, 227, 260, 33);

        DataTerminoConv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(DataTerminoConv);
        DataTerminoConv.setBounds(178, 300, 120, 33);

        DataInicioConv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(DataInicioConv);
        DataInicioConv.setBounds(46, 300, 110, 33);

        StatusConv.setBackground(new java.awt.Color(204, 204, 204));
        StatusConv.setText(" Ativo? Marque para sim");
        getContentPane().add(StatusConv);
        StatusConv.setBounds(46, 369, 160, 35);

        NomeLabel.setText("Nome do Convênio");
        getContentPane().add(NomeLabel);
        NomeLabel.setBounds(44, 62, 250, 16);

        LabelCodigo.setText("Código co Convênio");
        getContentPane().add(LabelCodigo);
        LabelCodigo.setBounds(44, 134, 240, 16);

        LabelDesc.setText("Descrição");
        getContentPane().add(LabelDesc);
        LabelDesc.setBounds(44, 207, 260, 16);

        LabelDataInicio.setText("Data de Início");
        getContentPane().add(LabelDataInicio);
        LabelDataInicio.setBounds(46, 278, 110, 16);

        LabelDataTermino.setText("Data de Término");
        getContentPane().add(LabelDataTermino);
        LabelDataTermino.setBounds(178, 278, 120, 16);

        LabelStatus.setText("Status");
        getContentPane().add(LabelStatus);
        LabelStatus.setBounds(46, 351, 32, 16);

        BotãoSalvar.setText("SALVAR");
        BotãoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoSalvar);
        BotãoSalvar.setBounds(48, 422, 118, 35);

        BotãoLimpar.setText("LIMPAR");
        getContentPane().add(BotãoLimpar);
        BotãoLimpar.setBounds(184, 422, 120, 35);

        BotãoCancelar.setText("CANCELAR");
        getContentPane().add(BotãoCancelar);
        BotãoCancelar.setBounds(48, 469, 256, 35);

        BotãoVoltar.setText("Voltar");
        BotãoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoVoltar);
        BotãoVoltar.setBounds(45, 30, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeConvenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeConvenioActionPerformed

    private void BotãoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotãoSalvarActionPerformed

    private void BotãoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoVoltarActionPerformed
        // TODO add your handling code here:
        TelaLobby telaLobby = new TelaLobby(); // Instancia a próxima tela
        telaLobby.setVisible(true); // Exibe a nova tela
        this.dispose(); // Fecha a tela atual (TelaLogin)
    }//GEN-LAST:event_BotãoVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarConvenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCancelar;
    private javax.swing.JButton BotãoLimpar;
    private javax.swing.JButton BotãoSalvar;
    private javax.swing.JButton BotãoVoltar;
    private javax.swing.JTextField CampoCodigoConvenio;
    private javax.swing.JTextField CampoDescricao;
    private javax.swing.JTextField CampoNomeConvenio;
    private javax.swing.JFormattedTextField DataInicioConv;
    private javax.swing.JFormattedTextField DataTerminoConv;
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JLabel LabelDataInicio;
    private javax.swing.JLabel LabelDataTermino;
    private javax.swing.JLabel LabelDesc;
    private javax.swing.JLabel LabelStatus;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JCheckBox StatusConv;
    // End of variables declaration//GEN-END:variables
}