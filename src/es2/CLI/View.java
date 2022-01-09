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

        return  opt;
    }

    public void showWarning(String warning){
        System.out.println(" [ATENCAO]: " + warning );
    }

    public void showDesignPatternExemple(DesignPattern dp){
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
    }

    public void showClosingDialog() {
    }

    private void showDividingLine(){
        System.out.println(" -------------------------------------------------------------- ");
    }

}
