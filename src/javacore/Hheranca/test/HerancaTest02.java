package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memória para o objeto da superclasse
    // 3 - Cada atributo de da superclasse é criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Consultor é executado da superclasse
    // 6 - Alocado espaço em memória para o objeto da subclasse
    // 7 - Cada atributo de da subclasse é criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Consultor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
