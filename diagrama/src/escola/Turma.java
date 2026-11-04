package escola;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private int sala;
    private String data;

    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(int codigo, int sala, String data, Professor professor, List<Aluno> alunos) {
        this.codigo = codigo;
        this.sala = sala;
        this.data = data;
        this.professor = professor;
        this.alunos = alunos;
    }

    public boolean estaAberta(){
        return true;
    }

    public void setProfessor (Professor professor){
        this.professor = professor;
    }

    public void setAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
