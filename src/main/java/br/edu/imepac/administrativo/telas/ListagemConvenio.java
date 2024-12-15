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
        BttExcluir = new javax.swing.JButton();
        VoltarListConv = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(936, 700));
        setMinimumSize(new java.awt.Dimension(936, 700));
        setPreferredSize(new java.awt.Dimension(936, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        TabelaListConv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jScrollPane1.setBounds(40, 110, 850, 402);

        BttEditar.setBackground(new java.awt.Color(255, 255, 153));
        BttEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BttEditar.setText("EDITAR");
        BttEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BttEditar);
        BttEditar.setBounds(40, 560, 135, 60);

        BttExcluir.setBackground(new java.awt.Color(255, 153, 153));
        BttExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BttExcluir.setText("EXCLUIR");
        BttExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BttExcluir);
        BttExcluir.setBounds(190, 560, 135, 60);

        VoltarListConv.setBackground(new java.awt.Color(255, 153, 153));
        VoltarListConv.setText("Voltar");
        VoltarListConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarListConvActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarListConv);
        VoltarListConv.setBounds(800, 30, 90, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 940, 3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("LISTAGEM CONVENIOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 30, 270, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("DICA: Para editar algo você precisa clicar na linha escolhida e clicar no botão de Editar.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 530, 700, 20);

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
        try {
            // Captura os dados da linha selecionada
            int id = (int) TabelaListConv.getValueAt(selectedRow, 0);
            String nomeConvenio = TabelaListConv.getValueAt(selectedRow, 1).toString();
            int codigoConvenio = Integer.parseInt(TabelaListConv.getValueAt(selectedRow, 2).toString());
            String descricao = TabelaListConv.getValueAt(selectedRow, 3).toString();
            String dataInicio = TabelaListConv.getValueAt(selectedRow, 4).toString();
            String dataTermino = TabelaListConv.getValueAt(selectedRow, 5).toString();
            boolean status = Boolean.parseBoolean(TabelaListConv.getValueAt(selectedRow, 6).toString());

            // Cria uma instância da tela EditarConvenio e preenche os campos
            EditarConvenio editarConvenio = new EditarConvenio();
            editarConvenio.preencherCampos(id, nomeConvenio, codigoConvenio, descricao, dataInicio, dataTermino, status);

            // Exibe a nova tela
            editarConvenio.setVisible(true);
            this.dispose(); // Fecha a tela atual
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados para edição: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
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
    private javax.swing.JTable TabelaListConv;
    private javax.swing.JButton VoltarListConv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

  
}
