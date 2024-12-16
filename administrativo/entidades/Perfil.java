package br.edu.imepac.administrativo.entidades;

import java.util.Date;

public class Perfil {

    private int id;
    private String nome;
    //private String descricao;
    private String tipo;
 

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

  //  public String getdescricao() {
  //      return descricao;
  //  }
  //  public void setdescricao(String descricao){
  //      this.descricao = descricao;
   // }

    // ======================================


    // ======================================

    public String gettipo() {
        return tipo;
    }
    public void settipo(String tipo) {
        this.tipo = tipo;
    }
 // ======================================
   
  

    }    
  
