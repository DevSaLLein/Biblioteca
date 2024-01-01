public class ProjetoFinal {
    public static void main(String[] args) {

        Video videos[] = new Video[3];
        videos[0] = new Video("JavaScript");
        videos[1] = new Video("PHP");
        videos[2] = new Video("JavaSpring");

        Gafanhoto gafanhoto = new Gafanhoto (
                "Isaac",
                "DevSaLLein",
                "Masculino",
                17
        );


        Visualizacao visualizacao = new Visualizacao(gafanhoto, videos[0]);

        gafanhoto.ganharExp();

        visualizacao.apresentarVisualizacao();

        System.out.println();


        videos[0].setViews(4);

        System.out.println(videos[0].getViews());
        visualizacao.avaliar();
        System.out.println(videos[0].getAvaliacao());

    }
}
