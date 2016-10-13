class TestaEmpresa{

             public static void main(String[] args) {

                          Empresa emp = new Empresa();

                          for (int i = 0; i < 5; i++) {
                                    Funcionario f = new Funcionario();
                                    f.nome = "Homi"+i;
                                    f.salario = 1000 + i * 100;
                                    f.setDataEntBco(10 + i,10,2005);
                                    emp.adiciona(f,i);
                          }

                          Funcionario fclocal = new Funcionario();


                          fclocal.nome = "Daniel";
                          System.out.println(emp.contem(fclocal));
             }

}