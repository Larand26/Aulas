package Aula15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] num = {5,15,8,79,4,6,2};
        int[] num2 = new int[num.length];

        // Deixa em ordem crescente
        // Arrays.sort(num);

        // Prenche valores do array
        // Arrays.fill(num, 10);

        // Faz uma copia de um array para outro
        // System.arraycopy(num, 0, num2, 0, num.length);

        // Faz a comparação de dois arrays
        // Boolean a = Arrays.equals(num, num2);
        // System.out.println(a);

        // Pesquisa binária
        boolean a = Arrays.binarySearch(num, 15) == 1;
        System.out.println(a);


        
        for (int i : num) {
            System.out.println(i);
        }
    }
}
