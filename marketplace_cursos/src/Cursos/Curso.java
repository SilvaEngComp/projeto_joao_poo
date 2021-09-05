package Cursos;

import java.util.ArrayList;
import java.util.Arrays;

public class Curso {
    private String nome;
    private String descricao;
    private String tipo;
    private String modulo;
    private String duracao;
    private ArrayList<Materiais> materiais;
    
    public Curso(String[] values) {
    }
    public void constructor(String[] parametros) {
        this.nome = parametros[0];
        this.descricao = parametros[1];
        this.tipo = parametros[2];
        this.modulo = parametros[3];
        this.duracao = parametros[4];
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
