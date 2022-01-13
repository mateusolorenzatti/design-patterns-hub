package es2.DPs.State;

import es2.DPs.Categorias;
import es2.DPs.DesignPattern;
import es2.DPs.State.src.TVRemote;

public class DPState implements DesignPattern {
    @Override
    public String getName() {
        return "State";
    }

    @Override
    public String getCategoria() {
        return Categorias.BEHAVIORAL;
    }

    @Override
    public String getAuthor() {
        return "Vanderbil Lima";
    }

    @Override
    public String getDescription() {
        return "O padrão State estabelece um tipo de comportamente onde o objeto muda de \n" +
                " comportamento dependendo do seu estado atual. Pode ser implementado usando \n" +
                " um identificador que represente o estado da classe e uma estrutura condicional \n" +
                " que defina o comportamento levando em conta esse estado.";
    }

    @Override
    public void runExample() {
        TVRemote.run();
    }
}
