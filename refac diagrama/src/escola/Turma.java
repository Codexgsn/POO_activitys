package escola;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private int sala;
    private String horario;
    private List<Aluno> alunos;
    private Professor professor;

    public Turma(int codigo, int sala, String horario, Professor professor) {
        this.codigo = codigo;
        this.sala = sala;
        this.horario = horario;
        this.alunos = new ArrayList<>();;
        this.professor = professor  ;
    }

    public void listarALunos(){
        for (Aluno alunos: this.alunos){
            System.out.println("nome: " + alunos.getName() + " turma: " + this.getCodigo() + " professor: " + professor.getName());
        }
    }

    public boolean estaAberta(){
        return true;
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

    public void definirProfessor(Professor professor){
        this.professor = professor;
    }

    public void incluirAluno(Aluno alunos){
        this.alunos.add(alunos);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
