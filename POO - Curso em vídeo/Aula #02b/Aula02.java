public class Aula02 {
    public static void main(String[] args){
        Caneta caneta = new Caneta();

        caneta.cor = "Azul";
        caneta.carga = 100;
        caneta.modelo = "BIC";
        caneta.ponta = 0.5f;
        caneta.tampada = false;

        caneta.status();

        caneta.tampar();
        caneta.tampar();
    }
}