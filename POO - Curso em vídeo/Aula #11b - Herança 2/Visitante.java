// Herança para implementação (Pobre)
public final class Visitante extends Pessoa{
    @Override
    public String toString() {
        return "Visitante = {" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                '}'
        ;
    }
}
