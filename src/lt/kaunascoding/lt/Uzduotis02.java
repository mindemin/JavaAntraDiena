package lt.kaunascoding.lt;

import java.util.Scanner;

public class Uzduotis02 {
    // UZDUOTIS - Parašyti programą, kuri paprašytų vartotojo įvesti žodį ir atspausdintų kiek simbolių yra tame žodyje.
    // PLANAS:
    // - Paprasyti vartotojo ivesti zodi
    // - Nuskaityti zodi
    // - Suskaiciuoti raide
    // - Isvesti atsakyma
    public Uzduotis02() {
        System.out.println("Sveiki, iveskite zodi:");
        Scanner skaneris = new Scanner(System.in);
        String vardas = skaneris.next();
        System.out.println("Zodyje yra " + vardas.length() + " raides");
    }
}


