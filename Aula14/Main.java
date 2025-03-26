package Aula14;
import Aula10.*;

public class Main {
    public static void main(String[] args){
        
        String[]modelos={"Golf", "Argo", "Pulse", "Hb20", "Kicks", "Cronos"};
        Carro[] carros = new Carro[modelos.length];

        for (int i = 0; i < modelos.length; i++) {
            carros[i] = new Carro(modelos[i]);
        }

        for(Carro carro : carros){
            carro.info();
        }
        
    }
}
