package es2.DPs.Composite;

import es2.DPs.Categorias;
import es2.DPs.Composite.composite.Caixa;
import es2.DPs.Composite.composite.Item;
import es2.DPs.Composite.composite.Produto;
import es2.DPs.DesignPattern;

import java.util.ArrayList;

public class DPComposite implements DesignPattern {
    @Override
    public String getName() {
        return "Composite";
    }

    @Override
    public String getCategoria() {
        return Categorias.STRUCTURAL;
    }

    @Override
    public String getDescription() {
        return "O padrão Composite permite a criação de um formato onde \n" +
                " é possível compor objetos em uma estrutura de árvore e \n" +
                " utilizar essa árvore como se fosse um objeto. Esse padrão \n" +
                " se faz muito útil para representações onde uma classe estabelece \n" +
                " dependências sobre as 'micro classes' que compõem ela. ";
    }

    @Override
    public void runExample() {
        Caixa caixaMaster = new Caixa(new ArrayList<Item>());

        caixaMaster.addItem(new Produto("Clean Code: A Handbook of Agile Software Craftsmanship", 202.71));

        Caixa caixaSmartphones = new Caixa(new ArrayList<Item>());
        caixaSmartphones.addItem(new Produto("Samsung Galaxy S21 Ultra 5G", 6191.10));
        caixaSmartphones.addItem(new Produto("Samsung Galaxy S20 FE", 2189));
        caixaSmartphones.addItem(new Produto("iPhone 13", 7599));
        caixaSmartphones.addItem(new Produto("iPhone 13 mini", 6599));
        caixaMaster.addItem(caixaSmartphones);

        Caixa caixaNotebooks = new Caixa(new ArrayList<Item>());
        caixaNotebooks.addItem(new Produto("Acer Nitro AN515-44-R5YZ", 5499));
        caixaNotebooks.addItem(new Produto("Dell G15", 5301));
        caixaMaster.addItem(caixaNotebooks);

        Caixa caixaFerramentas = new Caixa(new ArrayList<Item>());
        caixaFerramentas.addItem(new Produto("Martelo de Unha 25mm", 37.30));
        caixaFerramentas.addItem(new Produto("Trena 5m", 17.10));
        caixaFerramentas.addItem(new Produto("Alicate 7", 25));
        caixaFerramentas.addItem(new Produto("Chave de Fenda Ponta Cruzada 1/8x6 Polegadas", 5.90));
        caixaMaster.addItem(caixaFerramentas);

        System.out.println("VALOR TOTAL = " + caixaMaster.calcularPrecoFinal());
    }
}

