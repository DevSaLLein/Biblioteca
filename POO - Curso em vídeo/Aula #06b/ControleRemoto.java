public class ControleRemoto implements Controller{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 5;
        this.ligado = false;
        this.tocando = false;
    }

    private void setVolume(int volume){ this.volume = volume; }
    private void setLigado(boolean ligado){ this.ligado = ligado; }
    private void setTocando(boolean tocando){ this.tocando = tocando; }

    private int getVolume(){ return this.volume; }
    private boolean getLigado(){ return this.ligado; }
    private boolean getTocando(){ return this.tocando; }

    @Override
    public void ligar(){

        if(getLigado()){ System.out.println("Já está ligado"); }
        else {

            setLigado(true);
            System.out.println("TV ligada");
        }
    }
    @Override
    public void desligar(){

        if(getLigado()){

            setLigado(false);
            System.out.println("TV desligada");
        }
        else{ System.out.println("Já está desligada"); }
    }
    @Override
    public void abrirMenu(){

        System.out.println("-----MENU-----");
        System.out.println("Está ligada? " + ((getLigado()) ? "sim" : "não"));
        System.out.println("Está tocando? " + ((getTocando()) ? "sim" : "não"));
        System.out.print("Volume: (" + getVolume() + ") ");

        for(int i = 0 ; i <= this.getVolume() ; i++){ System.out.print("|"); }

        System.out.println();
        System.out.println("----------");
    }
    @Override
    public void fecharMenu(){

        System.out.println("Fechando menu");
    }
    @Override
    public void aumentarVolume(){

        if(getLigado()){

            if(getVolume() == 100){ System.out.println("O volume já está no máximo"); }
            else{

                setVolume(getVolume() + 5);
                System.out.print("Volume: (" + getVolume() + ") ");

                for(int i = 0 ; i <= this.getVolume() ; i++){ System.out.print("|"); }

                System.out.println(" (Aumento de volume)");
            }

        } else { System.out.println("Não é possível aumentar o volume com a TV desligada"); }
    }
    @Override
    public void diminuirVolume(){

        if(getLigado()){

            if(getVolume() > 0){

                setVolume(getVolume() - 5);
                System.out.print("Volume: (" + getVolume() + ") ");

                for(int i = 0 ; i <= this.getVolume() ; i++){ System.out.print("|"); }

                System.out.println(" (Diminuição de volume)");
            }
            else if (getVolume() == 0) {

                ligarMudo();
                System.out.println("Você diminuiu para o modo mudo");
            }
            else{ System.out.println("Já está no mínimo"); }
        } else { System.out.println("Não é possível diminuir o volume com a TV desligada"); }
    }
    @Override
    public void ligarMudo(){

        if(getLigado() && getVolume() != 0){ setVolume(0); }
        else { System.out.println("O mudo já está ativado"); }
    }
    @Override
    public void tirarMudo(){

        if(getLigado() && getVolume() == 0){ setVolume(50); }
        else{ System.out.println("O mudo já está desativado"); }
    }
    @Override
    public void play(){

        if(getLigado() && getTocando()){ System.out.println("Já está tocando"); }
        else {

            setTocando(true);
            System.out.println("TV despausada");
        }
    }
    @Override
    public void pause(){

        if(getTocando()){

            setTocando(false);
            System.out.println("TV pausada");
        }
        else{ System.out.println("Já está pausado"); }
    }
}
