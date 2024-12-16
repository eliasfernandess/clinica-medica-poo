/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.administrativo.telas;

import br.edu.imepac.administrativo.daos.EspecialidadeDAO;
import br.edu.imepac.administrativo.entidades.Especialidade;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author elias
 */
public class EditarEspecialidades extends javax.swing.JFrame {

    private Especialidade especialidadeAtual;

    /**
     * Construtor padrão (usado em outros cenários, se necessário)
     */
    public EditarEspecialidades() {
        initComponents();
    }

    /**
     * Construtor que recebe a especialidade a ser editada
     * 
     * @param especialidade Instância de Especialidade com os dados para edição
     */
    public EditarEspecialidades(Especialidade especialidade) {
        initComponents();
        this.especialidadeAtual = especialidade;
        preencherDados(especialidade);
    }

    private void preencherDados(Especialidade especialidade) {
        if (especialidade != null) {
            nomeField.setText(especialidade.getNome());
            descricaoField.setText(especialidade.getDescricao());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nomeField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoField = new javax.swing.JTextArea();
        cancelarButton = new javax.swing.JButton();
        AtualizarBtt = new javax.swing.JButton();
        limparBotton = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        BotãoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1057, 399));
        setMinimumSize(new java.awt.Dimension(1057, 399));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("Atualizar Especialidades");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 283, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(6, 76, 1283, 3);

        nomeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(nomeField);
        nomeField.setBounds(40, 130, 520, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Descrição");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 190, 76, 25);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 255));
        jLabel21.setText("Nome");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(40, 100, 60, 25);

        descricaoField.setColumns(20);
        descricaoField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descricaoField.setRows(5);
        jScrollPane1.setViewportView(descricaoField);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 220, 520, 100);

        cancelarButton.setBackground(new java.awt.Color(255, 102, 102));
        cancelarButton.setText("CANCELAR");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarButton);
        cancelarButton.setBounds(610, 270, 240, 50);

        AtualizarBtt.setBackground(new java.awt.Color(153, 204, 255));
        AtualizarBtt.setText("ATUALIZAR DADOS");
        AtualizarBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarBttActionPerformed(evt);
            }
        });
        getContentPane().add(AtualizarBtt);
        AtualizarBtt.setBounds(610, 130, 240, 50);

        limparBotton.setBackground(new java.awt.Color(255, 255, 153));
        limparBotton.setText("LIMPAR CAMPOS");
        limparBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBottonActionPerformed(evt);
            }
        });
        getContentPane().add(limparBotton);
        limparBotton.setBounds(610, 200, 240, 50);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 102, 255));
        jLabel22.setText("Campo com as cores AZUL são obrigatórios.");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(130, 50, 280, 20);

        BotãoVoltar.setBackground(new java.awt.Color(255, 153, 153));
        BotãoVoltar.setText("Voltar");
        BotãoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoVoltar);
        BotãoVoltar.setBounds(880, 20, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
       int confirm = JOptionPane.showConfirmDialog(this, "Deseja cancelar as alterações?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Retorna para a tela de listagem
            ListagemEspecialidade listagemEspecialidade = new ListagemEspecialidade();
            listagemEspecialidade.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void AtualizarBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBttActionPerformed
       if (nomeField.getText().isEmpty() || descricaoField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Atualiza os dados da especialidade
            especialidadeAtual.setNome(nomeField.getText());
            especialidadeAtual.setDescricao(descricaoField.getText());

            EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
            especialidadeDAO.update(especialidadeAtual);

            JOptionPane.showMessageDialog(this, "Especialidade atualizada com sucesso!");
            
            // Retorna para a listagem de especialidades
            ListagemEspecialidade listagemEspecialidade = new ListagemEspecialidade();
            listagemEspecialidade.setVisible(true);
            this.dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar especialidade: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AtualizarBttActionPerformed

    private void limparBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBottonActionPerformed
        nomeField.setText("");
        descricaoField.setText("");
    }//GEN-LAST:event_limparBottonActionPerformed

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
            java.util.logging.Logger.getLogger(EditarEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EditarEspecialidades().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarBtt;
    private javax.swing.JButton BotãoVoltar;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextArea descricaoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton limparBotton;
    private javax.swing.JTextField nomeField;
    // End of variables declaration//GEN-END:variables
}
