package es2.DPs.Bridge;

import es2.DPs.Categorias;
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
    public String getCategoria() {
        return Categorias.STRUCTURAL;
    }

    @Override
    public String getDescription() {
        return "O padrão Bridge é útil para separarmos a parte da abstração da \n" +
                " implementação. Assim, a abstração se encarrega de definir os atributos \n" +
                " ações, ou recursos enquanto a implementação será chamada para realmente \n" +
                " realizar a ação desejada. A junção entre as duas partes é a ponte (bridge) \n" +
                " e pode ser movida de forma desacoplada graças ao uso da interface na \n" +
                " implementação.";
    }

    @Override
    public void runExample() {
        Veiculo caminhao = new Caminhao("Scania", new Cargas());
        caminhao.realizarAtividade();

        Veiculo onibus = new Onibus("Mercedes", new Pessoas());
        onibus.realizarAtividade();
    }
}
