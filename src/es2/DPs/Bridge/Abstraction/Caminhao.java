package es2.DPs.Bridge.Abstraction;

import es2.DPs.Bridge.Implementation.Transporte;

public class Caminhao extends Veiculo {

    public Caminhao(String marca, Transporte transporte) {
        super(marca, transporte);
    }

    @Override
    public void realizarAtividade() {
        System.out.print(" Caminhão " + marca + ": ");
        this.transporte.transportar();
    }
}
