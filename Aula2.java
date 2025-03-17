public class Aula2{
    public static void main(String[] args){
        // IF
        // IF ELSE
        int nota = 80;
        int faltas = 10;
        int media = 60;
        int maxFaltas = 5;
        String res;

        res = (nota >= media?"Aprovado":"Reprovado");
        System.out.println(res);

        if(nota >= media && faltas <= maxFaltas){
            System.out.println("Aprovado");
        }else if(nota >= media - 20){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }

        // SWITCH

        int pos = 4;

        switch(pos){
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2:
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceirp Lugar");
                break;
            default:
                System.out.println("Não entrou no pódio");
                break;   
        }
    }
}