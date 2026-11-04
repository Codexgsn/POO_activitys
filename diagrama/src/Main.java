import escola.*;

void main() {

    Aluno a1 = new Aluno(18, "gustavo", 128387);
    Aluno a2 = new Aluno(24, "marciel", 387529);
    Aluno a3 = new Aluno(20, "heitor", 459182);
    Aluno a4 = new Aluno(22, "pedro", 713945);


    Professor prof = new Professor(34, "jaime", "mestre");
    Professor prof2 = new Professor(33, "jedson", "mestre");

    Turma t1 = new Turma(1, 1, "13:00", prof);
    Turma t2 = new Turma (2, 3, "13:50", prof2);

    t1.incluirAluno(a1);
    t1.incluirAluno(a2);

    t2.incluirAluno(a3);
    t2.incluirAluno(a4);



    t2.listarAlunos();


}
