package Aula11;

public class Veiculo {
    private String nome;
    private int tipo;
    public Veiculo(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    public String getNome() {
        return this.nome;
    }
    public void infos(){
        System.out.printf("Nome %s%n", this.nome);
        System.out.printf("Tipo %d%n", this.tipo);
    }
}
