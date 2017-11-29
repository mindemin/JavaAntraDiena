package lt.kaunascoding.lt;

import java.util.Scanner;

public class Uzduotis09 {
    // UZDUOTIS Realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai sunaudoja kuro 100
    //    km. Programa turi paprašyti vartotojo įvesti nuvažiuotus km ir kuro sąnaudas.
    //    vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo
    //Papildyti 1.8 . programą, parašykite du atskirus metodus, vienas turi nuskaityti įvestus
    //    vartotojo parametrus, kitas paskaičiuotų ir grąžintų vidurkį. Rezultatus spausdinti ekrane.

    // PLANAS
    // Susikurti metoda ivedimui
    // Paprasyti vartotojo kilometru
    // Paprasyti vartotojo sanaudu
    // Susikurti antra metoda vidurkiui
    // Suskaiciuoti vidurki
    // Isvesti atsakyma - kuro sanaudas 100km


    double km = 0; // Klases kintamieji
    double sanaudos = 0;

    public Uzduotis09() {
        Ivedimas();
        double vid = KuroVidurkis(sanaudos, km);
        System.out.println("Jusu sunaudotas kuras 100km: " + vid);
    }

    public void Ivedimas() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotu kilometru skaiciu:");
        km = skaitytuvas.nextDouble();
        System.out.println("Iveskite kuro sanaudas:");
        sanaudos = skaitytuvas.nextDouble();
    }

    public static double KuroVidurkis(double a, double b) {
        return ((a * 100) / b);
    }
}
