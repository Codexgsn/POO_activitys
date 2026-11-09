import hospital.*;
void main() {

    Paciente p1 = new Paciente("gustavo", "1823749219");
    Paciente p2 = new Paciente("pedro", "39827349087");

    Medico m1 = new Medico("jose", "09234809234");
    Medico m2 = new Medico("marcus", "123789478");

    m1.adicionarPaciente(p1);
    m1.adicionarPaciente(p2);
    m2.adicionarPaciente(p1);

    m1.atender();
    m2.atender();

    p1.consultar(m1);
    p2.consultar(m2);

}
