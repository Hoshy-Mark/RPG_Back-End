import java.util.HashMap;
import java.util.Map;

public class Movesets {
    public Map<String, Ataques> listaDeAtaques = new HashMap<String, Ataques>() {{
        put("Wind Cut", new Ataques(1.3, 10, 4, 3, 0, 0, "Físico", "Wind Cut"));
        put("Shinning Flash", new Ataques(1.7, 20, 0, 0, 5, 6, "Magia", "Shinning Flash"));
        put("Fire Ball", new Ataques(1.3, 10, 0, 0, 2, 3, "Magia", "Fire Ball"));
        put("Blood Cut", new Ataques(1.2, 10, 2, 3, 0, 0, "Físico", "Blood Cut"));
        put("Rock Smash", new Ataques(1.5, 30, 5, 5, 0, 0, "Físico", "Rock Smash"));
        put("Accurate Shot", new Ataques(1.2, 10, 2, 2, 0, 0, "Físico", "Accurate Shot"));
    }};
}
