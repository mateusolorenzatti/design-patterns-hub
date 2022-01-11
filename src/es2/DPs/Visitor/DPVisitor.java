package es2.DPs.Visitor;

import es2.DPs.Categorias;
import es2.DPs.DesignPattern;
import es2.DPs.Visitor.src.ArvoreBinaria;
import es2.DPs.Visitor.src.ExibirInOrderVisitor;
import es2.DPs.Visitor.src.ExibirPostOrderVisitor;
import es2.DPs.Visitor.src.ExibirPreOrdemVisitor;

public class DPVisitor implements DesignPattern {
	@Override
	public String getName() {
		return "Visitor";
	}

	@Override
	public String getCategoria() {
		return Categorias.BEHAVIORAL;
	}

	@Override
	public String getDescription() {
		return "O padrão Visitor permite que uma interação com vários objetos parecidos \n" +
				" seja feita de maneira mais prática ao mover a parte da lógica operacional \n" +
				" dos objetos para outra classe. Com o uso de uma interface Visitor, é possível \n" +
				" definir as ações que podem ser feitas quando um objeto é 'visitado'.";
	}

	@Override
	public void runExample() {
		ArvoreBinaria arvore = new ArvoreBinaria(7);

		arvore.inserir(45);
		arvore.inserir(30);
		arvore.inserir(15);
		arvore.inserir(6);
		arvore.inserir(3);
		arvore.inserir(60);

		System.out.println("ARVORE BINARIA EM ORDEM:");
		arvore.aceitarVisitante(new ExibirInOrderVisitor());

		System.out.println("ARVORE BINARIA EM PRE ORDEM:");
		arvore.aceitarVisitante(new ExibirPreOrdemVisitor());

		System.out.println("ARVORE BINARIA EM POS ORDEM:");
		arvore.aceitarVisitante(new ExibirPostOrderVisitor());
	}
}