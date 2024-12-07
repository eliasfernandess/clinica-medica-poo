package br.edu.imepac.administrativo.entidades;

import java.util.Date;

public class Convenio {

    private int id;
    private String nomeConvenio;
    private int codigoConvenio;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private boolean status;

    // ======================================

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    // ======================================

    public String getNomeConvenio(){
        return nomeConvenio;
    }
    public void setNomeConvenio(String nomeConvenio){
        this.nomeConvenio = nomeConvenio;
    }

    // ======================================

    public int getCodigoConvenio(){
        return codigoConvenio;
    }
    public void setCodigoConvenio(int codigoConvenio){
        this.codigoConvenio = codigoConvenio;
    }

    // ======================================

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    // ======================================

    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    // ======================================

    public Date getDataFim() {
        return dataFim;
    }
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    // ======================================

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    // ======================================

}