
// COMPOSITE (CONT�INER)

// A classe Caixa implementa a interface Item, representando um Produto composto.
// Um objeto Caixa pode conter Produtos ou at� mesmo outras Caixas contendo Produtos.

package es2.DPs.Composite.composite;

import java.util.List;

public class Caixa implements Item {
	// Lista para armazenar refer�ncias aos subelementos. 
	// Armazena tanto Folha como Cont�iner, por isso deve ser declarado com um tipo de interface Componente.
	private List<Item> itens;
	
	public Caixa(List<Item> itens) {
		this.itens = itens;
	}
	
	public void addItem(Item item) {
		this.itens.add(item);
	}
	
	public void removeItem(Item item) {
		this.itens.remove(item);
	}

	// Percorre recursivamente todos os filhos, coletando e somando seus resultados. 
	// Como os filhos do Cont�iner passam essas chamadas para seus pr�prios filhos e assim em diante, 
	// toda a �rvore de objetos � percorrida como resultado.
	@Override
	public double calcularPrecoFinal() {
		double precoFinal = 0;
		
		for (Item item : itens) {
			precoFinal += item.calcularPrecoFinal();
		}
		
		return precoFinal;
	}
}

