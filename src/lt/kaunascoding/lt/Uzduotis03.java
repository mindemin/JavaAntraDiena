package lt.kaunascoding.lt;

import java.util.Scanner;

public class Uzduotis03 {
// UZDUOTIS Parašykite programą, kuri paprašytų įvesti vartotojo du skaičius ir atspausdinti jų skirtumą bei sumą
// PLANAS
    //-Paprasyti vartotojo skaiciu
    //-Atspausdinti skirtuma ir suma

    public Uzduotis03() {
        Scanner skaneris = new Scanner(System.in);

        System.out.println("Sveiki, iveskite du skaicius, kuriu suma ir skirtuma suskaiciuos programa");
        System.out.println("Iveskite pirma skaiciu");
        int pirmas = skaneris.nextInt();
        System.out.println("Iveskite antra skaiciu");
        int antras = skaneris.nextInt();
        int suma = pirmas+antras;
        int skirtumas = pirmas - antras;

        System.out.println("Skaiciu suma: " + suma);
        System.out.println("Skaiciu skirtumas: " + skirtumas);
    }
}
