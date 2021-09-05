package ferramentas;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    private String codigo;
    private String titulo;
    private ArrayList<Menu> submenu = new ArrayList<Menu>();

    public Menu(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public static int buscarPorCodigo(int codigo, ArrayList<Menu> menu) {
           
        for (int i = 0; i < menu.size(); i++) {
            if (codigo == Integer.parseInt(menu.get(i).getCodigo())) {
                return i;
            }
        }

        return -1;
    }

     public static ArrayList<Menu> carregarMenu() {
          File csv = new File("../arquivos/menu.csv");
        ArrayList<Menu> menuPrincipal = new ArrayList<Menu>();
        try {
            String linha;
            String[] cols;
            Scanner leitor = new Scanner(csv);
            leitor.nextLine();
            while (leitor.hasNext()) {
                linha = leitor.nextLine();
                cols = linha.split(",");
                Menu menu = new Menu(cols[0], cols[1]);
                menuPrincipal.add(menu);
            }

        ArrayList<Menu> sub = new ArrayList<Menu>();

        leitor = new Scanner(csv);
            leitor.nextLine();
            int size = menuPrincipal.size()-2;
            while (leitor.hasNext()) {
                linha = leitor.nextLine();
                cols = linha.split(",");
                for (int i = 0; i < size; i++) {
                menuPrincipal.get(i).addSubmenu(new Menu(cols[2], cols[i+3]));
                }
            }

          

            leitor.close();
return menuPrincipal;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String toString() {
        String menu = this.codigo + " - " + this.titulo;
        return menu;
    }

    public void addSubmenu(Menu submenu) {
        this.submenu.add(submenu);
    }
    
    public ArrayList<Menu> getSubMenu() {
        return this.submenu;
    }

    /**
     * @return String return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return ArrayList<Menu> return the submenu
     */
    public ArrayList<Menu> getSubmenu() {
        return submenu;
    }

    /**
     * @param submenu the submenu to set
     */
    public void setSubmenu(ArrayList<Menu> submenu) {
        this.submenu = submenu;
    }

}
