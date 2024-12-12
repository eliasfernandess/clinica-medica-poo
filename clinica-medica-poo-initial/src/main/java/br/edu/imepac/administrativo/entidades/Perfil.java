package br.edu.imepac.administrativo.entidades;

public class Perfil {



    private int id;
    private String cpf;
    private String nome;
    private String descricao;
    private String tipo;


    public Perfil() {
    }


    public Perfil(String cpf, String nome, String descricao, String tipo) {
        this.cpf = cpf;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(int id) {this.id = id;}

    public int getId() {return id;}
}
