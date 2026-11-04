package escola;

public class Aluno extends Pessoa {
    private int matricula;
    public Aluno(String name, int matricula){
        super(name);
        this.matricula = matricula;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
