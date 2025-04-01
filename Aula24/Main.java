package Aula24;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> carros = new HashMap<Integer, String>();

        carros.put(1, "HRV");
        carros.put(2, "Polo");
        carros.put(3, "Golf");
        carros.put(4, "Cronos");
        carros.put(5, "Pulse");
        carros.put(6, "Kicks");

        System.out.println(carros.get(1));


        HashSet<Integer> numeros = new HashSet<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);

        System.err.println(numeros);

        
    }
}
