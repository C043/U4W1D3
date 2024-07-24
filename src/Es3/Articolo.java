package Es3;

import java.util.Random;

public class Articolo {
    Random rand = new Random();
    private int codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int pezziDisponibili;

    public Articolo(String descrizioneArticolo, double prezzo, int pezziDisponibili) {
        this.codiceArticolo = rand.nextInt(1000);
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "{" +
                "codiceArticolo=" + codiceArticolo +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", prezzo=" + prezzo + " €" +
                '}';
    }
}
