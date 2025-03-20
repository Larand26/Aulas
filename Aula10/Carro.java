package Aula10;

public class Carro {
    Boolean ligado;
    Boolean armamento;
    Boolean destruido;
    String nome;
    int blindagem;

    public Carro(String nome){
        this.ligado = false;
        this.armamento = false;
        this.destruido = false;
        this.nome = nome;
        this.blindagem = 0;
    }

    // Gets
    public Boolean getArmamento() {
        return armamento;
    }
    public int getBlindagem() {
        return blindagem;
    }
    public Boolean getDestruido() {
        return destruido;
    }
    public Boolean getLigado() {
        return ligado;
    }
    public String getNome() {
        return nome;
    }

    // Sets
    public void setArmamento(Boolean armamento) {
        this.armamento = armamento;
    }
    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }
    public void setDestruido(Boolean destruido) {
        this.destruido = destruido;
    }
    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    // metodos
    public void sofreDano(int dano){
        if (this.blindagem - dano > 0) {
            this.blindagem -= dano;
        }else{
            this.blindagem = 0;
            this.destruido = true;
        }
       
    }

    //infos
    public void info() {
        System.out.println("Nome: "+this.nome);
        System.out.println(this.ligado?"Ligado":"Desligado");
        System.out.println("Blindagem: "+this.blindagem);
        System.out.println(this.armamento?"Armado":"Desarmado");
        System.out.println(this.destruido?"Destruido":"Inteiro");
    }

}
