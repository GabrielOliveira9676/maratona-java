package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args){
        //Exceções mais genericas, sempre precisam vir no final.
        // Todas exceções abaixo pode ser referenciada por RuntimeException que é a mais generica.

        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try{
            talvezLanceException();
        }catch (SQLException | IOException e){
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, IOException{

    }
}
