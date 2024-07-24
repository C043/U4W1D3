package Es2;

public class Main {
    public static void main(String[] args) {
        SIM sim1 = new SIM("3459244024");

        sim1.addCredit(5);

        sim1.call(new Chiamata(5.35, 33872844));
        sim1.call(new Chiamata(10, 569345899));

        sim1.stampaSim();
    }
}
