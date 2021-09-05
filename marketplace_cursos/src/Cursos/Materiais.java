package Cursos;

import java.util.ArrayList;

public class Materiais {
    private String name;
    private ArrayList<Frete> fretes;

    public void constructor(String name) {
        this.name = name;
    }

   

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    /**
     * @return ArrayList<Frete> return the frete
     */
    public ArrayList<Frete> getFrete() {
        return fretes;
    }

    /**
     * @param frete the frete to set
     */
    public void addFrete(Frete frete) {
        this.fretes.add(frete);
    } /**
     * @param frete the frete to set
     */
    public void removeFrete(Frete frete) {
        this.fretes.remove(frete);
    }

}
