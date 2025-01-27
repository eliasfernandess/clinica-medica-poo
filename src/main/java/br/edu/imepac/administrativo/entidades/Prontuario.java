package br.edu.imepac.administrativo.entidades;

public class Prontuario {

    private Long id;
    private String receituario;
    private String exames;
    private String observacoes;

    public Prontuario() {
    }


    public Prontuario(String exames, String receituario, String observacoes) {
        this.exames = exames;
        this.receituario = receituario;
        this.observacoes = observacoes;
}


    public Prontuario(Long id, String receituario, String exames, String observacoes) {
        this.id = id;
        this.receituario = receituario;
        this.exames = exames;
        this.observacoes = observacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceituario() {
        return receituario;
    }

    public void setReceituario(String receituario) {
        this.receituario = receituario;
    }

    public String getExames() {
        return exames;
    }

    public void setExames(String exames) {
        this.exames = exames;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    @Override
    public String toString() {
    return "Prontuario{" +
           "id=" + id +
           ", receituario='" + receituario + '\'' +
           ", exames='" + exames + '\'' +
           ", observacoes='" + observacoes + '\'' +
           '}';
}

}
