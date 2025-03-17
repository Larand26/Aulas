import java.util.Scanner;
public class teste1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        char[] gabarito = {'a', 'c', 'b', 'a', 'd'};
        char[] respostas = new char[gabarito.length];
        int nota = 0;

        for(int i = 0; i < respostas.length; i++){
            System.out.println("Informe a alternativa:");
            respostas[i] = scan.nextLine().charAt(0);
        }

        for(int i = 0; i < respostas.length; i++){
            if(gabarito[i] == respostas[i]){
                nota++;
            }
        }

        System.out.println(nota);

        scan.close();

    }
}
