import java.util.Objects;

public class Fight {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador lutador1, Lutador lutador2 ){

        if(Objects.equals(lutador1.getCategory(), lutador2.getCategory()) && lutador1 != lutador2){
            setAprovada(true);

            desafiado = lutador1;
            desafiante = lutador2;
        } else {
            setAprovada(false);

            desafiado = null;
            desafiante = null;

            System.out.println("Não foi possível marcar a luta");
        }
    }
    public void lutar(){
        if(getAprovada()){
            desafiado.apresentar(0);
            System.out.println();
            desafiante.apresentar(1);

            long vencedor = Math.round(Math.random());

            System.out.println();

            if(desafiado.getWeight() == desafiante.getWeight()){

                System.out.println("No fim, a luta foi bem difícil para ambos, fazendo com que torna-se em um empate, bravo lutadores!!!");

                desafiado.empatarLuta();
                desafiante.empatarLuta();
            }
            else if(vencedor == 0){

                System.out.println("O desafiante chamado " + desafiante.getName() + " foi quem ganhou a luta, parabéns!!!");

                desafiante.ganharLuta();
                desafiado.perderLuta();
            }
            else{

                System.out.println("O desafiado chamado " + desafiado.getName() + " foi quem ganhou a luta, parabéns!!!");

                desafiante.perderLuta();
                desafiado.ganharLuta();
            }

        } else {
            System.out.println("Luta não pode acontecer, pois possuem categorias diferentes");
        }
    }
}
