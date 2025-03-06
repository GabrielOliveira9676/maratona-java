package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.src.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senha = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senha.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha invalidos");
        }
        System.out.println("Usuário logado com sucesso");
    }

}

