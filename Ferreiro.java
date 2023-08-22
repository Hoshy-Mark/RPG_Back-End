import java.util.HashMap;
import java.util.Map;

public class Ferreiro {
    private Map<Integer, Equipamentos> ferreiro = new HashMap<>();

    public Ferreiro() {
        ferreiro.put(0, new Equipamentos(0, 3, "Manopla", "Luvas de Couro"));
        ferreiro.put(1, new Equipamentos(0, 3, "Arma", "Espada de Ferro"));
        ferreiro.put(2, new Equipamentos(6, 0, "Superior", "Peitoral de Couro"));
        ferreiro.put(3, new Equipamentos(3, 0, "Inferior", "Perneira de Aço"));
        ferreiro.put(4, new Equipamentos(4, 0, "Escudo", "Escudo de Madeira"));
        ferreiro.put(5, new Equipamentos(2, 0, "Capacete", "Capacete de Couro"));
        ferreiro.put(6, new Equipamentos(3, 10, "Arma", "Katana Longa"));
        ferreiro.put(7, new Equipamentos(2, 0, "Superior", "Kimono"));
        ferreiro.put(8, new Equipamentos(2, 0, "Superior", "Manto"));
        ferreiro.put(9, new Equipamentos(0, 5, "Arma", "Cajado de Carvalho"));
        ferreiro.put(10, new Equipamentos(0, 6, "Arma", "Adaga Curta"));
        ferreiro.put(11, new Equipamentos(0, 12, "Arma", "Machado Médio"));
        ferreiro.put(12, new Equipamentos(0, 8, "Arma", "Arco Curvo"));
        ferreiro.put(13, new Equipamentos(4, 0, "Inferior", "Calças de Couro"));
    }

    public Map<Integer, Equipamentos> getFerreiro() {
        return ferreiro;
    }
}
