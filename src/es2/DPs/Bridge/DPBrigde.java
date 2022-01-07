package es2.DPs.Bridge;

import es2.DPs.DesignPattern;
import es2.DPs.Bridge.Abstraction.Caminhao;
import es2.DPs.Bridge.Abstraction.Onibus;
import es2.DPs.Bridge.Abstraction.Veiculo;
import es2.DPs.Bridge.Implementation.Cargas;
import es2.DPs.Bridge.Implementation.Pessoas;

public class DPBrigde implements DesignPattern {
    @Override
    public String getName() {
        return "Bridge";
    }

    @Override
    public String getDescription() {
        return " - Explicacao Breve - ";
    }

    @Override
    public void runExample() {
        Veiculo caminhao = new Caminhao("Scania", new Cargas());
        caminhao.realizarAtividade();

        Veiculo onibus = new Onibus("Mercedes", new Pessoas());
        onibus.realizarAtividade();
    }
}
