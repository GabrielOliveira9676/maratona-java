package academy.devdojo.maratonajava.src.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.src.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
