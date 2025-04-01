package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // Meta caracter
        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo que não for incluso do \w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n, m} de n até m
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3, 1A3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //Expressão regular
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.com, test@gmail.com.br, sakura@mail ";

        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.com".matches(regex)); //Verificando se a Expressão regular é valida.
        System.out.println(texto.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+"\n");
        }

    }
}
