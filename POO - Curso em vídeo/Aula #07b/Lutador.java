public class Lutador implements Controller{

    // CATEGORY
    // 0: Leve;
    // 1: Medio;
    // 2: Pesado
    private String name, country;
    private int year, category, wins, defeats, tie;
    private float height, weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        setCategory();
    }

    public String getCategory() {

        if(this.category == -1){
            return "peso inválido";
        }
        else if(this.category == 0){
            return "peso leve";
        }
        else if (this.category == 1) {
            return "peso médio";
        }
        else{
            return "peso pesado";
        }
    }

    public void setCategory() {

        if(this.weight < 52.2){
            this.category = -1;
        }
        else if (this.weight <= 70.3) {
            this.category = 0;
        }
        else if(this.weight <= 83.9){
            this.category = 1;
        }
        else if(this.weight <= 120.2){
            this.category = 2;
        } else {
            this.category = -1;
        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins += wins;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats += defeats;
    }

    public int getTie() {
        return tie;
    }

    public void setTie(int tie) {
        this.tie = tie;
    }

    public Lutador(
            String name,
            String country,
            int year,
            float height,
            float weight,
            int wins,
            int defeats,
            int tie
    ) {
        setName(name);
        setCountry(country);
        setYear(year);
        setHeight(height);
        setWeight(weight);
        setWins(wins);
        setDefeats(defeats);
        setTie(tie);
    }

    @Override
    public void apresentar(int combatente) {


        if(combatente == 0){
            System.out.println("(DESAFIADO)");
        }
        else if(combatente == 1){
            System.out.println("(DESAFIANTE)");
        }


        System.out.println("Nome do lutador: " + this.getName());
        System.out.println("Nacionalidade: " + this.getCountry());
        System.out.println("Idade: " + this.getYear());
        System.out.println("Altura: " + this.getHeight());
        System.out.println("Peso: " + this.getWeight());
        System.out.println("Categoria: " + this.getCategory());
        System.out.println("Número de vitórias: " + this.getWins());
        System.out.println("Número de derrotas: " + this.getDefeats());
        System.out.println("Número de empates: " + this.getTie());
    }

    @Override
    public void status() {
        System.out.println("Nome: " + getName());
        System.out.println("Número de vitórias: " + this.getWins());
        System.out.println("Número de derrotas: " + this.getDefeats());
        System.out.println("Número de empates: " + this.getTie());
    }

    @Override
    public void ganharLuta() {
        setWins(getWins() + 1);
        System.out.println("O lutador " + getName() + " ganhou mais uma luta, parabéns!");
    }

    @Override
    public void perderLuta() {
        setDefeats(getDefeats() + 1);
        System.out.println("O lutador " + getName() + " perdeu mais uma luta, que pena!");
    }

    @Override
    public void empatarLuta() {
        setTie(getTie() + 1);
        System.out.println("O lutador " + getName() + " empatou mais uma luta, foi por pouco!");
    }
}
