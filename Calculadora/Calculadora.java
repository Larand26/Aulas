import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int res = 0;
        String operacao;

        System.out.println("Coloque um número:");
        int n1 = scan.nextInt();
        System.out.println("Coloque outro número:");
        int n2 = scan.nextInt();

        scan.nextLine(); // Limpa a quebra de linha pendente
        System.out.println("Coloque a operação (+, -, *, /):");
        operacao = scan.nextLine();

        switch (operacao) {
            case "+":
                res = somar(n1, n2);
                break;
            case "-":
                res = subtrair(n1, n2);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    scan.close();
                    return;
                }
                res = dividir(n1, n2);
                break;
            case "*":
                res = multiplicar(n1, n2);
                break;
            default:
                System.out.println("Operação inválida!");
                scan.close();
                return;
        }

        System.out.println("Resultado: " + res);
        scan.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
}
