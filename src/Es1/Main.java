package Es1;

import static Es1.Rettangolo.stampaDueRettangoli;
import static Es1.Rettangolo.stampaRettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo rett1 = new Rettangolo(10, 20);
        Rettangolo rett2 = new Rettangolo(30, 50);

        System.out.println(rett1.perimetroRettangolo());
        System.out.println(rett1.areaRettangolo());

        stampaRettangolo(rett1);
        stampaDueRettangoli(rett1, rett2);
    }
}
