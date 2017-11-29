package lt.kaunascoding.lt;

import java.util.Scanner;

public class Uzduotis08 {
    // UZDUOTIS Realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai sunaudoja kuro 100
    //    km. Programa turi paprašyti vartotojo įvesti nuvažiuotus km ir kuro sąnaudas.
    //    vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo

// PLANAS
    // Paprasyti vartotojo kilometru
    // Prisiskirti kintamajam
    // Paprasyti vartotojo sanaudu
    // Prisiskirti kintamajam
    // Isvesti atsakyma - vidurki

    public Uzduotis08() {
        Scanner skaitytuvas = new Scanner(System.in);

        System.out.println("Iveskite nuvaziuotu kilometru skaiciu:");

        float km = skaitytuvas.nextFloat();

        System.out.println("Iveskite kuro sanaudas:");

        float sanaudos = skaitytuvas.nextFloat();

        System.out.println((sanaudos*100)/km);
    }

}
