package Es2;

import static java.lang.Integer.parseInt;

public class Chiamata {
    private double durata;
    private String numeroChiamato;

    public Chiamata(double durata, long numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = Long.toString(numeroChiamato);
    }

    public Chiamata(String durata, String numeroChiamato) {
        this.durata = parseInt(durata);
        this.numeroChiamato = numeroChiamato;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "durata=" + durata + " minuti" +
                ", numeroChiamato='" + numeroChiamato + '\'' +
                '}';
    }
}
