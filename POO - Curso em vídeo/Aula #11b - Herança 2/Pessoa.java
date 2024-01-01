import Interface.PessoaController;

public abstract class Pessoa implements PessoaController {
    private String nome;
    private int idade;
    private String sexo;

    public final void fazerAniversario(){
        setIdade(getIdade() + 1);
        System.out.println("Parabéns " + getNome() + "! hoje faz mais um ano de vida, logo sua idade agora é " + getIdade() + ".");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return "Pessoa = {" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}'
        ;
    }
}
