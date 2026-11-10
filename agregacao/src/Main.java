import universidade.*;

void main() {

    Professor p1 = new Professor("Carlos", "Java");
    Professor p2 = new Professor("Mariana", "Banco de Dados");
    Professor p3 = new Professor("Roberto", "Engenharia de Software");

    Universidade u1 = new Universidade("Universidade Federal do Ceará", "07522960000111");
    Universidade u2 = new Universidade("Universidade de São Paulo", "63025530000104");
    Universidade u3 = new Universidade("Universidade Estadual de Campinas", "46068425000133");

    u1.adicionarProfessor(p1);
    u2.adicionarProfessor(p2);
    u3.adicionarProfessor(p3);
    p1.lecionar();
    p2.lecionar();
    p3.lecionar();


}
