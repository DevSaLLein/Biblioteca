public class Gafanhoto extends Pessoa {
    private String login;
    private int totalAssistido;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotalAssistido() {
        return totalAssistido;
    }
    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    public void viuMaisUm(){}

    public Gafanhoto(String nome, String login, String sexo, int idade) {

        setLogin(login);
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
        setExperiencia(0);
    }

    public void apresentarGafanhoto() {

        System.out.println("Nome: " + getNome());
        System.out.println("Login: " + getLogin());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Idade: " + getIdade());
        System.out.println("Experiência: " + getExperiencia());
        System.out.println("Total de vídeos assistidos: " + getTotalAssistido());
    }

    @Override
    public void ganharExp(){
        setExperiencia(getExperiencia() + 1);
        System.out.println("O usuário " + getLogin() + " acabou de ganhar mais um de experiência, parabéns!");
    }
}
