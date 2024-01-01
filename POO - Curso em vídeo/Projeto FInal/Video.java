public class Video implements AcoesVideo{
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public float getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(float avaliacao) {
        float novaAvaliacao;
        novaAvaliacao = (int) ((getAvaliacao() + avaliacao) / getViews());

        this.avaliacao = novaAvaliacao;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        setReproduzindo(true);
    }
    @Override
    public void pause() {
        setReproduzindo(false);
    }
    @Override
    public void like() {
        setCurtidas(getViews() + 1);
    }

    public Video(String titulo) {
        this.titulo = titulo;
        setAvaliacao(0f);
        setViews(0);
        setCurtidas(0);
        setReproduzindo(false);
    }

    public void detalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Views: " + getViews());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Reproduzindo: " + getReproduzindo());
    }
}
