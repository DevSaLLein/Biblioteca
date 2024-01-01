public class Aula10 {
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.setNome("Isaac");
        aluno.setCurso("Informática");
        aluno.setSexo("Masculino");
        aluno.setIdade(17);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Robson");
        funcionario.setIdade(24);
        funcionario.setSexo("Masculino");
        funcionario.setSetor("TI");

        Professor professor = new Professor();
        professor.setNome("Jalyson");
        professor.setSexo("Feminino");
        professor.setIdade(45);
        professor.setEspecialidade("Analista de dados");
        professor.setSalario(1300.45f);
        professor.receberAumento(200f);
    }
}
