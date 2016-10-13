class TestaFuncionario{
    public static void main(String[] args) {

            Funcionario func1 = new Funcionario();
            func1.nome = "Daniel";
            func1.salario = 2000 ;
            func1.setDataEntBco(10,10,2005);

             Funcionario func2 = new Funcionario();
            func2.nome = "PAULO";
            func2.salario = 1500;
            func2.setDataEntBco(12,10,2010);

             Funcionario func3 = new Funcionario();
            func3.nome = "LETICIA";
            func3.salario = 3200;
            func3.setDataEntBco(12,10,2001);

            Empresa emp = new Empresa();

            emp.adicionar(func1,0);
            emp.adicionar(func1,1);
            emp.adicionar(func1,2);

            emp.mostraQtdFuncionario();




     }

}