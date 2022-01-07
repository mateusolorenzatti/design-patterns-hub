package es2.DPs.AbstractFactory;

import es2.DPs.DesignPattern;

public class DPAbstractFactory implements DesignPattern {
	@Override
	public String getName() {
		return "AbstractFactory";
	}

	@Override
	public String getDescription() {
		return " - Breve Explicação - ";
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
