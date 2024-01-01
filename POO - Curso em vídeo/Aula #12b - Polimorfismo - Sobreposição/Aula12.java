public class Aula12 {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        mamifero.setCorPelo("Rosa");
        mamifero.setPeso(14.4f);
        mamifero.setIdade(12);
        mamifero.setMembros(4);
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

        Reptil reptil = new Reptil();
        reptil.setPeso(10f);
        reptil.setIdade(8);
        reptil.setMembros(8);
        reptil.locomover();
        reptil.alimentar();
        reptil.emitirSom();

        Peixe peixe = new Peixe();
        peixe.setPeso(6);
        peixe.setIdade(3);
        peixe.setMembros(4);
        peixe.locomover();
        peixe.alimentar();
        peixe.emitirSom();
        peixe.soltarBolha();

        Ave ave = new Ave();
        ave.setPeso(20);
        ave.setIdade(1);
        ave.setMembros(2);
        ave.locomover();
        peixe.alimentar();
        peixe.emitirSom();

        Canguru canguru = new Canguru();
        canguru.setPeso(45);
        canguru.setIdade(3);
        canguru.setMembros(2);
        canguru.emitirSom();
        canguru.userBolsa();

        Cachorro cachorro = new Cachorro();
        cachorro.setPeso(20);
        cachorro.setIdade(10);
        cachorro.setMembros(4);
        cachorro.emitirSom();
        cachorro.abanarRabo();
        cachorro.enterrarOsso();
    }
}
