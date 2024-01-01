public class Aula06 {
    public static void main(String[] argd){
        ControleRemoto controle = new ControleRemoto();

        controle.abrirMenu();

        controle.ligar();

        controle.aumentarVolume();
        controle.diminuirVolume();

        controle.play();
    }
}
