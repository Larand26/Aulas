import java.nio.file.*;
public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/SAC1/Desktop/projetosJava", args);
        Path arquivo = Paths.get("C:/Users/SAC1/Desktop/projetosJava/Aulas/HelloWord.java", args);

        if (Files.isDirectory(path)) {
            System.out.println("Existe");
        }else{
            System.out.println("Não existe");
        }
        
        if (Files.exists(arquivo)) {
            System.out.println("Existe");
        }else{
            System.out.println("Não existe");
        }

       
    }
}
