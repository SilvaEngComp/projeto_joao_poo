package Cursos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;
    private String descricao;
    private String tipo;
    private String modulo;
    private String duracao;
    private ArrayList<Materiais> materiais;
    
    public Curso() {
    }
 
    public void constructor() {
       
    }

    public void doArquivo(String linha) {
        var cols = linha.split(",");
        this.nome = cols[0];
        this.descricao = cols[1];
        this.tipo = cols[2];
        this.modulo = cols[3];
        this.duracao = cols[4];
        // this.materiais = cols[5];
    }
    

    public static Curso criarCurso() {
        Curso curso = new Curso();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do curso: ");
        curso.setNome(sc.nextLine()); 
        System.out.println("Digite a descrição do curso: ");
        curso.setDescricao(sc.nextLine());


        return curso;
    }

    
    public static ArrayList<Curso> carregaCursos() {
        File csv = new File("../arquivos/cursos.csv");
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        try {
            String linha;
            Scanner leitor = new Scanner(csv);
            leitor.nextLine();
            while (leitor.hasNext()) {
                linha = leitor.nextLine();
                Curso curso = new Curso();
                curso.doArquivo(linha);
                cursos.add(curso);
            }

            return cursos;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void ListarCursos(ArrayList<Curso> cursos) {
         for (int i = 0; i < cursos.size(); i++) {
                System.out.println(i+"º:"+cursos.get(i).toString()+"\n\n");
            }
    }
    
    public String toString() {
        return "\n nome: "+this.nome+
        ",\t\t\t\t\t\t\t\t\n descricao: "+this.descricao+
        ",\t\t\n tipo: "+this.descricao+
        ",\t\t\n  modulo: "+this.descricao+
            ",\t\t\n duracao: "+this.descricao+
        "";
    }
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return String return the modulo
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    /**
     * @return String return the duracao
     */
    public String getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    /**
     * @return Materiais[] return the materiais
     */
    public ArrayList<Materiais> getMateriais() {
        return materiais;
    }

    /**
     * @param materiais the materiais to set
     */
    public void addMateriais(Materiais material) {
        this.materiais.add(material);
    }
    /**
     * @param materiais the materiais to set
     */
    public void removeMateriais(Materiais material) {
        this.materiais.remove(material);
    }

}
