/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.administrativo.telas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elias
 */
public class ListagemPerfil extends javax.swing.JFrame {

    /**
     * Creates new form ListagemConvenio
     */
    public ListagemPerfil() {
    initComponents();
    setLocationRelativeTo(null);
    carregarDados(); // Carrega os dados no início
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaP = new javax.swing.JTable();
        BttEditar = new javax.swing.JButton();
        BttSalvar = new javax.swing.JButton();
        BttExcluir = new javax.swing.JButton();
        VoltarListConv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        TabelaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo", "Descriçao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaP);
        if (TabelaP.getColumnModel().getColumnCount() > 0) {
            TabelaP.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 670, 400);

        BttEditar.setText("EDITAR");
        BttEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BttEditar);
        BttEditar.setBounds(50, 540, 135, 45);

        BttSalvar.setText("SALVAR");
        BttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(BttSalvar);
        BttSalvar.setBounds(190, 540, 133, 45);

        BttExcluir.setText("EXCLUIR");
        BttExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BttExcluir);
        BttExcluir.setBounds(330, 540, 135, 46);

        VoltarListConv.setText("Voltar");
        VoltarListConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarListConvActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarListConv);
        VoltarListConv.setBounds(55, 80, 70, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
private void carregarDados() {
    String url = "jdbc:mysql://localhost:3306/gerenciar_perfil";
    String user = "root";
    String password = "root";

    String[] colunas = {"id","nome", "tipo", "descricao" };
    DefaultTableModel tableModel = new DefaultTableModel(colunas, 0);

    String sql = "SELECT id,nome,tipo,descricao FROM perfil";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql)) {

        while (resultSet.next()) {
            Object[] linha = {
                resultSet.getString("nome"),
                resultSet.getString("tipo"),
                resultSet.getString("descricao"),
            
            };
            tableModel.addRow(linha);
        }

        TabelaP.setModel(tableModel);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar os dados: " + e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

    
    private void BttEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttEditarActionPerformed
     // Obter a linha selecionada
    int selectedRow = TabelaP.getSelectedRow();

    if (selectedRow != -1) { // Verifica se uma linha foi selecionada
        // Permite edição diretamente na linha selecionada
        TabelaP.editCellAt(selectedRow, 0);
        TabelaP.editCellAt(selectedRow, 1);
        TabelaP.editCellAt(selectedRow, 2);
        TabelaP.editCellAt(selectedRow, 3);

        JOptionPane.showMessageDialog(this, "Você pode editar diretamente na tabela."
                + " Clique em SALVAR para confirmar as alterações.");
    } else {
        JOptionPane.showMessageDialog(this, "Selecione uma linha para editar.",
                "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BttEditarActionPerformed

    private void VoltarListConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarListConvActionPerformed
        // TODO add your handling code here:
        TelaLobby telaLobby = new TelaLobby(); // Instancia a próxima tela
        telaLobby.setVisible(true); // Exibe a nova tela
        this.dispose(); // Fecha a tela atual (TelaLogin)
    }//GEN-LAST:event_VoltarListConvActionPerformed

    private void BttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttSalvarActionPerformed
 // Obter a linha selecionada
    int selectedRow = TabelaP.getSelectedRow(); 

    if (selectedRow != -1) { // Verifica se uma linha foi selecionada
    // Obter a linha selecionada

    if (selectedRow != -1) { // Verifica se uma linha foi selecionada
        try {
            // Obter os valores da linha selecionada
            int id = Integer.parseInt(TabelaP.getValueAt(selectedRow, 0).toString());
            String nome = TabelaP.getValueAt(selectedRow, 1).toString();
            String tipo = TabelaP.getValueAt(selectedRow, 2).toString();
            String descricao = TabelaP.getValueAt(selectedRow, 3).toString();
          

            // Configuração do banco de dados
            String url = "jdbc:mysql://localhost:3306/gerenciar_perfil";
            String user = "root";
            String password = "root";

            // SQL para atualizar o registro no banco
            String sql = "UPDATE Perfil SET nome = ?, "
                    + "tipo = ?, descricao = ?,"
                    + " WHERE id = ?";

            try (Connection connection = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = connection.prepareStatement(sql)) {

                // Configurar os parâmetros no PreparedStatement
                stmt.setString(1, nome);
                stmt.setString(2, tipo);
                stmt.setString(3, descricao);
          
   
                // Executar a atualização
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Registro atualizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Nenhuma alteração foi feita.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar o banco de dados: " + e.getMessage(),
                                          "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao processar os dados: " + e.getMessage(),
                                          "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, 
                "Selecione uma linha para salvar as alterações.",
                "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_BttSalvarActionPerformed

    private void BttExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttExcluirActionPerformed
        // TODO add your handling code here:
            int selectedRow = TabelaP.getSelectedRow();
            if (selectedRow != -1) { // Verifica se uma linha foi selecionada
        // Obter o código do convênio (chave única)
        int codigoConvenio = Integer.parseInt(TabelaP.getValueAt(selectedRow, 1).toString());

        // Exibir mensagem de confirmação
        int confirm = JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir este Perfil?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Configuração do banco de dados
            String url = "jdbc:mysql://localhost:3306/gerenciar_perfil";
            String user = "root";
            String password = "root";

            // SQL para excluir o registro no banco
            String sql = "DELETE FROM perfil WHERE id = ?";

            try (Connection connection = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = connection.prepareStatement(sql)) {

                // Configurar o código do convênio no PreparedStatement
                stmt.setInt(1, codigoConvenio);

                // Executar a exclusão
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "perfil excluído com sucesso!");

                    // Remover a linha da tabela na interface
                    ((DefaultTableModel) TabelaP.getModel()).removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível excluir o perfil.",
                                                  "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir do banco de dados: "+ e.getMessage(),
                                              "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_BttExcluirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListagemPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttEditar;
    private javax.swing.JButton BttExcluir;
    private javax.swing.JButton BttSalvar;
    private javax.swing.JTable TabelaP;
    private javax.swing.JButton VoltarListConv;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
