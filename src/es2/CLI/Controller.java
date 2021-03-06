package es2.CLI;

import es2.DPs.AbstractFactory.DPAbstractFactory;
import es2.DPs.Bridge.DPBrigde;
import es2.DPs.Builder.DPBuilder;
import es2.DPs.ChainOfResponsability.DPChainOfResponsability;
import es2.DPs.Composite.DPComposite;
import es2.DPs.DesignPattern;
import es2.DPs.Facade.DPFacade;
import es2.DPs.Flyweight.DPFlyweight;
import es2.DPs.Mediator.DPMediator;
import es2.DPs.Memento.DPMemento;
import es2.DPs.Prototype.DPPrototype;
import es2.DPs.Proxy.DPProxy;
import es2.DPs.State.DPState;
import es2.DPs.Visitor.DPVisitor;

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
        dpsList.add(new DPBuilder());
        dpsList.add(new DPChainOfResponsability());
        dpsList.add(new DPComposite());
        dpsList.add(new DPFacade());
        dpsList.add(new DPFlyweight());
        dpsList.add(new DPMediator());
        dpsList.add(new DPMemento());
        dpsList.add(new DPPrototype());
        dpsList.add(new DPProxy());
        dpsList.add(new DPState());
        dpsList.add(new DPVisitor());
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
