package Aula23;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> carros = new LinkedList<>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Argo");
        carros.add("Cronos");
        carros.add("Pulse");

        carros.forEach(linha -> System.out.println(linha));

        // Primeiro da fila
        System.out.println(carros.peek());

        // Pega o elemento do topo da fila e o remove
        System.out.println(carros.poll());
        
        // Verifica se a fila está vazia
        System.out.println(carros.isEmpty());

        // Limpa a fila
        carros.clear();

        carros.forEach(linha -> System.out.println(linha));
    }
}
