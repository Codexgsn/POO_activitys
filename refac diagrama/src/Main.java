import escola.*;
void main() {
    Aluno a1 = new Aluno("gustavo", 231223);
    Aluno a2 = new Aluno("marciel", 387529);
    Aluno a3 = new Aluno("heitor", 459182);
    Aluno a4 = new Aluno("pedro", 713945);

    Professor p1 = new Professor("jedson", "mestre");
    Professor p2 = new Professor("taniro", "técnico");

    Turma t1 = new Turma(1, 1, "15:30", p1);
    Turma t2 = new Turma(2, 3, "17:30", p2);

    t1.incluirAluno(a1);
    t1.incluirAluno(a3);
    t2.incluirAluno(a2);
    t2.incluirAluno(a4);

    t1.listarALunos();
    t2.listarALunos();
}
