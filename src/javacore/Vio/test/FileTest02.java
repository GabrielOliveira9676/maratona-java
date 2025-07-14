package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);
        File fileArquivoDiretorio = new File (fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDiretorio, "arquico_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);
        
        File diretorRenamed = new File ("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorRenamed);
        System.out.println(isDiretorioRenomeado);

    }
}
