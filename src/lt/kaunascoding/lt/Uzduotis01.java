package lt.kaunascoding.lt;

import java.util.Scanner;

public class Uzduotis01 {
    // konstruktorius - tas metodas, kuri iskviesime su new.
    public Uzduotis01() {
        // Pasisveikinti
        // Paprasyti vardo
        // Artspausti 5 kartus
        System.out.println("Sveiki, iveskite savo varda:");
        Scanner skaneris = new Scanner(System.in);
        String vardas = skaneris.next();
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
    }


}
