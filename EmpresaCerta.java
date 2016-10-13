class EmpresaCerta{
    Funcionario[] empregados;
    String cnpj;
    int livre = 0;

    void adiciona(Funcionario f) {
        this.empregados[this.livre] = f;
        this.livre++;
    }
}