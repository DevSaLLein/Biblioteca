public class Aula04 {
    public static void main(String[] args){
        Caneta pinBlack = new Caneta();

        pinBlack.setModelo("BIC");
        pinBlack.setPonta(0.5f);

        pinBlack.status();

        System.out.println("-----------------------");

        Caneta pinRed = new Caneta("BIC", "Vermelha", 0.4f);
    }
}
