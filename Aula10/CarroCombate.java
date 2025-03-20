package Aula10;

public class CarroCombate extends Carro{
    
    public CarroCombate(String nome){
        super(nome);
        this.setBlindagem(100);
    }
    public int atacar(){
        return 1+1;
    }
}
