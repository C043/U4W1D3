package Es2;

import java.util.Arrays;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private Chiamata[] ultimeCinqueChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.ultimeCinqueChiamate = new Chiamata[5];
    }

    public void stampaSim() {
        System.out.println("Dati SIM:");
        System.out.println("Numero di telefono: " + this.numeroTelefono);
        System.out.println("Credito: " + this.credito + " €");
        if (ultimeCinqueChiamate[0] != null) {
            System.out.println("Ultime 5 chiamate: " + Arrays.toString(this.ultimeCinqueChiamate));
        } else {
            System.out.println("Non sono presenti chiamate.");
        }
    }
}
