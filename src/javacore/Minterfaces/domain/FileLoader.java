package academy.devdojo.maratonajava.src.javacore.Minterfaces.domain;

public class FileLoader  implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carrega dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do Banco de dados");
    }

    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");

    }
}
