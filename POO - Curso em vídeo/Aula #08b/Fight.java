import java.util.Objects;
import java.util.Random;

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

        if(lutador1.getCategory() == lutador2.getCategory() && lutador1 != lutador2){

            setAprovada(true);

            setDesafiado(lutador1);
            setDesafiante(lutador2);
        } else {

            setAprovada(false);

            setDesafiado(null);
            setDesafiante(null);

            System.out.println("Não foi possível marcar a luta");
        }
    }
    public void lutar(){

        if(getAprovada()){

            desafiado.apresentar(0);
            System.out.println();
            desafiante.apresentar(1);

            System.out.println();

            Random aleatorio = new Random();
            int vencedor =  aleatorio.nextInt(3); // 0 1 2
            switch (vencedor){
                case 0:
                    System.out.println("No fim, a luta foi bem difícil para ambos, fazendo com que torna-se em um empate, bravo lutadores!!!");

                    System.out.println();

                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                break;

                case 1:
                    System.out.println("O desafiante chamado " + desafiante.getName() + " foi quem ganhou a luta, parabéns!!!");

                    System.out.println();

                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                break;

                case 2:
                    System.out.println("O desafiado chamado " + desafiado.getName() + " foi quem ganhou a luta, parabéns!!!");

                    System.out.println();

                    desafiante.perderLuta();
                    desafiado.ganharLuta();
                break;
            }

        } else {
            System.out.println("Luta não pode acontecer, pois possuem categorias diferentes");
        }
    }
}
