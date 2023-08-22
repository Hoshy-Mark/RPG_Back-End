public class Combate {
    public void comparacao(Chefes x, Protagonista y) {
        if (x.tempo > y.tempo) {
            if (x.tempo > y.tempo * 2) {
                // x.ataques.corteDoVento(x, y);

                if (apto(x, y)) {
                    // x.ataques.corteDoVento(x, y);
                    if (apto(x, y)) {
                        // y.ataques.corteDoVento(y, x);
                    }
                }

            } else {
                // x.ataques.corteDoVento(x, y);

                if (apto(x, y)) {
                    // y.ataques.corteDoVento(y, x);
                }
            }
        } else {
            if (y.tempo > x.tempo * 2) {
                // y.ataques.corteDoVento(y, x);
                if (apto(x, y)) {
                    // y.ataques.corteDoVento(y, x);
                    if (apto(x, y)) {
                        // x.ataques.corteDoVento(x, y);
                    }
                }
            } else {
                // y.ataques.corteDoVento(y, x);
                if (apto(x, y)) {
                    // x.ataques.corteDoVento(x, y);
                }
            }
        }
    }

    public boolean apto(Chefes x, Protagonista y) {
        if (x.vida && y.vivo) {
            return true;
        } else {
            return false;
        }
    }
}
