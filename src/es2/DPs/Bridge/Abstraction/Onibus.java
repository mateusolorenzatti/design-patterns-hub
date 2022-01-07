package es2.DPs.Bridge.Abstraction;

import es2.DPs.Bridge.Implementation.Transporte;

public class Onibus extends Veiculo {

    public Onibus(String marca, Transporte transporte) {
        super(marca, transporte);
    }

    @Override
    public void realizarAtividade() {
        System.out.print(" Ônibus " + marca + ": ");
        this.transporte.transportar();
    }
}