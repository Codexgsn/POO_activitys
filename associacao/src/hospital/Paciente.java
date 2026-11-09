package hospital;

public class Paciente extends Pessoa{

    private String cpf;

    public Paciente(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }


    public void consultar(Medico medico){
        System.out.println("Eu " + this.getNome() + " vou ser consultado(a) por " + medico.getNome());
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

}
