package br.edu.imepac.administrativo.entidades;

import java.util.Date;

public class Paciente {

    private int id;
    private String nome;
    private Date nascimento;
    private String sexo;
    private String cpf;
    private String cep;
    private String uf;
    private String cidade;
 
    

    // ======================================

    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }

    // ======================================

    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }

    // ======================================

    // ======================================

    public String getuf() {
        return uf;
    }
    public void setuf(String uf){
        this.uf = uf;
    }

    // ======================================

    public Date getnascimento() {
        return nascimento;
    }
    public void setnascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    // ======================================

    public String getsexo() {
        return sexo;
    }
    public void setsexo(String sexo) {
        this.sexo = sexo;
    }
 // ======================================
     public String getcpf() {
        return cpf;
    }
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
     // ======================================
     public String getcep() {
        return cep;
    }
    public void setcep(String cep) {
        this.cep = cep;
    }
     // ======================================
      public String getcidade() {
        return cidade;
    }
    public void setcidade(String cidade) {
        this.cidade = cidade;
           
    // ======================================

    // ======================================   

    }    
  
}
