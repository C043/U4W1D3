package Es1;

import static java.lang.Double.parseDouble;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public Rettangolo(String altezza, String larghezza) {
        this.altezza = parseDouble(altezza);
        this.larghezza = parseDouble(larghezza);
    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println(rettangolo.altezza);
        System.out.println(rettangolo.larghezza);
    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        double areaRett1 = rett1.areaRettangolo();
        double perimetroRett1 = rett1.perimetroRettangolo();

        double areaRett2 = rett2.areaRettangolo();
        double perimetroRett2 = rett2.perimetroRettangolo();

        double sommaAree = areaRett1 + areaRett2;
        double sommaPerimetri = perimetroRett1 + perimetroRett2;

        System.out.println("Area del primo rettangolo: " + areaRett1);
        System.out.println("Perimetro del primo rettangolo: " + perimetroRett1);

        System.out.println("Area del secondo rettangolo: " + areaRett2);
        System.out.println("Perimetro del secondo rettangolo: " + perimetroRett2);

        System.out.println("La somma delle loro aree è : " + sommaAree);
        System.out.println("La somma dei loro perimetri è " + sommaPerimetri);
    }

    public double perimetroRettangolo() {
        return (this.altezza * 2) + (this.larghezza * 2);
    }

    public double areaRettangolo() {
        return this.larghezza * this.altezza;
    }
}
