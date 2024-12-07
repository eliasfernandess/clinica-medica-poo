/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.administrativo.telas;

import javax.swing.JOptionPane;

/**
 *
 * @author elias
 */
public class ListagemConvenio extends javax.swing.JFrame {

    /**
     * Creates new form ListagemConvenio
     */
    public ListagemConvenio() {
        initComponents();
        setLocationRelativeTo(null);
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
        TabelaListConv = new javax.swing.JTable();
        BttEditar = new javax.swing.JButton();
        BttSalvar = new javax.swing.JButton();
        BttExcluir = new javax.swing.JButton();
        VoltarListConv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(522, 700));
        setPreferredSize(new java.awt.Dimension(522, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        TabelaListConv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Convênio", "Status", "Data Cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaListConv);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(52, 114, 415, 402);

        BttEditar.setText("EDITAR");
        BttEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BttEditar);
        BttEditar.setBounds(52, 559, 135, 45);

        BttSalvar.setText("SALVAR");
        BttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(BttSalvar);
        BttSalvar.setBounds(193, 559, 133, 45);

        BttExcluir.setText("EXCLUIR");
        getContentPane().add(BttExcluir);
        BttExcluir.setBounds(332, 559, 135, 46);

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

    private void BttEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttEditarActionPerformed
        // TODO add your handling code here:
     int selectedRow = TabelaListConv.getSelectedRow(); 

    if (selectedRow != -1) { // Verifica se uma linha foi selecionada
        // Permite edição diretamente nas células da linha selecionada
        TabelaListConv.editCellAt(selectedRow, 0); // Permite edição na coluna "Convênio"
        TabelaListConv.editCellAt(selectedRow, 1); // Permite edição na coluna "Status"
        TabelaListConv.editCellAt(selectedRow, 2); // Permite edição na coluna "Data Cadastro"
    } else {
        // Exibe uma mensagem de aviso caso nenhuma linha tenha sido selecionada
        JOptionPane.showMessageDialog(this, "Selecione uma linha para editar!", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_BttEditarActionPerformed

    private void VoltarListConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarListConvActionPerformed
        // TODO add your handling code here:
        TelaLobby telaLobby = new TelaLobby(); // Instancia a próxima tela
        telaLobby.setVisible(true); // Exibe a nova tela
        this.dispose(); // Fecha a tela atual (TelaLogin)
    }//GEN-LAST:event_VoltarListConvActionPerformed

    private void BttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttSalvarActionPerformed
        // TODO add your handling code here:
    int selectedRow = TabelaListConv.getSelectedRow(); // Obtém a linha selecionada

    if (selectedRow != -1) {
        // Pega os valores editados da tabela
        String convenio = TabelaListConv.getValueAt(selectedRow, 0).toString();
        String status = TabelaListConv.getValueAt(selectedRow, 1).toString();
        String dataCadastro = TabelaListConv.getValueAt(selectedRow, 2).toString();

        // Salva as alterações (lógica personalizada)
        System.out.println("Alterações Salvas:");
        System.out.println("Convênio: " + convenio);
        System.out.println("Status: " + status);
        System.out.println("Data Cadastro: " + dataCadastro);
        
        JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
    } else {
        JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada!");
    }
    }//GEN-LAST:event_BttSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(ListagemConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemConvenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttEditar;
    private javax.swing.JButton BttExcluir;
    private javax.swing.JButton BttSalvar;
    private javax.swing.JTable TabelaListConv;
    private javax.swing.JButton VoltarListConv;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
