package Es3;

import java.util.Arrays;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli;
    private double totaleCostoArticoli;

    public Carrello(Cliente cliente, Articolo[] elencoArticoli) {
        this.clienteAssociato = cliente;
        this.elencoArticoli = elencoArticoli;
        this.totaleCostoArticoli = sommaPrezzi(elencoArticoli);
    }

    public double sommaPrezzi(Articolo[] array) {
        double totale = 0;
        for (Articolo articolo : array) {
            totale += articolo.getPrezzo();
        }
        return totale;
    }

    public void addToCart(Articolo articolo) {
        Articolo[] largerArray = new Articolo[elencoArticoli.length + 1];
        for (int i = 0; i < largerArray.length; i++) {
            if (i == largerArray.length - 1) {
                largerArray[i] = articolo;
            } else {
                largerArray[i] = elencoArticoli[i];
            }
        }
        this.elencoArticoli = largerArray;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "clienteAssociato=" + clienteAssociato +
                ", elencoArticoli=" + Arrays.toString(elencoArticoli) +
                ", totaleCostoArticoli=" + totaleCostoArticoli + " €" +
                '}';
    }
}
