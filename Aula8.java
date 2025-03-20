public class Aula8{
    public static void main(String[] args) {
          
        System.out.println(soma(5.5, 20.2));
    }

    public static int soma(int... n) {
        return (n[1] + n[0]);
    }
    public static Double soma(Double... n) {
        return (n[1] + n[0]);
    }

    public static void msg(String n){
        System.out.println(n);
    }
}