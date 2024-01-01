public final class Tecnico extends Aluno{
    private int rgProfissional;

    public void praticar(){
        System.out.println("Praticando...");
    }

    public int getRgProfissional() {
        return rgProfissional;
    }
    public void setRgProfissional(int rgProfissional) {
        this.rgProfissional = rgProfissional;
    }

    @Override
    public String toString() {
        return "Técnico = {" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", matrícula='" + getMatricula() + '\'' +
                ", curso='" + getCurso() + '\'' +
                ", Registro profissional='" + getRgProfissional() + '\'' +
                '}'
        ;
    }
}
