package es2.DPs.Prototype;

import es2.DPs.Categorias;
import es2.DPs.DesignPattern;
import es2.DPs.Prototype.src.LojaDeCores;

public class DPPrototype implements DesignPattern {
    @Override
    public String getName() {
        return "Prototype";
    }

    @Override
    public String getCategoria() {
        return Categorias.CREATIONAL;
    }

    @Override
    public String getDescription() {
        return "O padrão Prototype auxilia na criação de objetos escondendo a complexidade \n" +
                " de criar um objeto, entragando um clone no lugar. Assim, baseado nesse \n" +
                " clone recebido, a aplicação cliente não tem a necessidade de entender a \n" +
                " complexidade da classe utilizada. Basta apenas alterar os atributos como \n" +
                " achar necessário.";
    }

    @Override
    public void runExample() {
        System.out.println(" Exemplo baseado na página Geeks for Geeks");
        System.out.println(" Disponível em: https://www.geeksforgeeks.org/prototype-design-pattern/ \n");

        LojaDeCores.getColor("azul").addColor();
        LojaDeCores.getColor("vermelho").addColor();
        LojaDeCores.getColor("vermelho").addColor();
        LojaDeCores.getColor("azul").addColor();
    }
}
