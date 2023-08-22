import java.util.Random;

public class Ataques {
    public int[] requisitos = new int[4];
    public double dano;
    public int gasto;
    public String tipo;
    public String nome;

    public Ataques(double dano, int gasto, int forca, int vigor, int inteligencia, int conhecimento, String tipo, String nome)
    {
        this.dano = dano;
        this.gasto = gasto;
        this.tipo = tipo;
        this.nome = nome;
        this.requisitos[0] = forca;
        this.requisitos[1] = vigor;
        this.requisitos[2] = inteligencia;
        this.requisitos[3] = conhecimento;
    }
    public void AtaqueInimigo(Inimigos x, Protagonista y) {
        if (tipo.equals("Magia")) {
            if (y.mana_atual - gasto >= 0 && x.vida) {
                float chances = x.esquiva * 10;
                Random rnd = new Random();

                if (rnd.nextInt(1, 101) <= chances) {
                    System.out.println(y.nome + " desferiu " + nome + " em " + x.nome + ", mas ele desviou");
                    y.mana_atual -= gasto;
                } else {
                    System.out.println(y.nome + " desferiu um " + nome + " em " + x.nome + ", causando " +
                            (y.dano + y.dano * dano) + " de Dano");

                    x.vida_atual = x.vida_atual - (int) (y.dano + y.dano * dano);

                    y.mana_atual -= gasto;

                    if (x.vida_atual <= 0) {
                        x.vida_atual = 0;
                        x.verificarVida(y);
                    }
                }
            } else {
                if (y.mana_atual - gasto <= 0) {
                    System.out.println("Seu ataque falhou, mana insuficiente");
                } else if (!x.vida) {
                    System.out.println("O inimigo já foi derrotado.");
                }
            }
        } else if (tipo.equals("Físico")) {
            if (y.estamina_atual - gasto >= 0 && x.vida) {
                float chances = x.esquiva * 10;
                Random rnd = new Random();

                if (rnd.nextInt(1, 101) <= chances) {
                    System.out.println(y.nome + " desferiu " + nome + " em " + x.nome + ", mas ele desviou");

                    y.estamina_atual -= gasto;
                } else {
                    System.out.println(y.nome + " desferiu um " + nome + " em " + x.nome + ", causando " +
                            (y.dano + y.dano * dano) + " de Dano");

                    x.vida_atual = x.vida_atual - (int) (y.dano + y.dano * dano);

                    y.estamina_atual -= gasto;

                    if (x.vida_atual <= 0) {
                        x.vida_atual = 0;
                        x.verificarVida(y);
                    }
                }
            } else {
                if (y.estamina_atual - gasto <= 0) {
                    System.out.println("Seu ataque falhou, estamina insuficiente");
                } else if (!x.vida) {
                    System.out.println("O inimigo já foi derrotado.");
                }
            }
        }
    }
    public void AtaqueChefes(Chefes x, Protagonista y) {
        if (tipo.equals("Magia")) {
            if (y.mana_atual - gasto >= 0 && x.vida) {
                float chances = x.esquiva * 10;
                Random rnd = new Random();

                if (rnd.nextInt(1, 101) <= chances) {
                    System.out.println(y.nome + " desferiu " + nome + " em " + x.nome + ", mas ele desviou");

                    y.mana_atual -= gasto;
                } else {
                    System.out.println(y.nome + " desferiu um " + nome + " em " + x.nome + ", causando " +
                            (y.dano + y.dano * dano) + " de Dano");

                    x.vida_atual = x.vida_atual - ((int) (y.dano + y.dano * dano) - x.defesa);

                    y.mana_atual -= gasto;

                    if (x.vida_atual <= 0) {
                        x.vida_atual = 0;
                        x.verificarVida(y);
                    }
                }
            } else {
                if (y.mana_atual - gasto <= 0) {
                    System.out.println("Seu ataque falhou, mana insuficiente");
                } else if (!x.vida) {
                    System.out.println("O inimigo já foi derrotado.");
                }
            }
        } else if (tipo.equals("Físico")) {
            if (y.estamina_atual - gasto >= 0 && x.vida) {
                float chances = x.esquiva * 10;
                Random rnd = new Random();

                if (rnd.nextInt(1, 101) <= chances) {
                    System.out.println(y.nome + " desferiu " + nome + " em " + x.nome + ", mas ele desviou");

                    y.estamina_atual -= gasto;
                } else {
                    System.out.println(y.nome + " desferiu um " + nome + " em " + x.nome + ", causando " +
                            (y.dano + y.dano * dano) + " de Dano");

                    x.vida_atual = x.vida_atual - ((int) (y.dano + y.dano * dano) - x.defesa);

                    y.estamina_atual -= gasto;

                    if (x.vida_atual <= 0) {
                        x.vida_atual = 0;
                        x.verificarVida(y);
                    }
                }
            } else {
                if (y.estamina_atual - gasto <= 0) {
                    System.out.println("Seu ataque falhou, estamina insuficiente");
                } else if (!x.vida) {
                    System.out.println("O inimigo já foi derrotado.");
                }
            }
        }
    }

    public void AtaqueProtagonista(Protagonista x, Chefes y) {
        this.dano = dano;
        this.gasto = gasto;
        this.requisitos = requisitos;
        this.tipo = tipo;

        if (tipo.equals("Magia")) {
            if (y.mana_atual - gasto >= 0 && x.vivo) {
                float chances = x.esquiva * 10;
                Random rnd = new Random();

                if (rnd.nextInt(1, 101) <= chances) {
                    System.out.println(y.nome + " desferiu " + nome + " em " + x.nome + ", mas ele desviou");
                    y.mana_atual -= gasto;
                } else {
                    System.out.println(y.nome + " desferiu um " + nome + " em " + x.nome + ", causando " +
                            (y.dano + y.dano * dano) + " de Dano");

                    x.vida_atual = x.vida_atual - ((int) (y.dano + y.dano * dano) - x.defesa);

                    y.mana_atual -= gasto;

                    if (x.vida_atual <= 0) {
                        x.vida_atual = 0;
                        x.verificarVida();
                    }
                }
            } else {
                if (y.mana_atual - gasto <= 0) {
                    System.out.println("Seu ataque falhou, mana insuficiente");
                } else if (!x.vivo) {
                    System.out.println("O inimigo já foi derrotado.");
                }
            }
        } else if (tipo.equals("Físico")) {
            if (y.estamina_atual - gasto >= 0 && x.vivo) {
                float chances = x.esquiva * 10;
                Random rnd = new Random();

                if (rnd.nextInt(1, 101) <= chances) {
                    System.out.println(y.nome + " desferiu " + nome + " em " + x.nome + ", mas ele desviou");
                    y.estamina_atual -= gasto;
                } else {
                    System.out.println(y.nome + " desferiu um " + nome + " em " + x.nome + ", causando " +
                            (y.dano + y.dano * dano) + " de Dano");

                    x.vida_atual = x.vida_atual - ((int) (y.dano + y.dano * dano) - x.defesa);

                    y.estamina_atual -= gasto;

                    if (x.vida_atual <= 0) {
                        x.vida_atual = 0;
                        x.verificarVida();
                    }
                }
            } else {
                if (y.estamina_atual - gasto <= 0) {
                    System.out.println("Seu ataque falhou, estamina insuficiente");
                } else if (!x.vivo) {
                    System.out.println("O inimigo já foi derrotado.");
                }
            }
        }
    }

}
