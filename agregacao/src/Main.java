import universidade.*;

void main() {

    Professor p1 = new Professor("Carlos", "Java");
    Professor p2 = new Professor("Mariana", "Banco de Dados");
    Professor p3 = new Professor("Roberto", "Engenharia de Software");

    Universidade u1 = new Universidade("Universidade Federal do Ceará", "07522960000111");
    Universidade u2 = new Universidade("Universidade de São Paulo", "63025530000104");
    Universidade u3 = new Universidade("Universidade Estadual de Campinas", "46068425000133");

    u1.adicionarProfessor(p1);
    u1.adicionarProfessor(p3);
    u2.adicionarProfessor(p2);
    u3.adicionarProfessor(p3);

    u1.listarProfessorFac();
    u3.listarProfessorFac();
    System.out.println("||||||||||||||||||||||||");
    p3.setNome("rircado");

    u1.listarProfessorFac();
    u3.listarProfessorFac();

    u1.getProfessores().remove(p3);





}
