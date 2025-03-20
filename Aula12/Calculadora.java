package Aula12;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Numeros n1 = new Numeros(0);
        Numeros n2 = new Numeros(0);
        Numeros res = new Numeros(0);

        System.out.println("Digite um numero");
        n1.setNum(scan.nextInt());
        System.out.println("Digite um numero");
        n2.setNum(scan.nextInt());

        res.setNum(n1.getNum()+n2.getNum());

        System.out.printf("%n %d + %d = %d",n1.getNum(),n2.getNum(),res.getNum());

        scan.close();
    }
}
