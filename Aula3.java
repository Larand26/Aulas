import java.util.Scanner;

public class Aula3{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n1,n2,n3,n4,res;
        final int media = 6;

        System.out.println("Digiti um numero:");
        n1 = scan.nextInt();
        System.out.println("Digiti um numero:");
        n2 = scan.nextInt();
        System.out.println("Digiti um numero:");
        n3 = scan.nextInt();
        System.out.println("Digiti um numero:");
        n4 = scan.nextInt();

        res = (n1+n2+n3+n4)/4;

        if (res >= media) {
            System.err.printf("Aprovado com nota: %d",res);
        }else{
            System.err.printf("Reprovado com nota: %d", res);
        }

        scan.close();
    }
}