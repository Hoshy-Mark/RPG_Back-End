import java.util.Random;

public class Chefes extends Atributos {
    public String nome;
    public String classe;
    public String raca;
    public boolean vida = true;
    public int nivel;

    public void verificarVida(Protagonista x) {
        if (vida_atual <= 0) {
            vida = false;
            x.xp_atual += nivel * 10;
        }
    }

    public Chefes() {
        System.out.println("Digite o seu Nome: ");
        nome = "Chefes";

        Random rnd = new Random();
        int escolha = rnd.nextInt(5) + 1;
        int escolha2 = rnd.nextInt(5) + 1;

        criar(escolha, escolha2);
        nivelar();
    }

    private void nivelar() {
        Random rnd = new Random();
        nivel = rnd.nextInt(16) + 5;

        forca += nivel;
        velocidade += nivel;
        vigor += nivel;
        constituicao += nivel;
        destreza += nivel;
        carisma += nivel;
        inteligencia += nivel;
        conhecimento += nivel;
        vida_max = constituicao * 5;
        estamina_max = vigor * 5;
        mana_max = inteligencia * 5;
        vida_atual = vida_max;
        estamina_atual = estamina_max;
        mana_atual = mana_max;
        dano = forca * 3;
        tempo = (float) (velocidade * 0.05);
        esquiva = (float) (destreza * 0.5);
        labia = (float) (carisma * 0.7);
    }

    public void status() {
        System.out.println("┌────────────────────────────┐");
        System.out.println(nome + " | Nível " + nivel);
        System.out.println(" Vida " + vida_atual + "/" + vida_max);
        System.out.println(" Estamina " + estamina_atual + "/" + estamina_max);
        System.out.println(" Mana " + mana_atual + "/" + mana_max);
        System.out.println("└────────────────────────────┘");
    }

    public void mostrarAtributos() {
        System.out.println("┌────────────────────┐");
        System.out.println(" Atributos do " + nome);
        System.out.println(" Força = " + forca);
        System.out.println(" Velocidade = " + velocidade);
        System.out.println(" Vigor = " + vigor);
        System.out.println(" Constituição = " + constituicao);
        System.out.println(" Destreza = " + destreza);
        System.out.println(" Carisma = " + carisma);
        System.out.println(" Inteligencia = " + inteligencia);
        System.out.println(" Conhecimento = " + conhecimento);
        System.out.println(" Dano = " + dano);
        System.out.println("└────────────────────┘");
    }
}
