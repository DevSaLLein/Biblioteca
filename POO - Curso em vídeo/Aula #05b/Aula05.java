public class Aula05 {
    public static void main(String[] args){

        Banco jurema = new Banco("Jurema", 500f, 1);
        System.out.println("-------------------");
        Banco jubileu = new Banco("Jubileu", 300f, 0);
        System.out.println("-------------------");

        jurema.abrirConta();

        jurema.pagarMensalidade();
        System.out.println();

        jurema.sacar(100);
    }
}
