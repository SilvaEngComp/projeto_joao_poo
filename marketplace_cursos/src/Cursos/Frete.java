package Cursos;

public class Frete {
    private int codigo;
    private String empresa;
    private String prazo;
    private float valor;

    public void constructor() {
  
    }

    public void setFrete(int codigo, String empresa, String prazo, float valor) {
              this.codigo = codigo;
        this.empresa = empresa;
        this.prazo = prazo;
        this.valor = valor;
    }
}
