class Funcionario{

    String nome;
    String departamento;
    double salario;
    double ganhoAnual;
    String  rg;

        Data dataEntradaBanco = new Data();

        void setDataEntBco(int d, int m, int a){
            this.dataEntradaBanco.setData(d,m,a);
        }


         void recebeAumento(double valor){
             this.salario += valor;
        }

        double calculaGanhoAnual(){
             this.ganhoAnual = this.salario * 12;

             return ganhoAnual;
        }


        void mostra() {
            // imprime outros atributos...
            System.out.println("Data de entrada: " + this.dataEntradaBanco.getFormatada());
        }
}