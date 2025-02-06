package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1733774216002L); //long 1000000
        date.setTime(date.getTime() + 3_600_000); //Adiciona 1 hora
        System.out.println(date);
    }
}
