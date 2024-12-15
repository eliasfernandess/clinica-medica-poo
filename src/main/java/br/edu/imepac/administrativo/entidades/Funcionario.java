package br.edu.imepac.administrativo.entidades;

import java.time.LocalDate;

public class Funcionario {

    private Long id;
    private String usuario;
    private int senha;
    private String nome;
    private int idade;
    private char sexo;
    private String cpf;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String contato;
    private String email;
    private LocalDate dataNascimento;

    private String tipoFuncionario;

    private Long especialidadeId;
    private Especialidade especialidade;

    private Long perfilId;
    private Perfil perfil;

    public Funcionario(long aLong, String text, int senha1, String text1, int idade1, char charAt, String text2, String text3, String text4, String text5, String text6, String text7, String toString, String text8, String text9, LocalDate dataNascimento1, String toString1, Integer perfilId1, Integer object1) {
    }

    public Funcionario(Long id, String usuario, int senha, String nome, int idade, char sexo, String cpf, String rua, String numero, String complemento, String bairro, String cidade, String estado, String contato, String email, LocalDate dataNascimento, String tipoFuncionario, Long especialidadeId, Long perfilId) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.contato = contato;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.tipoFuncionario = tipoFuncionario;
        this.especialidadeId = especialidadeId;
        this.perfilId = perfilId;
    }

    public Funcionario(String usuario, int senha, String nome, int idade, char sexo, String cpf, String rua, String numero, String complemento, String bairro, String cidade, String estado, String contato, String email, LocalDate dataNascimento, String tipoFuncionario, Long especialidadeId, Long perfilId) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.contato = contato;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.tipoFuncionario = tipoFuncionario;
        this.especialidadeId = especialidadeId;
        this.perfilId = perfilId;
    }

    public Funcionario(String text, int senha, String text0, int idade, char charAt, String text1, String text2, String text3, String text4, String text5, String text6, String toString, String text7, String text8, LocalDate dataNascimento, String toString0, int especialidadeId, int perfilId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getEspecialidadeId() {
        return especialidadeId;
    }

    public void setEspecialidadeId(Long especialidadeId) {
        this.especialidadeId = especialidadeId;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Long getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(Long perfilId) {
        this.perfilId = perfilId;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}
