package Aula9;

public class Jogador {
    private int vidas = 0;
    private String nome;
    public Jogador(String nome){
        this.vidas = 3;
        this.nome = nome;
        System.err.printf("Jogador %s criado",nome);
    }
    public int getVidas(){
        return this.vidas;
    }
    public void setVidas(int vidas){
        if (vidas > 3) {
            this.vidas = 3;
        }else{
            this.vidas = vidas;
        }
    }
    public String getNome(){
        return this.nome;
    }
}
