package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);

        try {
            Files.createDirectories(subPastaPath);
            System.out.println("Pastas criadas com sucesso: " + subPastaPath.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Erro ao criar as pastas: " + e.getMessage());
        }

        Path filePath = Paths.get(subPastaPath.toString(),"file.txt");

        if (Files.notExists(filePath)){
           Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
