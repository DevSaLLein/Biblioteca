public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    //Getters
    public String getModelo(){ return this.modelo; }
    public float getPonta(){ return this.ponta; }
    public String getCor(){ return this.cor; }

    //Setters
    public void setModelo(String modelo){ this.modelo = modelo; }
    public void setPonta(float ponta){ this.ponta = ponta; }
    public void setCor(String cor){ this.cor = cor; }

    //Status
    public void status(){
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("ponta: " + this.ponta);
        System.out.println("cor: " + this.cor);
        System.out.println("está tampada? " + (this.tampada ? "sim" : "não"));
    }

    //Métodos
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    //Constructors
    public Caneta(){
        destampar();
    }
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;

        status();
    }
}
