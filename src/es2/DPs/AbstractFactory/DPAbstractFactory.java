package es2.DPs.AbstractFactory;

import es2.DPs.AbstractFactory.src.AbstractFactory;
import es2.DPs.AbstractFactory.src.FactoryProducer;
import es2.DPs.AbstractFactory.src.Veiculo;
import es2.DPs.Categorias;
import es2.DPs.DesignPattern;

public class DPAbstractFactory implements DesignPattern {
	@Override
	public String getName() {
		return "AbstractFactory";
	}

	@Override
	public String getCategoria() {
		return Categorias.CREATIONAL;
	}

	@Override
	public String getDescription() {
		return "A criação de objetos por meio de uma Fábrica (Factory) é uma boa prática \n" +
				" para se criar objetos de forma dinâmica. Para isso, o padrão Abstract Factory \n" +
				" serve como uma super fábrica, servindo para criar outras fábricas. Assim, uma \n" +
				" interface define um padrão a ser gerado e a relação entre os objetos, mas \n" +
				" sem especificar de forma explícita as classes usadas.";
	}

	@Override
	public void runExample() {
		AbstractFactory offRoadFactory = FactoryProducer.getFactory("OffRoad");

		Veiculo carro1 = offRoadFactory.getVeiculo("X");
		carro1.method();

		Veiculo carro2 = offRoadFactory.getVeiculo("Y");
		carro2.method();

		AbstractFactory streetFactory = FactoryProducer.getFactory("Street");

		Veiculo carro3 = streetFactory.getVeiculo("X");
		carro3.method();

		Veiculo carro4 = streetFactory.getVeiculo("Y");
		carro4.method();
	}
}
