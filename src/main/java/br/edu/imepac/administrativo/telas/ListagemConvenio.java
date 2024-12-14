package br.edu.imepac.administrativo.telas;

import br.edu.imepac.administrativo.daos.ConvenioDAO;
import br.edu.imepac.administrativo.entidades.Convenio;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListagemConvenio extends javax.swing.JFrame {

    private final ConvenioDAO convenioDAO = new ConvenioDAO(); // Correção no nome da DAO

    /**
     * Creates new form ListagemConvenio
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
        setMaximumSize(new java.awt.Dimension(779, 700));
        setPreferredSize(new java.awt.Dimension(779, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        TabelaListConv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Convenio", "Código convenio", "Descrição", "Data Ínicio", "Data Termino", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane1.setBounds(52, 114, 670, 402);

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

    public ListagemConvenio() {
    initComponents(); // Método gerado automaticamente
    setLocationRelativeTo(null); // Centraliza a janela
    configurarTabela(); // Configuração adicional
    carregarDados(); // Carrega os dados no início
}
    
    private void configurarTabela() {
    DefaultTableModel tableModel = new DefaultTableModel(
        new Object[][]{},
        new String[]{
            "ID", "Nome Convênio", "Código Convênio", "Descrição", "Data Início", "Data Término", "Status"
        }
    ) {
        Class[] types = new Class[]{
            Integer.class, String.class, Integer.class, String.class, String.class, String.class, Boolean.class
        };

        boolean[] canEdit = new boolean[]{
            false, true, true, true, true, true, true
        };

        @Override
        public Class getColumnClass(int columnIndex) {
            return types[columnIndex];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

    TabelaListConv.setModel(tableModel);
    TabelaListConv.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    TabelaListConv.setFillsViewportHeight(true);
    
    getContentPane().revalidate();
    getContentPane().repaint();
    
}


  private void carregarDados() {
        DefaultTableModel tableModel = (DefaultTableModel) TabelaListConv.getModel();
        tableModel.setRowCount(0); // Limpar a tabela antes de carregar novos dados

        try {
            List<Convenio> convenios = convenioDAO.readAll(); // Uso do ConvenioDAO para carregar os dados
            for (Convenio convenio : convenios) {
                Object[] linha = {
                    convenio.getId(),
                    convenio.getNomeConvenio(),
                    convenio.getCodigoConvenio(),
                    convenio.getDescricao(),
                    convenio.getDataInicio().toString(),
                    convenio.getDataFim().toString(),
                    convenio.isStatus()
                };
                tableModel.addRow(linha);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar os dados: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private void BttEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttEditarActionPerformed
    int selectedRow = TabelaListConv.getSelectedRow();
        if (selectedRow != -1) {
            JOptionPane.showMessageDialog(this, "Você pode editar diretamente na tabela. Clique em 'Salvar' para confirmar as alterações.");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para editar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BttEditarActionPerformed

    private void VoltarListConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarListConvActionPerformed
        // TODO add your handling code here:
        TelaLobby telaLobby = new TelaLobby(); // Instancia a próxima tela
        telaLobby.setVisible(true); // Exibe a nova tela
        this.dispose(); // Fecha a tela atual (TelaLogin)
    }//GEN-LAST:event_VoltarListConvActionPerformed

    private void BttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttSalvarActionPerformed
  int selectedRow = TabelaListConv.getSelectedRow();
        if (selectedRow != -1) {
            try {
                int id = (int) TabelaListConv.getValueAt(selectedRow, 0);
                String nomeConvenio = TabelaListConv.getValueAt(selectedRow, 1).toString();
                int codigoConvenio = Integer.parseInt(TabelaListConv.getValueAt(selectedRow, 2).toString());
                String descricao = TabelaListConv.getValueAt(selectedRow, 3).toString();
                java.sql.Date dataInicio = java.sql.Date.valueOf(TabelaListConv.getValueAt(selectedRow, 4).toString());
                java.sql.Date dataTermino = java.sql.Date.valueOf(TabelaListConv.getValueAt(selectedRow, 5).toString());
                boolean status = Boolean.parseBoolean(TabelaListConv.getValueAt(selectedRow, 6).toString());

                Convenio convenio = new Convenio(id, nomeConvenio, codigoConvenio, descricao, dataInicio, dataTermino, status);
                convenioDAO.update(convenio); // Uso do ConvenioDAO para atualizar

                JOptionPane.showMessageDialog(this, "Convênio atualizado com sucesso!");
                carregarDados();
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar no banco de dados: " + e.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para salvar as alterações.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BttSalvarActionPerformed

    private void BttExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttExcluirActionPerformed
     int selectedRow = TabelaListConv.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este convênio?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    int id = (int) TabelaListConv.getValueAt(selectedRow, 0);
                    convenioDAO.delete(id); // Uso do ConvenioDAO para excluir

                    ((DefaultTableModel) TabelaListConv.getModel()).removeRow(selectedRow);
                    JOptionPane.showMessageDialog(this, "Convênio excluído com sucesso!");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir do banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
        java.awt.EventQueue.invokeLater(() -> new ListagemConvenio().setVisible(true));
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
