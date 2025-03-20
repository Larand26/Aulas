package Aula9;

public class Aula9 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Larand"); 
        System.err.println("\n"+j1.getVidas());
        j1.setVidas(2);
        System.err.println(j1.getVidas());
    }
}
