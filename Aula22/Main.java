package Aula22;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Stack<String> carros = new Stack<>();

        carros.push("HRV");
        carros.push("Polo");
        carros.push("Argo");
        carros.push("Cronos");
        carros.push("Pulse");

        carros.forEach(linha -> System.out.println(linha));

        // Pega o elemento do topo da pilha
        System.out.println(carros.peek());

        // Pega o elemento do topo da pilha e o remove
        System.out.println(carros.pop());
        
        // Verifica se a pilha está vazia
        System.out.println(carros.empty());

        // Limpa a pilha
        carros.clear();

        carros.forEach(linha -> System.out.println(linha));
    }
}
