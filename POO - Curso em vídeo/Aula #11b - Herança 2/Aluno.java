// Herança para diferença
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private int nivelDePureza;
    private String sexualidade;
    private String eleÉ;

    public void pagarMensalidade(){System.out.println("Pagando a mensalidade");}

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getNivelDePureza() {
        return nivelDePureza;
    }
    public void setNivelDePureza(int nivelDePureza) {
        this.nivelDePureza = nivelDePureza;
    }
    public String getSexualidade() {
        return sexualidade;
    }
    public void setSexualidade(String sexualidade) {
        this.sexualidade = sexualidade;
    }
    public String getEleÉ() {
        return eleÉ;
    }
    public void setEleÉ(String eleÉ) {
        this.eleÉ = eleÉ;
    }

    @Override
    public String toString() {
        return "Aluno = {" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", matrícula='" + getMatricula() + '\'' +
                ", curso='" + getCurso() + '\'' +
                ", Nível de pureza='" + getNivelDePureza() + '%' + '\'' +
                ", Sexualidade='" + getSexualidade() + '\'' +
                ", Ele é igual à='" + getEleÉ() + '\'' +
                '}'
        ;
    }
}
