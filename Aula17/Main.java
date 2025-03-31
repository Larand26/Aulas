package Aula17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>();

        numeros.add(11);
        numeros.add(22);
        numeros.add(33);
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add(0, "Argo");

        try {
            System.out.println(carros.get(10));
        } catch (Exception e) {
            System.err.println("Erro " + e.getMessage());
        }

        for(int e:numeros){
            System.out.println(e);
        }
        for(String e:carros){
            System.out.println(e);
        }
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        carros.clear();
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
    }
}
