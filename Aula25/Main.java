package Aula25;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);

        System.out.println(numeros);
        
        Iterator<Integer> it = numeros.iterator();
        
        System.out.println(it.next()); // Obtém o primeiro elemento da lista

        while (it.hasNext()) {
            System.out.println(it.next());
           
        }
    }
}
