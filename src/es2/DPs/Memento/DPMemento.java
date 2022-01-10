package es2.DPs.Memento;

import es2.DPs.Categorias;
import es2.DPs.DesignPattern;
import es2.DPs.Memento.src.History;
import es2.DPs.Memento.src.Originator;

public class DPMemento implements DesignPattern {
	@Override
	public String getName() {
		return "Memento";
	}

	@Override
	public String getCategoria() {
		return Categorias.BEHAVIORAL;
	}

	@Override
	public String getDescription() {
		return "O padrão Memento estabelece um comportamento em que cada estado de um \n" +
				" objeto seja salvo e armazenado em versões passadas. Assim, se torna mais \n" +
				" fácil de retornar para um estado antigo do objeto e recuperar algo perdido, \n" +
				" por exemplo. O padrão é baseado por snapshots, reservando as exatas \n" +
				" características de um objeto naquele momento em que a captura foi feita.";
	}

	@Override
	public void runExample() {
		Originator originador = new Originator();
		History armazenador = new History();


		originador.setState("State #1");


		originador.setState("State #2");
		armazenador.saveState(originador.generateMemento());


		originador.setState("State #3");
		armazenador.saveState(originador.generateMemento());


		originador.setState("State #4");
		System.out.println("Current State: " + originador.getState());

		originador.setStateFromMemento(armazenador.getState(0));
		System.out.println("First saved State ----- " + originador.getState());

		originador.setStateFromMemento(armazenador.getState(1));
		System.out.println("Second saved State ----- " + originador.getState());
	}
}