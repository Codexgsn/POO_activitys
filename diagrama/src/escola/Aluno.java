package escola;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(int idade, String name, int matricula){
        super(idade, name);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
