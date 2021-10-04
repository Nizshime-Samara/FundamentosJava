
package modelos;


public class CertificacaoProva {

    public CertificacaoProva(Aluno alunoCandidato, String descricaoProva) {
        this.alunoCandidato = alunoCandidato;
        this.descricaoProva = descricaoProva;
    }

    public Aluno getAlunoCandidato() {
        return alunoCandidato;
    }

    public void setAlunoCandidato(Aluno alunoCandidato) {
        this.alunoCandidato = alunoCandidato;
    }

    public String getDescricaoProva() {
        return descricaoProva;
    }

    public void setDescricaoProva(String descricaoProva) {
        this.descricaoProva = descricaoProva;
    }
    private Aluno alunoCandidato;
    private String descricaoProva;
    
}
