package escola;

public class Pessoa {
    private int idade;
    private String name;

    public Pessoa(int idade, String name){
        this.idade = idade;
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
