class Data{

    int dia;
    int mes;
    int ano;
    String data;

     void setData(int dia, int mes, int ano){
            this.dia = dia;
            this.mes = mes;
            this. ano = ano;
     }

      String getFormatada(){

           this.data = this.dia + "/" + this.mes + "/" + this.ano;

           return data;
      }

}