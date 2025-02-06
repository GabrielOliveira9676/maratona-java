package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <noame>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Pedro";
        String endereço = "Av Paulista";
        int salario = 5000;
        String data = "10/01/2000";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereço + " confirmo que recebi o salário de " + salario + ", na data " + data;

        System.out.println(relatorio);
    }

}
