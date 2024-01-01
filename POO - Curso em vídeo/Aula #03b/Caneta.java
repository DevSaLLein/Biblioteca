public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + (this.tampada ? "sim" : "não"));
    }
    public void rabiscar(){}
    protected void tampar() {
        if(this.tampada){
            System.out.println("A caneta já está tampada");
        } else {
            this.tampada = true;
        }
    }
    protected void destampar(){
        if(this.tampada){
            this.tampada = false;
        } else {
            this.tampada = true;
        }
    }
}