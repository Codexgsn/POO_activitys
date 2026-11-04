package escola;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private int sala;
    private String horario;

    private Professor professor;
    private List<Aluno> alunos;

    public Turma(int codigo, int sala, String horario, Professor professor) {
        this.codigo = codigo;
        this.sala = sala;
        this.horario = horario;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void listarAlunos(){
        for (Aluno alunos: getAlunos()){
            System.out.println("Aluno: " + alunos.getName() + " matricula: " + alunos.getMatricula() + " turma: " + this.getCodigo() + " professor: " + professor.getName());
        }
    }

    public void incluirAluno(Aluno aluno){
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
