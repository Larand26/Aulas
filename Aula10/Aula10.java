package Aula10;

public class Aula10 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Audi");
        CarroCombate c2 = new CarroCombate("Golf");
        
        c1.info();
        c2.info();

        c1.sofreDano(10);
        c2.sofreDano(10);

        c1.info();
        c2.info();
    }
}
