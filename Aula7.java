import java.security.SecureRandom;
public class Aula7{
    public static void main(String[] args) {
        
        final int lines = 3;
        final int coluns = 5;
        int[][] num = new int[lines][coluns];

        for(int l = 0; l<lines; l++){
            for(int c = 0; c<coluns;c++){
                num[l][c] = new SecureRandom().nextInt(9) + 1;
            }
        }
        
        for(int l = 0; l<lines; l++){
            for(int c = 0; c<coluns;c++){
                System.out.print(num[l][c] + " | ");
            }
            System.out.print("\n");
        }
    }
}