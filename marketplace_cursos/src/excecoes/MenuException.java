package excecoes;

import java.util.ArrayList;

import ferramentas.Menu;

public class MenuException {
    



    public static int check(ArrayList<Menu> menu, int opcao) {
        for (int i = 0; i < menu.size(); i++) {
            if (opcao == Integer.parseInt(menu.get(i).getCodigo())) {
                return i;
            }
        }

        return -1;
    }


}
