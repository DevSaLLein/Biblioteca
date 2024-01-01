public final class Bolsista extends Aluno{
    private float bolsa;
    private String Sexualidade;
    private String qual;

    public final void renovarBolsa(){System.out.println("Renovando a bolsa");}

    @Override
    public void pagarMensalidade(){System.out.println("é bolsista, pagamento facilitado");}

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    public String getSexualidade() {
        return Sexualidade;
    }
    public void setSexualidade(String sexualidade) {
        Sexualidade = sexualidade;
    }
    public String getQual() {
        return qual;
    }
    public void setQual(String qual) {
        this.qual = qual;
    }

    @Override
    public String toString() {
        return "Bolsista = {" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", curso='" + getCurso() + '\'' +
                ", seu tipo='" + getSexualidade() + '\'' +
                ", lado(Algo tao obvio, mas né, vamos dizer)='" + getQual() + '\'' +
                ", bolsa='" + getBolsa() + '%' + '\'' +
                '}'
        ;
    }
}
