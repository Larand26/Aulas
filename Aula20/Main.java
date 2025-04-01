package Aula20;

import java.nio.file.*;
import java.util.*;
public class Main {
    public static void main(String[] args)  {
        try {
            Path arquivo = Paths.get("C:/Users/SAC1/Desktop/20.03/desc.txt", args);
            if (!Files.exists(arquivo)) {
                System.out.println("Não existe");
                return;
            }
           List<String> linhas = Files.readAllLines(arquivo);
    
           for (String li : linhas) {
            System.out.println(li);
           }
        } catch (Exception e) {
            System.err.println("Erro: " +e);
        }
       
    }
}
