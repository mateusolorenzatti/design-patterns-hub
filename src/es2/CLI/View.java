package es2.CLI;

import es2.DPs.DesignPattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class View {

    Scanner s;

    public View() {
        this.s = new Scanner(System.in);
    }

    public int showMenuOptions(ArrayList<DesignPattern> dpsList) throws IOException {
        int item = 1;
        int opt = 0;

        this.showDividingLine();
        System.out.println(" Escolha um dos Padrões de Projeto abaixo: ");
        for (DesignPattern dp : dpsList) {
            System.out.println(" [" + item + "] - " + dp.getName());
            item++;
        }
        System.out.println("\n [0] - Sair");
        System.out.println(" Sua opção: ");

        opt = s.nextInt();
        s.nextLine();

        return opt;
    }

    public void showWarning(String warning) {
        System.out.println(" [ATENCAO]: " + warning);
    }

    public void showDesignPatternExemple(DesignPattern dp) {
        this.showDividingLine();
        System.out.println(" >> Padrão: " + dp.getName());
        System.out.println(" >> Categoria: " + dp.getCategoria());
        System.out.println(" >> Descrição: " + dp.getDescription());
        System.out.print("\n");
        System.out.println(" >> Início do Exemplo \n");
        dp.runExample();
        System.out.println("\n >> Fim do Exemplo ");
    }

    public void showOpeningDialog() {
        this.showDividingLine();
        System.out.println("                   >> Design Patterns Hub << ");
        System.out.println("                   _             _           _");
        System.out.println("                __| |_ _        | |__  _   _| |__");
        System.out.println("               / _` | '_ \\ _____| '_ \\| | | | '_ \\ ");
        System.out.println("              | (_| | |_) |_____| | | | |_| | |_) |");
        System.out.println("               \\__,_| .__/      |_| |_|\\__,_|_.__/");
        System.out.println("                    |_|");
        System.out.println("");
        System.out.println(" >> Autor: Mateus Orlandin Lorenzatti");
        System.out.println(" >> Source: github.com/mateusolorenzatti/design-patterns-hub");
    }

    public void showClosingDialog() {
        this.showDividingLine();
        System.out.println(" >> Opção [0] escolhida, saindo do programa...");
        System.out.println(" >> Obrigado por utilizar!");
        System.out.println(" >> Esperamos que volte! ");
    }

    private void showDividingLine() {
        System.out.println(" -------------------------------------------------------------- ");
    }

}
