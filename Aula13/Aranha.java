package Aula13;

public class Aranha extends Animal{

    private int veneno;

    public Aranha(double massa, int vel, int forca, int veneno){
        super(massa, vel, forca);
        this.veneno = veneno;
        
    }
    public void comer() {
        
    }
    @Override
    public void atacar(Animal a) {
        super.atacar(a);
    }
}
