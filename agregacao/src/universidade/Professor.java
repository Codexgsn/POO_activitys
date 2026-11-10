package universidade;

public class Professor {
    private String nome;
    private String disciplina;



    public Professor(String nome, String disciplina){
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String lecionar(){
        return "Eu" + nome + " estou na universida:" + universidade.getNome();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String universidade){
        this.disciplina = universidade;
    }

}
