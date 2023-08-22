import java.util.Random;

public class Inimigos extends AtributosInimigos {
    public String nome;
    public int nivel;

    public void bater(Protagonista x) {
        int vidaAtual = x.vida_atual;
        int diminuir = vidaAtual - dano;
        x.vida_atual -= diminuir;
    }

    public void verificarVida(Protagonista x) {
        if (vida_atual <= 0) {
            vida = false;
            x.xp_atual += nivel * 10;
        }
    }

    public Inimigos() {
        nome = "Inimigo";
        Random rnd = new Random();
        int Idclasse = rnd.nextInt(2) + 1;
        criar(Idclasse);
        nivelar();
    }

    public void status() {
        System.out.println("┌────────────────┐");
        System.out.println(" " + nome + "  | " + classe);
        System.out.println(" Nível " + nivel);
        System.out.println(" Vida " + vida_atual + "/" + vida_max);
        System.out.println("└────────────────┘");
    }

    private void nivelar() {
        Random rnd = new Random();
        nivel = rnd.nextInt(6) + 1;
        forca += nivel;
        constituicao += nivel;
        vida_max = constituicao * 5;
        vida_atual = vida_max;
        dano = forca * 3;
        tempo = (float) (velocidade * 0.05);
        esquiva = (float) (destreza * 0.5);
    }
}
