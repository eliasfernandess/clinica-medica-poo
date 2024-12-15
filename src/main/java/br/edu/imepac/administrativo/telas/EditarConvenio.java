/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.administrativo.telas;

import br.edu.imepac.administrativo.daos.ConvenioDAO;
import br.edu.imepac.administrativo.entidades.Convenio;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author elias
 */
public class EditarConvenio extends javax.swing.JFrame {

    /**
     * Creates new form EditarConvenio
     */
    public EditarConvenio() {
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
        ATUALIZAR = new javax.swing.JButton();
        BotãoLimpar = new javax.swing.JButton();
        BotãoVoltar = new javax.swing.JButton();
        AbrirListagem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(830, 843));
        setMinimumSize(new java.awt.Dimension(830, 843));
        setPreferredSize(new java.awt.Dimension(830, 843));
        getContentPane().setLayout(null);

        CampoNomeConvenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CampoNomeConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeConvenioActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNomeConvenio);
        CampoNomeConvenio.setBounds(50, 180, 380, 50);

        CampoCodigoConvenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(CampoCodigoConvenio);
        CampoCodigoConvenio.setBounds(50, 260, 380, 50);

        CampoDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(CampoDescricao);
        CampoDescricao.setBounds(50, 340, 380, 50);

        try {
            DataTerminoConv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataTerminoConv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(DataTerminoConv);
        DataTerminoConv.setBounds(220, 430, 130, 50);

        try {
            DataInicioConv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataInicioConv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DataInicioConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataInicioConvActionPerformed(evt);
            }
        });
        getContentPane().add(DataInicioConv);
        DataInicioConv.setBounds(50, 430, 110, 50);

        StatusConv.setBackground(new java.awt.Color(204, 204, 204));
        StatusConv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        StatusConv.setText(" Ativo? Marque para sim");
        getContentPane().add(StatusConv);
        StatusConv.setBounds(50, 540, 230, 50);

        NomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NomeLabel.setForeground(new java.awt.Color(51, 102, 255));
        NomeLabel.setText("Nome do Convênio");
        getContentPane().add(NomeLabel);
        NomeLabel.setBounds(50, 150, 250, 25);

        LabelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelCodigo.setForeground(new java.awt.Color(51, 102, 255));
        LabelCodigo.setText("Código do Convênio");
        getContentPane().add(LabelCodigo);
        LabelCodigo.setBounds(50, 230, 240, 25);

        LabelDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelDesc.setForeground(new java.awt.Color(51, 102, 255));
        LabelDesc.setText("Descrição");
        getContentPane().add(LabelDesc);
        LabelDesc.setBounds(50, 310, 260, 25);

        LabelDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelDataInicio.setForeground(new java.awt.Color(51, 102, 255));
        LabelDataInicio.setText("Data de Início");
        getContentPane().add(LabelDataInicio);
        LabelDataInicio.setBounds(50, 400, 110, 25);

        LabelDataTermino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelDataTermino.setForeground(new java.awt.Color(51, 102, 255));
        LabelDataTermino.setText("Data de Término");
        getContentPane().add(LabelDataTermino);
        LabelDataTermino.setBounds(220, 400, 140, 25);

        LabelStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelStatus.setForeground(new java.awt.Color(51, 102, 255));
        LabelStatus.setText("Status");
        getContentPane().add(LabelStatus);
        LabelStatus.setBounds(50, 510, 49, 25);

        ATUALIZAR.setBackground(new java.awt.Color(153, 204, 255));
        ATUALIZAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ATUALIZAR.setText("ATUALIZAR");
        ATUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATUALIZARActionPerformed(evt);
            }
        });
        getContentPane().add(ATUALIZAR);
        ATUALIZAR.setBounds(50, 630, 160, 60);

        BotãoLimpar.setBackground(new java.awt.Color(255, 102, 102));
        BotãoLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotãoLimpar.setText("LIMPAR");
        BotãoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoLimparActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoLimpar);
        BotãoLimpar.setBounds(220, 630, 160, 60);

        BotãoVoltar.setBackground(new java.awt.Color(255, 153, 153));
        BotãoVoltar.setText("Voltar");
        BotãoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoVoltar);
        BotãoVoltar.setBounds(650, 30, 130, 30);

        AbrirListagem.setBackground(new java.awt.Color(255, 255, 153));
        AbrirListagem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AbrirListagem.setText("LISTAR CONVENIOS");
        AbrirListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirListagemActionPerformed(evt);
            }
        });
        getContentPane().add(AbrirListagem);
        AbrirListagem.setBounds(50, 710, 330, 60);

        jLabel1.setText("ano/mes/dia");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 480, 70, 16);

        jLabel2.setText("ano/mes/dia");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 480, 70, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(-40, 90, 900, 10);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("EDITAR CONVENIOS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 30, 220, 25);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 102, 255));
        jLabel21.setText("Campo com as cores AZUL são obrigatórios.");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(60, 60, 280, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    private void CampoNomeConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeConvenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeConvenioActionPerformed

    private void DataInicioConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataInicioConvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataInicioConvActionPerformed

    private void ATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATUALIZARActionPerformed
       try {
        // Validação de campos obrigatórios
        if (CampoNomeConvenio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Nome do Convênio' é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (CampoCodigoConvenio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Código do Convênio' é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (CampoDescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Descrição' é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (DataInicioConv.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Data de Início' é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (DataTerminoConv.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Data de Término' é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Recupera o ID do convênio (armazenado no campo NomeConvenio como propriedade)
        int id = (int) CampoNomeConvenio.getClientProperty("idConvenio");

        // Atualiza os dados do convênio
        Convenio convenio = new Convenio();
        convenio.setId(id);
        convenio.setNomeConvenio(CampoNomeConvenio.getText());
        convenio.setCodigoConvenio(Integer.parseInt(CampoCodigoConvenio.getText()));
        convenio.setDescricao(CampoDescricao.getText());
        convenio.setDataInicio(java.sql.Date.valueOf(DataInicioConv.getText()));
        convenio.setDataFim(java.sql.Date.valueOf(DataTerminoConv.getText()));
        convenio.setStatus(StatusConv.isSelected());

        // Usar ConvenioDAO para atualizar
        ConvenioDAO convenioDAO = new ConvenioDAO();
        convenioDAO.update(convenio);

        JOptionPane.showMessageDialog(this, "Convênio atualizado com sucesso!");

        // Voltar para a tela de listagem
        ListagemConvenio listagemConvenio = new ListagemConvenio();
        listagemConvenio.setVisible(true);
        this.dispose();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao atualizar o convênio: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_ATUALIZARActionPerformed

    private void BotãoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoLimparActionPerformed
        // TODO add your handling code here:
        // Limpar os campos de texto
        CampoNomeConvenio.setText("");
        CampoCodigoConvenio.setText("");
        CampoDescricao.setText("");
        DataInicioConv.setText("");
        DataTerminoConv.setText("");

        // Desmarcar a caixa de seleção
        StatusConv.setSelected(false);
    }//GEN-LAST:event_BotãoLimparActionPerformed

    private void BotãoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoVoltarActionPerformed
        // TODO add your handling code here:
        TelaLobby telaLobby = new TelaLobby(); // Instancia a próxima tela
        telaLobby.setVisible(true); // Exibe a nova tela
        this.dispose(); // Fecha a tela atual (TelaLogin)
    }//GEN-LAST:event_BotãoVoltarActionPerformed

    private void AbrirListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirListagemActionPerformed
        // TODO add your handling code here:
        ListagemConvenio listagemConvenio = new ListagemConvenio();
        listagemConvenio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_AbrirListagemActionPerformed

    public void preencherCampos(int id, String nomeConvenio, int codigoConvenio, String descricao, String dataInicio, String dataTermino, boolean status) {
    // Preenche os campos da tela EditarConvenio
    CampoNomeConvenio.setText(nomeConvenio);
    CampoCodigoConvenio.setText(String.valueOf(codigoConvenio));
    CampoDescricao.setText(descricao);
    DataInicioConv.setText(dataInicio);
    DataTerminoConv.setText(dataTermino);
    StatusConv.setSelected(status);

    // Armazena o ID do convênio (caso necessário para salvar)
    CampoNomeConvenio.putClientProperty("idConvenio", id);
}

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
            java.util.logging.Logger.getLogger(EditarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarConvenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATUALIZAR;
    private javax.swing.JButton AbrirListagem;
    private javax.swing.JButton BotãoLimpar;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
