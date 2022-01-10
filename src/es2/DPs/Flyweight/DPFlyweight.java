package es2.DPs.Flyweight;

import es2.DPs.Categorias;
import es2.DPs.DesignPattern;
import es2.DPs.Flyweight.src.CounterStrike;

public class DPFlyweight implements DesignPattern {
    @Override
    public String getName() {
        return "Flyweight";
    }

    @Override
    public String getCategoria() {
        return Categorias.STRUCTURAL;
    }

    @Override
    public String getDescription() {
        return "O padrão Flyweight é voltado para um uso mais eficaz e enxuto de memória, \n" +
                " aplicando conceitos que reaproveitem o uso de volume de dados em tempo \n" +
                " de execução. Isso é feito com a ideia do uso de atributos intrínsecos, \n" +
                " que podem ser utilizados por mais de um objeto.";
    }

    @Override
    public void runExample() {
        CounterStrike.run();
    }
}
