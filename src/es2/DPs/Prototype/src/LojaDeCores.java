package es2.DPs.Prototype.src;

import java.util.HashMap;
import java.util.Map;

public class LojaDeCores {
    private static Map<String, Cor> colorMap = new HashMap<String, Cor>();

    static {
        colorMap.put("azul", new Azul());
        colorMap.put("vermelho", new Vermelho());
    }

    public static Cor getColor(String colorName) {
        return (Cor) colorMap.get(colorName).clone();
    }
}
