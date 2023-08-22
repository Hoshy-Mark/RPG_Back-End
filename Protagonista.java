import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Protagonista extends Atributos {
    public String nome;
    public String classe;
    public String raca;
    public boolean vivo = true;

    public int nivel = 1;
    public int xp_meta = 200;
    public int xp_atual = 0;
    public int atributos = 0;
    public Carteira carteira = new Carteira();

    public List<Equipamentos> mochila = new ArrayList<>();


    public Protagonista() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        nome = scanner.nextLine();

        System.out.println("Escolha sua Raça: ");
        System.out.println("0 - Humano");
        System.out.println("1 - Elfo ");
        System.out.println("2 - Orc ");
        System.out.println("3 - Vampiro ");
        System.out.println("4 - Draconiano");
        int escolha = scanner.nextInt();

        System.out.println("Escolha sua Classe: ");
        System.out.println("0 - Espadachim");
        System.out.println("1 - Mago ");
        System.out.println("2 - Ladrão ");
        System.out.println("3 - Barbaro ");
        System.out.println("4 - Arqueiro");
        int escolha2 = scanner.nextInt();

        criar(escolha, escolha2);
    }
    public void adicionarEquipamentos(int equipamento) {
        Ferreiro ferreiro = new Ferreiro();

        if (ferreiro.getFerreiro().containsKey(equipamento)) {
            mochila.add(ferreiro.getFerreiro().get(equipamento));
        }
    }
    public void RetirarEquipamento(Equipamentos equipamento) {
        if (equipamento.Tipo.equals("Capacete") && Equipados[0] != null) {
            defesa -= Equipados[0].Defesa;
            Equipados[0] = null;
        } else if (equipamento.Tipo.equals("Superior") && Equipados[1] != null) {
            defesa -= Equipados[1].Defesa;
            Equipados[1] = null;
        } else if (equipamento.Tipo.equals("Inferior") && Equipados[2] != null) {
            defesa -= Equipados[2].Defesa;
            Equipados[2] = null;
        } else if (equipamento.Tipo.equals("Manopla") && Equipados[3] != null) {
            dano -= Equipados[3].Ataque;
            Equipados[3] = null;
        } else if (equipamento.Tipo.equals("Arma") && Equipados[4] != null) {
            dano += Equipados[4].Ataque;
            Equipados[4] = null;
        } else if (equipamento.Tipo.equals("Escudo") && Equipados[5] != null) {
            defesa -= Equipados[5].Defesa;
            Equipados[5] = null;
        }
    }

    public void TrocarEquipamento(Equipamentos equipamento) {
        if (equipamento.Tipo.equals("Capacete")) {
            defesa -= Equipados[0].Defesa;
            Equipados[0] = null;
            Equipados[0] = equipamento;
            defesa += Equipados[0].Defesa;
        } else if (equipamento.Tipo.equals("Superior") && Equipados[1] != null) {
            defesa -= Equipados[1].Defesa;
            Equipados[1] = null;
            Equipados[1] = equipamento;
            defesa += Equipados[1].Defesa;
        } else if (equipamento.Tipo.equals("Inferior") && Equipados[2] != null) {
            defesa -= Equipados[2].Defesa;
            Equipados[2] = null;
            Equipados[2] = equipamento;
            defesa += Equipados[2].Defesa;
        } else if (equipamento.Tipo.equals("Manopla") && Equipados[3] != null) {
            dano -= Equipados[3].Ataque;
            Equipados[3] = null;
            Equipados[3] = equipamento;
            dano += Equipados[3].Ataque;
        } else if (equipamento.Tipo.equals("Arma") && Equipados[4] != null) {
            dano -= Equipados[4].Ataque;
            Equipados[4] = null;
            Equipados[4] = equipamento;
            dano += Equipados[4].Ataque;
        } else if (equipamento.Tipo.equals("Escudo") && Equipados[5] != null) {
            defesa -= Equipados[5].Defesa;
            Equipados[5] = null;
            Equipados[5] = equipamento;
            defesa += Equipados[5].Defesa;
        }
    }

    public void EquipamentosUsados() {
        System.out.println("  =================================");
        System.out.println("  >>>>>>>>>>  EQUIPAMENTOS  <<<<<<<<<<<< \n");

        try {
            System.out.println("  Capacete = [" + Equipados[0].Nome + "] \n");
        } catch (NullPointerException e) {
            System.out.println("  Capacete = [Vazio] \n");
        }

        try {
            System.out.println("  Peitoral = [" + Equipados[1].Nome + "] \n");
        } catch (NullPointerException e) {
            System.out.println("  Peitoral = [Vazio] \n");
        }

        try {
            System.out.println("  Perneira = [" + Equipados[2].Nome + "] \n");
        } catch (NullPointerException e) {
            System.out.println("  Perneira = [Vazio] \n");
        }

        try {
            System.out.println("  Manopla  = [" + Equipados[3].Nome + "] \n");
        } catch (NullPointerException e) {
            System.out.println("  Manopla  = [Vazio] \n");
        }

        try {
            System.out.println("  Arma     = [" + Equipados[4].Nome + "] \n");
        } catch (NullPointerException e) {
            System.out.println("  Arma     = [Vazio] \n");
        }

        try {
            System.out.println("  Escudo   = [" + Equipados[5].Nome + "] \n");
        } catch (NullPointerException e) {
            System.out.println("  Escudo   = [Vazio] \n");
        }

        System.out.println("\n  ================================");
    }

    public void VerificarDinheiro() {
        carteira.toString();
    }

    public void verificarVida() {
        if (vida_atual < 0) {
            vivo = false;
        }
    }

    public void verificarVidaInimigo(Inimigos x) {
        if (x.vida_atual < 0) {
            x.vida = false;
            xp_atual += x.nivel * 10;
        }
    }

    public void verificarVidaInimigo(Chefes x) {
        if (x.vida_atual < 0) {
            x.vida = false;
            xp_atual += x.nivel * 12;
        }
    }

    public void verificarNivel() {
        if (xp_atual >= xp_meta) {
            nivel += 1;
            xp_atual = xp_atual - xp_meta;
            atributos = 5;
            xp_meta += 100;
        }
    }
    public void distribuicao() {
        Scanner scanner = new Scanner(System.in);

        while (atributos > 0) {
            System.out.println("O que deseja Upar: ");
            System.out.println("1 - Força");
            System.out.println("2 - Velocidade ");
            System.out.println("3 - Vigor ");
            System.out.println("4 - Constituição ");
            System.out.println("5 - Destreza");
            System.out.println("6 - Carisma ");
            System.out.println("7 - Inteligência ");
            System.out.println("8 - Conhecimento");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Quanto deseja aumentar: ");
                int escolha2 = scanner.nextInt();
                if (escolha2 <= atributos && escolha2 > 0) {
                    forca += escolha2;
                    atributos -= escolha2;
                    atualizarStatus();
                    System.out.println("Sua força agora é: " + forca);
                } else {
                    System.out.println("Valor inválido");
                }
            } else if (escolha == 2) {
                System.out.println("Quanto deseja aumentar: ");
                int escolha2 = scanner.nextInt();
                if (escolha2 <= atributos && escolha2 > 0) {
                    velocidade += escolha2;
                    atributos -= escolha2;
                    atualizarStatus();
                } else {
                    System.out.println("Valor inválido");
                }
            } else if (escolha == 3) {
                System.out.println("Quanto deseja aumentar: ");
                int escolha2 = scanner.nextInt();
                if (escolha2 <= atributos && escolha2 > 0) {
                    vigor += escolha2;
                    atributos -= escolha2;
                    atualizarStatus();
                } else {
                    System.out.println("Valor inválido");
                }
            } else if (escolha == 4) {
                System.out.println("Quanto deseja aumentar: ");
                int escolha2 = scanner.nextInt();
                if (escolha2 <= atributos && escolha2 > 0) {
                    constituicao += escolha2;
                    atributos -= escolha2;
                    atualizarStatus();
                } else {
                    System.out.println("Valor inválido");
                }
            } else if (escolha == 5) {
                System.out.println("Quanto deseja aumentar: ");
                int escolha2 = scanner.nextInt();
                if (escolha2 <= atributos && escolha2 > 0) {
                    destreza += escolha2;
                    atributos -= escolha2;
                    atualizarStatus();
                } else {
                    System.out.println("Valor inválido");
                }
            } else if (escolha == 6) {
                System.out.println("Quanto deseja aumentar: ");
                int escolha2 = scanner.nextInt();
                if (escolha2 <= atributos && escolha2 > 0) {
                    carisma += escolha2;
                    atributos -= escolha2;
                    atualizarStatus();
                } else {
                    System.out.println("Valor inválido");
                }
            } else if (escolha == 7) {
                System.out.println("Quanto deseja aumentar: ");
                int escolha2 = scanner.nextInt();
                if (escolha2 <= atributos && escolha2 > 0) {
                    inteligencia += escolha2;
                    atributos -= escolha2;
                    atualizarStatus();
                } else {
                    System.out.println("Valor inválido");
                }
            } else if (escolha == 8) {
                System.out.println("Quanto deseja aumentar: ");
                int escolha2 = scanner.nextInt();
                if (escolha2 <= atributos && escolha2 > 0) {
                    conhecimento += escolha2;
                    atributos -= escolha2;
                    atualizarStatus();
                } else {
                    System.out.println("Valor inválido");
                }
            }
        }
    }

    public void mostrarAtributos() {
        System.out.println("┌────────────────────┐");
        System.out.println(" Atribtuos do " + nome);
        System.out.println(" Força = " + forca);
        System.out.println(" Velocidade = " + velocidade);
        System.out.println(" Vigor = " + vigor);
        System.out.println(" Constituição = " + constituicao);
        System.out.println(" Destreza = " + destreza);
        System.out.println(" Carisma = " + carisma);
        System.out.println(" Inteligencia = " + inteligencia);
        System.out.println(" Conhecimento = " + conhecimento);
        System.out.println(" Dano = " + dano);
        System.out.println(" Tempo = " + tempo);
        System.out.println(" Esquiva = " + esquiva);
        System.out.println(" Lábia = " + labia);
        System.out.println("└────────────────────┘");
    }

    public void status() {
        System.out.println("┌────────────────────────────┐");
        System.out.println(nome + "  | Nível " + nivel);
        System.out.println("Xp " + xp_atual + "/" + xp_meta);
        System.out.println("Vida " + vida_atual + "/" + vida_max);
        System.out.println("Estamina " + estamina_atual + "/" + estamina_max);
        System.out.println("Mana " + mana_atual + "/" + mana_max);
        VerificarDinheiro();
        System.out.println("└────────────────────────────┘");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("┌────────────────────────────┐\n");
        sb.append(" " + nome + "  | Nível " + nivel + "\n");
        sb.append(" " + Classe + "  |   " + Raca + "\n");
        sb.append(" Xp " + xp_atual + "/" + xp_meta + "\n");
        sb.append(" Vida " + vida_atual + "/" + vida_max + "\n");
        sb.append(" Estamina " + estamina_atual + "/" + estamina_max + "\n");
        sb.append(" Mana " + mana_atual + "/" + mana_max + "\n");
        sb.append("└────────────────────────────┘\n");
        sb.append("┌────────────────────┐\n");
        sb.append(" Atributos do " + nome + "\n");
        sb.append(" Força = " + forca + "\n");
        sb.append(" Velocidade = " + velocidade + "\n");
        sb.append(" Vigor = " + vigor + "\n");
        sb.append(" Constituição = " + constituicao + "\n");
        sb.append(" Destreza = " + destreza + "\n");
        sb.append(" Carisma = " + carisma + "\n");
        sb.append(" Inteligencia = " + inteligencia + "\n");
        sb.append(" Conhecimento = " + conhecimento + "\n");
        sb.append(" Dano = " + dano + "\n");
        sb.append(" Tempo = " + tempo + "\n");
        sb.append(" Esquiva = " + esquiva + "\n");
        sb.append(" Lábia = " + labia + "\n");
        sb.append("└────────────────────┘\n");
        sb.append(ListaDeMoveset());
        return sb.toString();
    }

    public void atualizarStatus() {
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

    private String ListaDeMoveset() {
        StringBuilder sb = new StringBuilder();
        sb.append("  =================================\n");
        sb.append("           LISTA DE ATAQUES \n");
        sb.append("  >>>>>>>>>>MAGIAS<<<<<<<<<<<<  \n");
        for (int i = 0; i < Magias.size(); i++) {
            sb.append("  [ " + Magias.get(i).nome + " ] \n");
        }
        sb.append("\n  >>>>>>>>>TÉCNICAS<<<<<<<<<<<  \n");
        for (int i = 0; i < Tecnicas.size(); i++) {
            sb.append("  [ " + Tecnicas.get(i).nome + " ]\n");
        }
        sb.append("\n  ================================\n");
        return sb.toString();
    }

}