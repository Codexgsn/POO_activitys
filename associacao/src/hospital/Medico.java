package hospital;
import java.util.List;
import java.util.ArrayList;

public class Medico extends Pessoa{
    private String crm;
    private List <Paciente> pacientes;

    public Medico(String nome, String crm){
        super(nome);
        this.crm = crm;
        this.pacientes = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente pacientes){
        this.pacientes.add(pacientes);

    }

    public void atender(){
        for(Paciente paciente: this.pacientes) {
            System.out.println("Eu " + this.getNome() + " atendo " + paciente.getNome());
        }
    }

    public String getCrm(){
        return crm;
    }

    public void setCrm(String crm){
        this.crm = crm;
    }

}
