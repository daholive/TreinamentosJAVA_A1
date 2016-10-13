class Empresa{

     String nome;
     String cnpj;
     int livre = 0;
     Boolean tmp;

     Funcionario[] func = new Funcionario[10];

     boolean contem(Funcionario fs){

           for(int i=0; i < this.func.length; i++) {

                  Funcionario fbase = this.func[i];
                  if(fbase == fs) {
                        this.tmp = true;
                    } else {
                        this.tmp = false;
                  }
             }

             return tmp;
     }

     void adiciona(Funcionario f, int pos) {
            this.func[pos] = f;
            System.out.println("Posição no Vetor: " + pos + " / Nome do Funcionário: " + f.nome + " / Salário: " + f.salario + " / Data Entrada: " + f.ganhoAnual);
     }

     void mostraQtdFuncionario(){

            for(int i=0; i < this.func.length; i++) {

                  Funcionario fc = this.func[i];
                  if(fc == null) continue;
                  System.out.println(fc.nome);
             }

     }

}