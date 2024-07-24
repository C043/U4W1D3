package Es2;

import static java.lang.Integer.parseInt;

public class Chiamata {
    private int durata;
    private String numeroChiamato;

    public Chiamata(int durata, long numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = Long.toString(numeroChiamato);
    }

    public Chiamata(String durata, String numeroChiamato) {
        this.durata = parseInt(durata);
        this.numeroChiamato = numeroChiamato;
    }
}
