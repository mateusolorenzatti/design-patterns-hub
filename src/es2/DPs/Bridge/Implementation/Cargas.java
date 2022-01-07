package es2.DPs.Bridge.Implementation;

public class Cargas implements Transporte {
    @Override
    public void transportar() {
        System.out.println("Veículo Transportando Cargas");
    }

    @Override
    public void descricaoTransporte() {
        System.out.println("Veículo que Transporta Cargas");
    }
}