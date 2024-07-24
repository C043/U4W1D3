package Es3;

import java.util.Date;
import java.util.Random;

public class Cliente {
    Random rand = new Random();

    private int codiceCLiente;
    private String name;
    private String surname;
    private String email;
    private Date dataIscrizione;

    public Cliente(String name, String surname, String email) {
        this.codiceCLiente = rand.nextInt(1000);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dataIscrizione = new Date();
    }

    @Override
    public String toString() {
        return "{" +
                "codiceCLiente=" + codiceCLiente +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione=" + dataIscrizione +
                '}';
    }
}
