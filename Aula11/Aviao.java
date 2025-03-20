package Aula11;

public class Aviao extends Veiculo{
    private Boolean voando;
    public Aviao(String nome, int tipo){
        super(nome, tipo);
        this.voando = false;
    }
    public void infos(){
        super.infos();
        System.out.printf("Está voando: %s",voando?"sim":"não");
    }
}
