package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Pessoa;

//Interface é como se fosse um contato em que todos os metodos serão publicos e abstrato. Se não for abstrato precisa ser default, a partir do Java 8
public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    //todos os metodos no java são public e abstract
    public abstract void load();

    //Metodo concreto
    public default void checkPermission(){
        System.out.println("Fazendo Checagem de permissões");
    }
    public  static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrievemaxDataSize Classe DatabaseLoader");
    }

}
