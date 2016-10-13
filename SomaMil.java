class SomaMil{

    public static void main(String[] args) {

        int i = 1;
        int soma = 0;

        while(i <= 1000) {
            soma = soma + i;

            System.out.println("A soma " + i + " é: " + soma);
            i++;
        }

    }
}