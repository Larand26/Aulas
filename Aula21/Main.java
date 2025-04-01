package Aula21;

import java.nio.file.*;
public class Main {
    public static void main(String[] args)  {
        try {
            Path arquivo = Paths.get("C:/Users/SAC1/Desktop/20.03/desc.txt", args);
            Path arquivo2 = Paths.get("C:/Users/SAC1/Desktop/cadastro/desc.txt", args);
            if (!Files.exists(arquivo)) {
                System.out.println("Não existe");
                return;
            }
           
            byte[] bytesArquivo = Files.readAllBytes(arquivo);

            Files.write(arquivo2, bytesArquivo);

        } catch (Exception e) {
            System.err.println("Erro: " +e);
        }
       
    }
}
