import Cursos.Curso;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\tOlá! Seja bem vindo à plataforma Aprendendo com João \nn");
    
        Curso curso = new Curso();

        curso.setNome("Design");

        System.out.println("Curso: "+curso.getNome());


    }
}
