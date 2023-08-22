import java.util.HashMap;
import java.util.Map;

public class Carteira {
    private Map<String, Integer> dinheiro = new HashMap<>();

    public Carteira() {
        dinheiro.put("Diamante", 0);
        dinheiro.put("Ouro", 0);
        dinheiro.put("Prata", 0);
        dinheiro.put("Cobre", 0);
    }

    private boolean verificarDinheiro(int valor, String tipo) {
        return dinheiro.get(tipo) >= valor;
    }

    public void adicionar(int novoValor, String tipo) {
        if (novoValor > 0) {
            dinheiro.put(tipo, dinheiro.get(tipo) + novoValor);
        }
    }

    public boolean comprar(int valor, String tipo) {
        if (verificarDinheiro(valor, tipo)) {
            dinheiro.put(tipo, dinheiro.get(tipo) - valor);
            System.out.println("Compra bem Sucedida");
            return true;
        } else {
            System.out.println("Dinheiro Insuficiente");
            return false;
        }
    }

    public void mostrarDinheiro() {
        System.out.println(" ==========================");
        System.out.println(" Diamante = " + dinheiro.get("Diamante"));
        System.out.println(" Ouro     = " + dinheiro.get("Ouro"));
        System.out.println(" Prata    = " + dinheiro.get("Prata"));
        System.out.println(" Cobre    = " + dinheiro.get("Cobre"));
        System.out.println(" ==========================");
    }
}
