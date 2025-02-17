package academy.devdojo.maratonajava.src.javacore.Hheranca.test;

import academy.devdojo.maratonajava.src.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.src.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.src.javacore.Hheranca.domain.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 03");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");

        pessoa.setCpf("2222222222");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Oda Nobunaga");

        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(100000);
        System.out.println("------------------------------");

        funcionario.imprime();

    }
}
