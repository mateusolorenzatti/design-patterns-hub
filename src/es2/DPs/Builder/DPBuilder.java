package es2.DPs.Builder;

import es2.DPs.Categorias;
import es2.DPs.DesignPattern;

import es2.DPs.Builder.builders.CarBuilder;
import es2.DPs.Builder.builders.CarManualBuilder;
import es2.DPs.Builder.cars.Car;
import es2.DPs.Builder.cars.Manual;
import es2.DPs.Builder.director.Director;

public class DPBuilder implements DesignPattern {
    @Override
    public String getName() {
        return "Builder";
    }

    @Override
    public String getCategoria() {
        return Categorias.CREATIONAL;
    }

    @Override
    public String getDescription() {
        return "O padrão Builder serve para criar objetos complexos compostos \n" +
                " por objetos simples, sendo criado em um passo a passo. Dessa forma \n" +
                " é possível criar um objeto e tendo itens opcionais ou parâmetos diferentes \n" +
                " e a complexidade dessa criação fica sob responsabilidade do Builder.";
    }

    @Override
    public void runExample() {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
