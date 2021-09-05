package ferramentas;

public class MinhasFerramentas {

    
 public static void limparTela() {
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
