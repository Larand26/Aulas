package Aula16;

import java.security.*;

public class Main {
    public static void main(String[] args) {
        

        int[][] numeros = new int[3][5];
        //  O | O | O | O | O
        //----------------------
        //  O | O | O | O | O
        //----------------------
        //  O | O | O | O | O

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = new SecureRandom().nextInt(100);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " | ");
            }
            System.out.print("\n");
        }
    }
}
