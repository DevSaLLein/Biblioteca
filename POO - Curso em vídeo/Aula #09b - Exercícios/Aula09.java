public class Aula09 {
    public static void main(String[] args){

        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Isaac", 17, "masculino");
        pessoas[1] = new Pessoa("Robson", 24, "masculino");

        livros[0] = new Livro("A menina que roubava livros", "mariazinha", 200, pessoas[0]);
        livros[1] = new Livro("POO", "joao", 500, pessoas[1]);
        livros[2] = new Livro("JavaSpring", "jurema", 250, pessoas[0]);

        livros[0].folhear(200);
        System.out.println(livros[0].detalhes());
    }
}
