package lt.kaunascoding.lt;

import java.util.Scanner;

public class Uzduotis05 {
    // UZDUOTIS Papildykite 1.4. programą ir realizuokite overload funkcionalumą sumai ir skirtumui.
    // Vienas sumos metodas turi priimti ir grąžinti int tipo reikšmę, o kitas float. Taip pat ir su skirtumu.
    // PLANAS
    // Paprasyti vartotojo skaiciu
    // Juos nuskaityti
    // Parasyti metodus skirtumui overload su int if float
    // Parasyti metodus sumai overload su int ir flash
    // Iskviesti metodus vykdymui

    public Uzduotis05() {
        Scanner skaneris = new Scanner(System.in);

        System.out.println("Sveiki, iveskite du skaicius, kuriu suma ir skirtuma suskaiciuos programa");
        System.out.println("Iveskite pirma skaiciu");
        float pirmas = skaneris.nextFloat();
        System.out.println("Iveskite antra skaiciu");
        float antras = skaneris.nextFloat();

        // atspausdinti skirtuma ir suma is skirtingu metodu
        System.out.print("Skaiciu suma:");
        System.out.println(suma(pirmas, antras));
        System.out.print("Skaiciu suma:");
        System.out.println(suma((int) pirmas, (int) antras));

        // skirtumas kitu budu, sudedant kintamuosius per pliusa
        String pavadinimas = "Skaiciu skirtumas: ";
        System.out.println(pavadinimas + skirtumas(pirmas, antras));
        System.out.print("Skaiciu skirtumas:");
        System.out.println(skirtumas((int) pirmas, (int) antras));
    }

    // sumos metodai
    public static float suma(float a, float b) {
        return a + b;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    //skirtumo metodai
    public static float skirtumas(float a, float b) {
        return a - b;
    }

    public static int skirtumas(int a, int b) {
        return a - b;
    }

}
