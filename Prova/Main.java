package Prova;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        


        Scanner scan = new Scanner(System.in);
        final char[] gabarito = {'a','b','c','a','a'};
        char[] respostas = new char[gabarito.length];
        int nota = 0;
        String[] perguntas = new String[gabarito.length];

        perguntas[0] = "10 + 5 = ? \n a) 15 | b) 20 | c) 10 \n ";
        perguntas[1] = "15 + 5 = ? \n a) 7 | b) 20 | c) 30 \n ";
        perguntas[2] = "10 + 56 = ? \n a) 56 | b) 76 | c) 66 \n ";
        perguntas[3] = "23 + 5 = ? \n a) 28 | b) 20 | c) 38 \n ";
        perguntas[4] = "15 + 89 = ? \n a) 104 | b) 100 | c) 94 \n ";

        for(int i = 0; i < perguntas.length; i++){
            System.out.print(perguntas[i]);
            System.out.println("------------------");
            char r;
            
            while (true) {
                r = scan.next().charAt(0);
                char[] a = {'a','b','c'};
                if (Arrays.binarySearch(a, r) == 1) {
                    respostas[i] = r;
                    break;
                }else{
                    System.out.println("Coloque uma resposta valida");
                }
            }
        }

        for(int i = 0; i < respostas.length; i++){
            if (respostas[i] == gabarito[i]) {
              nota++;
            }
        }

        switch (nota) {
            case 5: case 4:
                System.out.println("Parabens voce passou com nota: " + nota);
                break;
            case 3: case 2:
                System.out.println("Voce ficou de recuperacao com nota: " + nota);
                break;
            case 1: case 0:
                System.out.println("Voce reprovou com nota: " + nota);
                break;
        
            default:
                System.out.println("NOTA INVALIDA");
                break;
        }
        scan.close();

    }
}
