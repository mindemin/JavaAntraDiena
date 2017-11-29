package lt.kaunascoding.lt;

import java.util.Scanner;

public class Uzduotis04 {
    // UZDUOTIS Papildyti 1.3 . programą sumos ir skirtumo skaičiavimai turi būti skirtinguose metoduose.
    // PLANAS
    // Paprasyti vartotojo skaiciu
    // Juos nuskaityti
    // Parasyti metoda skirtumui
    // Parasyti metoda sumai
    // Iskviesti metodus vykdymui
    public Uzduotis04() {
        Scanner skaneris = new Scanner(System.in);

        System.out.println("Sveiki, iveskite du skaicius, kuriu suma ir skirtuma suskaiciuos programa");
        System.out.println("Iveskite pirma skaiciu");
        int pirmas = skaneris.nextInt();
        System.out.println("Iveskite antra skaiciu");
        int antras = skaneris.nextInt();

        // atspausdinti skirtuma ir suma is skirtingu metodu
        System.out.print("Skaiciu suma:");
        System.out.println(suma(pirmas,antras));
        // skirtumas kitu budu, sudedant kintamuosius per pliusa
        String pavadinimas = "Skaiciu skirtumas: ";
        System.out.println(pavadinimas+skirtumas(pirmas,antras));
    }

    // sumos metodas
    public static float suma(float a, float b){
        return a+b;
    }

    //skirtumo metodas
    public static float skirtumas(float a, float b){
        return a-b;
    }
}
