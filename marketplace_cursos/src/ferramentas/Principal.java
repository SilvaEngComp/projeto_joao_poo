package ferramentas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Cursos.Curso;
import excecoes.MenuException;

public class Principal {

    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    ArrayList<Menu> menu = new ArrayList<Menu>();
    private String erro="";

    //Método estático que lê o arquivo csv com os cursos para inicilizar o sistema
    public void inicialize() {
        this.cursos = Curso.carregaCursos();
        this.menu = Menu.carregarMenu();

        this.showMenu();
    }


    private void showMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (this.erro != "") {
                System.out.println(this.erro);
                this.erro = "";
            }


            System.out.println("Escolha uma opção: ");

            for (int i = 0; i < this.menu.size(); i++) {
                System.out.println(this.menu.get(i).toString());
            }


            int opcao = Integer.parseInt(sc.nextLine());
            MinhasFerramentas.limparTela();

            if ((opcao = MenuException.check(this.menu, opcao)) < 0) {
                this.erro = "Essa opção não existe. Tente outra \n";
                continue;
            }
            
            if (opcao == 4) {
                break;
            } else {
             this.showSubMenu(opcao);
            }
        }

        System.out.println("Sistema encerrado! Obrigado pela preferência. Volte sempre...");
        sc.close();
    }
    
   

    private void showSubMenu(int op) {
        Scanner sc = new Scanner(System.in);
        while (true) {
             if (this.erro != "") {
                System.out.println(this.erro);
                this.erro = "";
            }
        System.out.println(this.menu.get(op).getTitulo()+"\n");
        System.out.println("Escolha uma opção: ");

           var submenu = this.menu.get(op).getSubMenu();
              for (int i = 0; i < submenu.size(); i++) {
                System.out.println(submenu.get(i).toString());
            }
            int opcao = Integer.parseInt(sc.nextLine());
                MinhasFerramentas.limparTela();
            
                if ((opcao = MenuException.check(submenu, opcao)) < 0) {
                this.erro = "Essa opção não existe. Tente outra";
                continue;
            }
            if (opcao == 4) {
                break;
            } else {

            }
            

        }
    }
   

}