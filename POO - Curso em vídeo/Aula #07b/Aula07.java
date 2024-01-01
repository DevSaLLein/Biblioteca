public class Aula07 {
    public static void main(String[] args){
        Lutador lutador1 = new Lutador(
                "Isaac",
                "Brasileiro",
                17,
                1.69f,
                69,
                0,
                0,
                0
        );

        Lutador lutador2 = new Lutador(
                "Levi",
                "Brasileiro",
                24,
                1.89f,
                69,
                1,
                10,
                3
        );

        Fight UEC01 = new Fight();
        UEC01.marcarLuta(lutador1, lutador1);
        UEC01.lutar();

        Lutador lutadores[] = new Lutador[6];

    }
}
