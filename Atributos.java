import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class Atributos {

    public String Classe;
    public String Raca;
    public int forca;
    public int velocidade;
    public int vigor;
    public int constituicao;
    public int destreza;
    public int carisma;
    public int inteligencia;
    public int conhecimento;
    public int vida_max;
    public int estamina_max;
    public int mana_max;
    public int vida_atual;
    public int estamina_atual;
    public int mana_atual;
    public int defesa;
    public int dano;
    public float tempo;
    public float esquiva;
    public float labia;

    public List<Ataques> Magias = new ArrayList<Ataques>();
    public List<Ataques> Tecnicas = new ArrayList<Ataques>();
    public List<Ataques> Transformacao = new ArrayList<Ataques>();
    public Equipamentos[] Equipados = new Equipamentos[6];
    public String[] Classes = {"Espadachim", "Mago", "Ladrão", "Barbaro", "Arqueiro"};
    public String[] Racas = {"Humano", "Elfo", "Orc", "Vampiro", "Draconinano"};
    public int[][] AtributosClasse = new int[5][8];
    public int[][] AtributosRaca = new int[5][8];

    public void criar(int idRaca, int idClasse) {
        AtributosClasse[0][0] = 5;
        AtributosClasse[0][1] = 0;
        AtributosClasse[0][2] = 2;
        AtributosClasse[0][3] = 0;
        AtributosClasse[0][4] = 3;
        AtributosClasse[0][5] = 0;
        AtributosClasse[0][6] = 0;
        AtributosClasse[0][7] = 0;
        AtributosClasse[1][0] = 0;
        AtributosClasse[1][1] = 0;
        AtributosClasse[1][2] = 0;
        AtributosClasse[1][3] = 0;
        AtributosClasse[1][4] = 0;
        AtributosClasse[1][5] = 1;
        AtributosClasse[1][6] = 5;
        AtributosClasse[1][7] = 4;
        AtributosClasse[2][0] = 0;
        AtributosClasse[2][1] = 4;
        AtributosClasse[2][2] = 4;
        AtributosClasse[2][3] = 2;
        AtributosClasse[2][4] = 0;
        AtributosClasse[2][5] = 0;
        AtributosClasse[2][6] = 0;
        AtributosClasse[2][7] = 0;
        AtributosClasse[3][0] = 6;
        AtributosClasse[3][1] = 0;
        AtributosClasse[3][2] = 2;
        AtributosClasse[3][3] = 3;
        AtributosClasse[3][4] = 0;
        AtributosClasse[3][5] = 0;
        AtributosClasse[3][6] = 0;
        AtributosClasse[3][7] = 0;
        AtributosClasse[4][0] = 0;
        AtributosClasse[4][1] = 3;
        AtributosClasse[4][2] = 3;
        AtributosClasse[4][3] = 0;
        AtributosClasse[4][4] = 0;
        AtributosClasse[4][5] = 4;
        AtributosClasse[4][6] = 0;
        AtributosClasse[4][7] = 0;

        AtributosRaca[0][0] = 5;
        AtributosRaca[0][1] = 3;
        AtributosRaca[0][2] = 5;
        AtributosRaca[0][3] = 4;
        AtributosRaca[0][4] = 6;
        AtributosRaca[0][5] = 5;
        AtributosRaca[0][6] = 2;
        AtributosRaca[0][7] = 1;
        AtributosRaca[1][0] = 4;
        AtributosRaca[1][1] = 5;
        AtributosRaca[1][2] = 3;
        AtributosRaca[1][3] = 3;
        AtributosRaca[1][4] = 7;
        AtributosRaca[1][5] = 2;
        AtributosRaca[1][6] = 4;
        AtributosRaca[1][7] = 2;
        AtributosRaca[2][0] = 10;
        AtributosRaca[2][1] = 3;
        AtributosRaca[2][2] = 5;
        AtributosRaca[2][3] = 6;
        AtributosRaca[2][4] = 2;
        AtributosRaca[2][5] = 2;
        AtributosRaca[2][6] = 1;
        AtributosRaca[2][7] = 1;
        AtributosRaca[3][0] = 5;
        AtributosRaca[3][1] = 5;
        AtributosRaca[3][2] = 5;
        AtributosRaca[3][3] = 3;
        AtributosRaca[3][4] = 5;
        AtributosRaca[3][5] = 1;
        AtributosRaca[3][6] = 3;
        AtributosRaca[3][7] = 3;
        AtributosRaca[4][0] = 5;
        AtributosRaca[4][1] = 2;
        AtributosRaca[4][2] = 2;
        AtributosRaca[4][3] = 9;
        AtributosRaca[4][4] = 3;
        AtributosRaca[4][5] = 3;
        AtributosRaca[4][6] = 2;
        AtributosRaca[4][7] = 4;

        Classe = Classes[idClasse];
        Raca = Racas[idRaca];
        forca = AtributosRaca[idRaca][0] + AtributosClasse[idClasse][0];
        velocidade = AtributosRaca[idRaca][1] + AtributosClasse[idClasse][1];
        vigor = AtributosRaca[idRaca][2] + AtributosClasse[idClasse][2];
        constituicao = AtributosRaca[idRaca][3] + AtributosClasse[idClasse][3];
        destreza = AtributosRaca[idRaca][4] + AtributosClasse[idClasse][4];
        carisma = AtributosRaca[idRaca][5] + AtributosClasse[idClasse][5];
        inteligencia = AtributosRaca[idRaca][6] + AtributosClasse[idClasse][6];
        conhecimento = AtributosRaca[idRaca][7] + AtributosClasse[idClasse][7];

        estamina_max = vigor * 5;
        mana_max = inteligencia * 5;
        estamina_atual = estamina_max;
        mana_atual = mana_max;
        vida_max = constituicao * 5;
        vida_atual = vida_max;
        dano = forca * 3;
        tempo = (float) (velocidade * 0.05);
        esquiva = (float) (destreza * 0.5);
        labia = (float) (carisma * 0.7);

        Map<Integer, Equipamentos> iniciais = new HashMap<Integer, Equipamentos>() {{
            put(0, new Equipamentos(0, 3, "Manopla", "Luvas de Couro"));
            put(1, new Equipamentos(0, 3, "Arma", "Espada de Ferro"));
            put(2, new Equipamentos(6, 0, "Superior", "Peitoral de Couro"));
            put(3, new Equipamentos(3, 0, "Inferior", "Perneira de Aço"));
            put(4, new Equipamentos(4, 0, "Escudo", "Escudo de Madeira"));
            put(5, new Equipamentos(2, 0, "Capacete", "Capacete de Couro"));
            put(6, new Equipamentos(3, 10, "Arma", "Katana Longa"));
            put(7, new Equipamentos(2, 0, "Superior", "Kimono"));
            put(8, new Equipamentos(2, 0, "Superior", "Manto"));
            put(9, new Equipamentos(0, 5, "Arma", "Cajado de Carvalho"));
            put(10, new Equipamentos(0, 6, "Arma", "Adaga Curta"));
            put(11, new Equipamentos(0, 12, "Arma", "Machado Médio"));
            put(12, new Equipamentos(0, 8, "Arma", "Arco Curvo"));
            put(13, new Equipamentos(4, 0, "Inferior", "Calças de Couro"));
        }};

        if (idClasse == 0) {
            ColocarEquipamento(iniciais.get(0));
            ColocarEquipamento(iniciais.get(7));
            ColocarEquipamento(iniciais.get(6));
            AdicionarGolpe("Wind Cut");
        } else if (idClasse == 1) {
            ColocarEquipamento(iniciais.get(8));
            ColocarEquipamento(iniciais.get(9));
            AdicionarGolpe("Fire Ball");
        } else if (idClasse == 2) {
            ColocarEquipamento(iniciais.get(10));
            ColocarEquipamento(iniciais.get(2));
            ColocarEquipamento(iniciais.get(4));
            AdicionarGolpe("Blood Cut");
        } else if (idClasse == 3) {
            ColocarEquipamento(iniciais.get(11));
            ColocarEquipamento(iniciais.get(13));
            AdicionarGolpe("Rock Smash");
        } else if (idClasse == 4) {
            ColocarEquipamento(iniciais.get(12));
            ColocarEquipamento(iniciais.get(13));
            AdicionarGolpe("Accurate Shot");
        }
    }
    public void ColocarEquipamento(Equipamentos equipamento) {
        if (equipamento.Tipo.equals("Capacete")) {
            Equipados[0] = equipamento;
            defesa += Equipados[0].Defesa;
        } else if (equipamento.Tipo.equals("Superior")) {
            Equipados[1] = equipamento;
            defesa += Equipados[1].Defesa;
        } else if (equipamento.Tipo.equals("Inferior")) {
            Equipados[2] = equipamento;
            defesa += Equipados[2].Defesa;
        } else if (equipamento.Tipo.equals("Manopla")) {
            Equipados[3] = equipamento;
            dano += Equipados[3].Ataque;
        } else if (equipamento.Tipo.equals("Arma")) {
            Equipados[4] = equipamento;
            dano += Equipados[4].Ataque;
        } else if (equipamento.Tipo.equals("Escudo")) {
            Equipados[5] = equipamento;
            defesa += Equipados[5].Defesa;
        }
    }
    public void AdicionarGolpe(String NomeDoGolpe) {
        Movesets x = new Movesets();

        if (x.listaDeAtaques.containsKey(NomeDoGolpe)) {
            if (x.listaDeAtaques.get(NomeDoGolpe).tipo.equals("Magia")) {
                if (x.listaDeAtaques.get(NomeDoGolpe).requisitos[3] <= conhecimento &&
                        x.listaDeAtaques.get(NomeDoGolpe).requisitos[2] <= inteligencia) {
                    Magias.add(x.listaDeAtaques.get(NomeDoGolpe));
                } else {
                    System.out.println("Inteligência ou Conhecimento insuficiente");
                }
            } else if (x.listaDeAtaques.get(NomeDoGolpe).tipo.equals("Físico")) {
                if (x.listaDeAtaques.get(NomeDoGolpe).requisitos[1] <= vigor &&
                        x.listaDeAtaques.get(NomeDoGolpe).requisitos[0] <= forca) {
                    Tecnicas.add(x.listaDeAtaques.get(NomeDoGolpe));
                } else {
                    System.out.println("Vigor ou Força insuficiente");
                }
            }
        } else {
            System.out.println("Falha ao Adicionar, esse golpe não existe.");
        }
    }

}