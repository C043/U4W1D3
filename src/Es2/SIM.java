package Es2;

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
        if (ultimeCinqueChiamate[4] != null) {
            System.out.println("Ultime chiamate (MAX 5):");
            for (int i = 4; i >= 0; i--) {
                if (ultimeCinqueChiamate[i] != null) {
                    System.out.println(ultimeCinqueChiamate[i]);
                }
            }
        } else {
            System.out.println("Non sono presenti chiamate.");
        }
    }

    public void call(Chiamata chiamata) {
        if (this.credito < 5) {
            System.out.println("Credito insufficente");
        } else {
            this.credito -= 5;
            System.out.println("Chiamata effettuata.");
            for (int i = 0; i < ultimeCinqueChiamate.length; i++) {
                if (i == 4) {
                    ultimeCinqueChiamate[i] = chiamata;
                } else {
                    ultimeCinqueChiamate[i] = ultimeCinqueChiamate[i + 1];
                }
            }
        }
    }

    public void addCredit(double credito) {
        this.credito += credito;
        System.out.println("Credito aggiunto, credito attuale: " + this.credito);
    }
}
