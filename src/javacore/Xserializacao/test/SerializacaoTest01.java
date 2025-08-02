package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno (1L, "Gabriel lindo", "1020304050");
        // serializar(aluno);
            desserializar(aluno);
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){
            oss.writeObject(aluno);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void desserializar(Aluno aluno) {
        Path path2 = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path2))) {
            Aluno aluno1 = (Aluno) ois.readObject();
            System.out.println(aluno1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
