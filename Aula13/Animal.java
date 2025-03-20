package Aula13;

abstract class Animal implements SerVivo{
    private Boolean vivo;
    private Double massa;
    private int x;
    private int y;
    private int vel;
    private int forca;

    public Animal(Double massa, int vel, int forca){
        this.vivo = true;
        this.massa = massa;
        this.x = 0;
        this.y = 0;
        this.vel = vel;
        this.forca = forca;
    }
    // Vivo
    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
    public Boolean getVivo() {
        return this.vivo;
    }

    // Força
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getForca() {
        return forca;
    }

    // Massa
    public void setMassa(Double massa) {
        this.massa = massa;
    }
    public Double getMassa() {
        return massa;
    }

    //posição
    public String getPosition(){
        return this.x + " - " + this.y;
    }

    public void comer(int massa){
        if (this.vivo) {
            this.forca += massa;
        }
    }
    public void mover(){
        if (this.vivo) {
            this.x += this.vel;
        }
    }
    public void info(){}
    public void atacar(Animal a){
        if (this.vivo) {
            if (this.forca > a.getForca()) {
                this.forca += a.getMassa();
                a.setVivo(false);
            }else{
                a.setForca(a.getForca()+this.forca);
                this.vivo = false;
            }
        }else{
            System.out.println("Animal morto");
        }
    }
}