public class Aula11 {
    public static void main(String[] args){

        Visitante visitante = new Visitante();
        visitante.setNome("Tayssa");
        visitante.setIdade(17);
        visitante.setSexo("Masculino");

        System.out.println(visitante.toString());

        Aluno aluno = new Aluno();
        aluno.setNome("Isaac");
        aluno.setMatricula(1);
        aluno.setIdade(17);
        aluno.setCurso("Informática");
        aluno.setSexo("Masculino");
        aluno.setNivelDePureza(100);
        aluno.setSexualidade("100% Hetero");
        aluno.setEleÉ("Perfeição");

        System.out.println(aluno.toString());

        Bolsista bolsista = new Bolsista();
        bolsista.setNome("Jennifer");
        bolsista.setIdade(17);
        bolsista.setSexualidade("Sapatão");
        bolsista.setQual("100% Passiva");
        bolsista.setSexo("Não-Binarie");
        bolsista.setCurso("Psicologia");
        bolsista.setMatricula(2);
        bolsista.setBolsa(12.5f);

        System.out.println(bolsista.toString());

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Jalyson");
        tecnico.setIdade(45);
        tecnico.setSexo("Masculino");
        tecnico.setRgProfissional(123);
        tecnico.setMatricula(100);
        tecnico.setCurso("Informática");

        System.out.println(tecnico.toString());

        Professor professor = new Professor();
        professor.setNome("Mario");
        professor.setSexo("Masculino");
        professor.setIdade(23);
        professor.setEspecialidade("Supervisor");
        professor.setSalario(500);
        professor.receberAumento(1500);

        System.out.println(professor.toString());

        System.out.println();

        visitante.fazerAniversario();
        aluno.fazerAniversario();
        bolsista.fazerAniversario();
        tecnico.fazerAniversario();
        professor.fazerAniversario();
    }
}
