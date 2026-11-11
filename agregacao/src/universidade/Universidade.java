package universidade;
import java.util.List;
import java.util.ArrayList;

public class Universidade {
    private String nome;
    private String cnpj;
    private List <Professor> professores;

    public Universidade(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor){
        this.professores.add(professor);
    }

    public void listarProfessorFac(){
        for (Professor professor: professores){
            System.out.println("Universidade: " + this.nome + " Professores: " + professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void removerProfessor(Professor professor){
        professores.remove(professor);
    }

}
