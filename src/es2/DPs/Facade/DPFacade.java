package es2.DPs.Facade;

import es2.DPs.Categorias;
import es2.DPs.DesignPattern;
import es2.DPs.Facade.src.ComputadorFACADE;

public class DPFacade implements DesignPattern {
	@Override
	public String getName() {
		return "Facade";
	}

	@Override
	public String getCategoria() {
		return Categorias.STRUCTURAL;
	}

	@Override
	public String getAuthor() {
		return "Marcos Vinicius Chiele Damin";
	}

	@Override
	public String getDescription() {
		return "O padrão Facade estabelece uma estrutura de utilização da aplicação \n" +
				" ou bilbioteca de forma que todos os recursos e opções disponíveis \n" +
				" na aplicação ficam disponíveis na 'fachada' do programa. Toda a \n" +
				" complexidade das opções não precisam ser mostradas ao cliente, \n" +
				" tornando a utilização mais modular e prática." ;
	}

	@Override
	public void runExample() {
		ComputadorFACADE facade = new ComputadorFACADE();
		facade.Executar();
	}
}
