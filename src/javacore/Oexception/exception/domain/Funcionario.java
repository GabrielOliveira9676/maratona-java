package academy.devdojo.maratonajava.src.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando");
    }
}
