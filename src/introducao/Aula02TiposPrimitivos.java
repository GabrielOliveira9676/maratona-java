package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 100000000000L;
        long numeroGrande = (long) 155.23;
        double salarioD = 6000.0D;
        float salarioF = (float) 8000.0;
        byte  idadeB = 127;
        short idadeS = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; //Pode ser utilizado unicode Table ou ASC Table
        var nome2 = "Gotem";

        String nome = "Pedrinho";

        /*
        O CAST é uma função poderosa para transformação de tipos de dados,
        possibilitando a flexibilidade de mudar colunas de um tipo incompatível para outro compatível.
        Exemplo: int idade = (int) 100000000000L;
         */

        System.out.println("A idade é: " + idade + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(salarioF);
        System.out.println(numeroGrande);
        System.out.println("Ola meu nome é: " + nome);
        System.out.println("Qual o seu nome? " + nome2);
    }
}
