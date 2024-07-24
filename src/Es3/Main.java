package Es3;

public class Main {
    public static void main(String[] args) {
        Cliente aldo = new Cliente("Aldo", "Baglio", "aldo.baglio@gmail.com");

        Articolo garpez = new Articolo("Gamba di legno", 100, 1);
        Articolo shampooSecco = new Articolo("Shampoo per cute sensibile", 5, 100);

        Carrello carrelloAldo = new Carrello(aldo, new Articolo[0]);

        carrelloAldo.addToCart(garpez);
        System.out.println(carrelloAldo);

        carrelloAldo.addToCart(shampooSecco);
        System.out.println(carrelloAldo);
    }
}
