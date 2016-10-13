class Empresa{

     String nome;
     String cnpj;

     Funcionario[] func = new Funcionario[10];

     void adicionar(Funcionario f, int pos) {

            this.func[pos] = f;

     }

     void mostraQtdFuncionario(){

          //  int = cont;

            for(int i=1; i <= this.func.length; i++) {

                  if(func==null) continue;
                  System.out.println(func[i]);

             }

     }

     /*int checaPosicaoLivre(){

           for(int i=1; i <= this.funcionarios.length; i++) {

                    If( funcionarios[i] ){
                                return i;
                                exit for;
                    }

             }
     }*/
}