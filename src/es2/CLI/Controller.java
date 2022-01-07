package es2.CLI;

import es2.DPs.AbstractFactory.DPAbstractFactory;
import es2.DPs.Bridge.DPBrigde;
import es2.DPs.DesignPattern;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    ArrayList<DesignPattern> dpsList;
    View view;

    public Controller() {
        dpsList = new ArrayList<DesignPattern>();
        view = new View();
    }

    public void initDpsList(){
        dpsList.add(new DPAbstractFactory());
        dpsList.add(new DPBrigde());
    }

    public void runCLI(){
        this.view.showOpeningDialog();

        this.initDpsList();

        int opc = 1;

        while (opc != 0){
            // Chama o método da view que retorna a opção escolhida
            try {
                opc = view.showMenuOptions(this.dpsList);
            } catch (IOException e) {
                this.view.showWarning("Caractere inválido!");
                continue;
            }

            // Confere se o valor inserido é válido
            if ( opc < 0 || opc > this.dpsList.size()) {
                this.view.showWarning("Opção Inválida! Tente novamente.");
                continue;
            }

            // Confere se foi digitado 0, se for termina o loop
            if ( opc == 0 ){ break; }

            // Tendo as verificações, segue com o exemplo escolhido
            this.view.showDesignPatternExemple(dpsList.get(opc - 1));
        }

        this.view.showClosingDialog();
    }
}
