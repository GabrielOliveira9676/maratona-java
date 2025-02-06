package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salário > 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNãoDoar = "Ainda não tenho condições, mas vou ter!";

        //OperadorTernário
        //(condição) ? verdadeiro : falso

        String resultado = salario > 5000 ? mensagemDoar : mensagemNãoDoar;
        System.out.println(resultado);

        //Segunda opção para estruturar o operador ternário.
        String resultado01 = salario > 6000 ? "Eu vou doar 500 para o DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado01);
    }
}
