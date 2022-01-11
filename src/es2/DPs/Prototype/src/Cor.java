package es2.DPs.Prototype.src;

public abstract class Cor implements Cloneable{
    protected String colorName;

    public abstract void addColor();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
