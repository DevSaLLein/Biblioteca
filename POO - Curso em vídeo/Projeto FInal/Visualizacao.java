public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar() {
        filme.setAvaliacao(5);
    }
    public void avaliar(int nota) {
        filme.setAvaliacao(nota);
    }
    public void avaliar(float porc) {
        int total = 0;

        if(porc <= 20) { total = 3; }
        else if(porc <= 50){ total = 5; }
        else if(porc <= 90){ total = 8; }
        else { total = 10; }

        filme.setAvaliacao(total);
    }
    public void apresentarVisualizacao(){

        Video video = getFilme();
        Gafanhoto gafanhoto = getEspectador();

        System.out.println("Vídeo assistido: " + video.getTitulo());
        System.out.println("Espectador: " + gafanhoto.getNome());

        System.out.println();
        System.out.println("-DETALHES DO FILME ASSISTIDO-");
        System.out.println("Avaliação: " + video.getAvaliacao());
        System.out.println("Views: " + video.getViews());
        System.out.println("Curtidas: " + video.getCurtidas());
        System.out.println("Está sendo produzido?  " + (video.getReproduzindo() ? "sim" : "não"));

        System.out.println();

        System.out.println("-DETALHES DO ESPECTADOR-");
        System.out.println("Login: " + gafanhoto.getLogin());
        System.out.println("Nome do gafanhoto: " + gafanhoto.getNome());
        System.out.println("Idade: " + gafanhoto.getIdade());
        System.out.println("Experiência: " + gafanhoto.getExperiencia());
        System.out.println("Total de vídeos assistidos(Não contando com o atual): " + (gafanhoto.getTotalAssistido() - 1));

    }
    public Visualizacao(Gafanhoto espectador, Video filme) {
        setEspectador(espectador);
        setFilme(filme);

        filme.setViews(filme.getViews() + 1);
        espectador.setTotalAssistido(espectador.getTotalAssistido() + 1);
    }
}
