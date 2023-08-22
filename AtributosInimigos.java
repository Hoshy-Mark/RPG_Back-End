public class AtributosInimigos {
    public int forca;
    public String classe;
    public int Idclasse;
    public boolean vida = true;
    public int constituicao;
    public int vida_max;
    public int vida_atual;
    public int dano;
    public int velocidade;
    public int destreza;
    public float tempo;
    public float esquiva;
    public int[][] Atributos = new int[][] {
            {4, 5, 3, 3},
            {7, 4, 2, 2},
            {5, 5, 3, 2},
            {3, 3, 4, 5},
            {4, 8, 2, 1}
    };
    public String[] Classe = new String[] {"Arqueiro", "Barbaro", "Guerreiro", "Assassino", "Necromante"};

    public void criar(int id) {
        classe = Classe[id];
        forca = Atributos[id][0];
        constituicao = Atributos[id][1];
        velocidade = Atributos[id][2];
        destreza = Atributos[id][3];
        vida_max = constituicao * 5;
        vida_atual = vida_max;
        dano = forca * 3;
        tempo = (float) (velocidade * 0.05);
        esquiva = (float) (destreza * 0.5);
    }
}
