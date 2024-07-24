package Es3;

public class Main {
    public static void main(String[] args) {
        Cliente aldo = new Cliente("Aldo", "Baglio", "aldo.baglio@gmail.com");

        Articolo garpez = new Articolo("Gamba di legno", 100, 1);
        Articolo shampooSecco = new Articolo("Shampoo per cute sensibile", 5, 100);

        Articolo[] listaSpesa = {garpez, shampooSecco};

        Carrello carrelloAldo = new Carrello(aldo, listaSpesa);

        System.out.println(carrelloAldo);

        Cliente giovanni = new Cliente("Giovanni", "Storti", "giovanni.storti@gmail.com");

        Articolo biciclettaAmmaestrata = new Articolo("Bici che arriva al fischio", 1000, 1);

        Articolo[] listaSpesaGiova = {biciclettaAmmaestrata};

        Carrello carrelloGiova = new Carrello(giovanni, listaSpesaGiova);

        System.out.println(carrelloGiova);
    }
}
