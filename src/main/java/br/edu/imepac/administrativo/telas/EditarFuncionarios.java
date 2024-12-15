/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.administrativo.telas;

import br.edu.imepac.administrativo.daos.FuncionarioDAO;
import br.edu.imepac.administrativo.entidades.Especialidade;
import br.edu.imepac.administrativo.entidades.Funcionario;
import br.edu.imepac.administrativo.entidades.Perfil;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author elias
 */
public class EditarFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form EditarFuncionarios
     */
    public EditarFuncionarios() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        senhaTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        especialidadeLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        nomeCompletoTextfield = new javax.swing.JTextField();
        complementoTextField = new javax.swing.JTextField();
        cidadeTextField = new javax.swing.JTextField();
        numeroTextField = new javax.swing.JTextField();
        bairroTextField = new javax.swing.JTextField();
        logradouroTextField = new javax.swing.JTextField();
        usuarioTextField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        CancelarBotao = new javax.swing.JButton();
        AttBotão = new javax.swing.JButton();
        LimparBotao = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        dataNascimentoTextField = new javax.swing.JFormattedTextField();
        idadeTextField = new javax.swing.JFormattedTextField();
        sexoTextField = new javax.swing.JComboBox<>();
        tipoFuncionarioField = new javax.swing.JComboBox<>();
        estadoTextField1 = new javax.swing.JComboBox<>();
        especialidadeField = new javax.swing.JComboBox<>();
        perfilField = new javax.swing.JComboBox<>();
        identificacaoTextField = new javax.swing.JFormattedTextField();
        contatoTextField = new javax.swing.JFormattedTextField();
        BotãoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1278, 932));
        setMinimumSize(new java.awt.Dimension(1278, 932));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ENDEREÇO RESIDENCIAL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 380, 220, 25);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(-10, 640, 1250, 10);

        senhaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaTextField);
        senhaTextField.setBounds(140, 830, 390, 50);

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailTextField);
        emailTextField.setBounds(140, 280, 520, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("TIPO DE FUNCIONARIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(720, 100, 150, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("NOME COMPLETO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 100, 118, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("DOCUMENTO IDENTIFICAÇÃO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 180, 200, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("E-MAIL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 260, 50, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("DATA DE NASCIMENTO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(720, 180, 150, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("IDADE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(980, 180, 50, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("TELEFONE PARA CONTATO");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(720, 260, 180, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("SEXO");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 180, 33, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("ATUALIZAR FUNCIONARIOS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(140, 20, 250, 25);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Rua");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 440, 40, 25);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Número");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(700, 440, 65, 25);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Complemento");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(140, 530, 114, 25);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Bairro");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(660, 530, 46, 25);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Cidade");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(400, 530, 55, 25);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Estado");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(920, 530, 54, 25);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("DADOS DE AUTENTICAÇÃO");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(140, 660, 236, 25);

        especialidadeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        especialidadeLabel.setForeground(new java.awt.Color(0, 102, 255));
        especialidadeLabel.setText("Especialidade");
        getContentPane().add(especialidadeLabel);
        especialidadeLabel.setBounds(580, 800, 120, 25);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 255));
        jLabel18.setText("Perfil");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(580, 710, 60, 25);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 255));
        jLabel19.setText("Senha[números]");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(140, 800, 170, 25);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 255));
        jLabel20.setText("Usuário");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(140, 710, 70, 25);

        nomeCompletoTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCompletoTextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomeCompletoTextfield);
        nomeCompletoTextfield.setBounds(140, 120, 520, 50);

        complementoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(complementoTextField);
        complementoTextField.setBounds(140, 560, 236, 50);

        cidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(cidadeTextField);
        cidadeTextField.setBounds(400, 560, 236, 50);

        numeroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(numeroTextField);
        numeroTextField.setBounds(700, 470, 90, 50);

        bairroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(bairroTextField);
        bairroTextField.setBounds(660, 560, 236, 50);

        logradouroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logradouroTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(logradouroTextField);
        logradouroTextField.setBounds(140, 470, 520, 50);

        usuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioTextField);
        usuarioTextField.setBounds(140, 740, 390, 50);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 80, 1250, 10);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 102, 255));
        jLabel21.setText("Campo com as cores AZUL são obrigatórios.");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(140, 50, 280, 20);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 360, 1250, 3);

        CancelarBotao.setBackground(new java.awt.Color(255, 102, 102));
        CancelarBotao.setText("CANCELAR/SAIR");
        CancelarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(CancelarBotao);
        CancelarBotao.setBounds(1020, 850, 160, 60);

        AttBotão.setBackground(new java.awt.Color(153, 204, 255));
        AttBotão.setText("ATUALIZAR");
        AttBotão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttBotãoActionPerformed(evt);
            }
        });
        getContentPane().add(AttBotão);
        AttBotão.setBounds(1020, 690, 160, 60);

        LimparBotao.setBackground(new java.awt.Color(255, 255, 153));
        LimparBotao.setText("LIMPAR CAMPOS");
        LimparBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(LimparBotao);
        LimparBotao.setBounds(1020, 770, 160, 60);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(950, 650, 10, 280);

        try {
            dataNascimentoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataNascimentoTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dataNascimentoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataNascimentoTextFieldFocusLost(evt);
            }
        });
        dataNascimentoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascimentoTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dataNascimentoTextField);
        dataNascimentoTextField.setBounds(720, 200, 225, 52);

        idadeTextField.setEnabled(false);
        idadeTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idadeTextField);
        idadeTextField.setBounds(980, 200, 73, 52);

        sexoTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sexoTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        sexoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(sexoTextField);
        sexoTextField.setBounds(480, 200, 178, 50);

        tipoFuncionarioField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoFuncionarioField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MÉDICO", "ATENDENTE" }));
        tipoFuncionarioField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoFuncionarioFieldstateChanged(evt);
            }
        });
        tipoFuncionarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoFuncionarioFieldActionPerformed(evt);
            }
        });
        getContentPane().add(tipoFuncionarioField);
        tipoFuncionarioField.setBounds(720, 120, 280, 50);

        estadoTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estadoTextField1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        getContentPane().add(estadoTextField1);
        estadoTextField1.setBounds(920, 560, 230, 50);

        especialidadeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        especialidadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(especialidadeField);
        especialidadeField.setBounds(580, 830, 310, 50);

        perfilField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        perfilField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilFieldActionPerformed(evt);
            }
        });
        getContentPane().add(perfilField);
        perfilField.setBounds(580, 740, 310, 50);

        try {
            identificacaoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        identificacaoTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(identificacaoTextField);
        identificacaoTextField.setBounds(140, 200, 240, 52);

        try {
            contatoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        contatoTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(contatoTextField);
        contatoTextField.setBounds(720, 280, 320, 52);

        BotãoVoltar.setBackground(new java.awt.Color(255, 153, 153));
        BotãoVoltar.setText("Voltar");
        BotãoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoVoltar);
        BotãoVoltar.setBounds(1050, 20, 170, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Funcionario funcionarioAtual;
    
    public void preencherDados(Funcionario funcionario) {
    this.funcionarioAtual = funcionario; // Armazena o objeto atual para edição
    usuarioTextField.setText(funcionario.getUsuario());
    senhaTextField.setText(String.valueOf(funcionario.getSenha()));
    nomeCompletoTextfield.setText(funcionario.getNome());
    idadeTextField.setText(String.valueOf(funcionario.getIdade()));
    sexoTextField.setSelectedItem(funcionario.getSexo() == 'M' ? "Masculino" : "Feminino");
    identificacaoTextField.setText(funcionario.getCpf());
    logradouroTextField.setText(funcionario.getRua());
    numeroTextField.setText(funcionario.getNumero());
    complementoTextField.setText(funcionario.getComplemento());
    bairroTextField.setText(funcionario.getBairro());
    cidadeTextField.setText(funcionario.getCidade());
    estadoTextField1.setSelectedItem(funcionario.getEstado());
    contatoTextField.setText(funcionario.getContato());
    emailTextField.setText(funcionario.getEmail());
    dataNascimentoTextField.setText(funcionario.getDataNascimento().toString());
    tipoFuncionarioField.setSelectedItem(funcionario.getTipoFuncionario());
    perfilField.setSelectedItem(funcionario.getPerfil());
    especialidadeField.setSelectedItem(funcionario.getEspecialidade());
}




    
    private void senhaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void nomeCompletoTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCompletoTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCompletoTextfieldActionPerformed

    private void complementoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoTextFieldActionPerformed

    private void cidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeTextFieldActionPerformed

    private void numeroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTextFieldActionPerformed

    private void bairroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTextFieldActionPerformed

    private void logradouroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logradouroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logradouroTextFieldActionPerformed

    private void usuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextFieldActionPerformed

    private void CancelarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBotaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarBotaoActionPerformed

    @SuppressWarnings("empty-statement")
    private void AttBotãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttBotãoActionPerformed
      if (camposValidos()) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoTextField.getText(), formatter);

            // Atualiza os dados no objeto funcionarioAtual
            funcionarioAtual.setUsuario(usuarioTextField.getText());
            funcionarioAtual.setSenha(Integer.parseInt(senhaTextField.getText()));
            funcionarioAtual.setNome(nomeCompletoTextfield.getText());
            funcionarioAtual.setIdade(Integer.parseInt(idadeTextField.getText()));
            funcionarioAtual.setSexo(sexoTextField.getSelectedItem().toString().charAt(0));
            funcionarioAtual.setCpf(identificacaoTextField.getText());
            funcionarioAtual.setRua(logradouroTextField.getText());
            funcionarioAtual.setNumero(numeroTextField.getText());
            funcionarioAtual.setComplemento(complementoTextField.getText());
            funcionarioAtual.setBairro(bairroTextField.getText());
            funcionarioAtual.setCidade(cidadeTextField.getText());
            funcionarioAtual.setEstado(estadoTextField1.getSelectedItem().toString());
            funcionarioAtual.setContato(contatoTextField.getText());
            funcionarioAtual.setEmail(emailTextField.getText());
            funcionarioAtual.setDataNascimento(dataNascimento);
            funcionarioAtual.setTipoFuncionario(tipoFuncionarioField.getSelectedItem().toString());
            funcionarioAtual.setEspecialidadeId(((Especialidade) especialidadeField.getSelectedItem()).getId());
            funcionarioAtual.setPerfilId(((Perfil) perfilField.getSelectedItem()).getId());

            // Chama o método update da DAO
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            funcionarioDAO.update(funcionarioAtual);

            JOptionPane.showMessageDialog(this, "Funcionário atualizado com sucesso!");
            ListagemFuncionarios listagemFuncionarios = new ListagemFuncionarios();
            listagemFuncionarios.setVisible(true);
            this.dispose();

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar funcionário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_AttBotãoActionPerformed

    private void dataNascimentoTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataNascimentoTextFieldFocusLost
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoTextField.getText(), formatter);

        LocalDate currentDate = LocalDate.now();
        idadeTextField.setText(String.valueOf(Period.between(dataNascimento, currentDate).getYears()));
    }//GEN-LAST:event_dataNascimentoTextFieldFocusLost

    private void dataNascimentoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascimentoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascimentoTextFieldActionPerformed

    private void idadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeTextFieldActionPerformed

    private void sexoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoTextFieldActionPerformed

    private void tipoFuncionarioFieldstateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoFuncionarioFieldstateChanged
        if (tipoFuncionarioField.getSelectedItem().toString().equalsIgnoreCase("ATENDENTE")) {
            especialidadeLabel.setVisible(false);
            especialidadeField.setVisible(false);
        } else {
            especialidadeLabel.setVisible(true);
            especialidadeField.setVisible(true);
        }
    }//GEN-LAST:event_tipoFuncionarioFieldstateChanged

    private void tipoFuncionarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoFuncionarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoFuncionarioFieldActionPerformed

    private void especialidadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadeFieldActionPerformed

    private void perfilFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perfilFieldActionPerformed

    private void BotãoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoVoltarActionPerformed
        // TODO add your handling code here:
        TelaLobby telaLobby = new TelaLobby(); // Instancia a próxima tela
        telaLobby.setVisible(true); // Exibe a nova tela
        this.dispose(); // Fecha a tela atual (TelaLogin)

    }//GEN-LAST:event_BotãoVoltarActionPerformed

    private void limparCampos() {
    usuarioTextField.setText("");
    senhaTextField.setText("");
    nomeCompletoTextfield.setText("");
    idadeTextField.setText("");
    sexoTextField.setSelectedIndex(0);
    identificacaoTextField.setText("");
    logradouroTextField.setText("");
    numeroTextField.setText("");
    complementoTextField.setText("");
    bairroTextField.setText("");
    cidadeTextField.setText("");
    estadoTextField1.setSelectedIndex(0);
    contatoTextField.setText("");
    emailTextField.setText("");
    dataNascimentoTextField.setText("");
    tipoFuncionarioField.setSelectedIndex(0);
    perfilField.setSelectedIndex(0);
    especialidadeField.setSelectedIndex(0);
}
    
    private void LimparBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparBotaoActionPerformed
      limparCampos();
    }//GEN-LAST:event_LimparBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttBotão;
    private javax.swing.JButton BotãoVoltar;
    private javax.swing.JButton CancelarBotao;
    private javax.swing.JButton LimparBotao;
    private javax.swing.JTextField bairroTextField;
    private javax.swing.JTextField cidadeTextField;
    private javax.swing.JTextField complementoTextField;
    private javax.swing.JFormattedTextField contatoTextField;
    private javax.swing.JFormattedTextField dataNascimentoTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<Especialidade> especialidadeField;
    private javax.swing.JLabel especialidadeLabel;
    private javax.swing.JComboBox<String> estadoTextField1;
    private javax.swing.JFormattedTextField idadeTextField;
    private javax.swing.JFormattedTextField identificacaoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField logradouroTextField;
    private javax.swing.JTextField nomeCompletoTextfield;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JComboBox<Perfil> perfilField;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JComboBox<String> sexoTextField;
    private javax.swing.JComboBox<String> tipoFuncionarioField;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables

    private boolean camposValidos() {
    if (usuarioTextField.getText().isEmpty() ||
        senhaTextField.getText().isEmpty() ||
        nomeCompletoTextfield.getText().isEmpty() ||
        identificacaoTextField.getText().isEmpty() ||
        emailTextField.getText().isEmpty() ||
        dataNascimentoTextField.getText().isEmpty() ||
        logradouroTextField.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios!", "Aviso", JOptionPane.WARNING_MESSAGE);
        return false;
    }
    return true;
    }
}
