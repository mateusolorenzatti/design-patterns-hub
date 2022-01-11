package es2.DPs.Prototype.src;

public class Vermelho extends Cor{
    public void blackColor() {
        this.colorName = "vermelho";
    }

    @Override
    public void addColor() {
        System.out.println("Cor Vermelho adicionada");
    }
}
