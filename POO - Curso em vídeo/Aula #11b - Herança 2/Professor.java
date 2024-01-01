public final class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(float aumento){
        setSalario(getSalario() + aumento);
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor = {" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", salario='R$" + getSalario() + '0' + '\'' +
                ", especialidade='" + getEspecialidade() + '\'' +
                '}'
        ;
    }
}
