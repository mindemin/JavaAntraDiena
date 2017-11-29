package lt.kaunascoding.lt;

import java.util.Scanner;

public class Uzduotis07 {
    // UZDUOTIS Parašyti programą, kuri leistų vartotojui įvesti savo masę ir ūgį, pagal gautus duomenis
    //    paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
    //            KMI = masė (kg) / (ūgis(m))^2
    //Realizuoti 1.6. užduotį panaudojant metodą, kurio parametrai būtų masė ir svoris, o grąžinama reikšmė, kūno masės indeksas.

    // PLANAS
    // Paprasyti vartotojo mases
    // Prisiskirti kintamajam
    // Paprasyti vartotojo ugio
    // Prisiskirti kintamajam
    // Susikurti metoda
    // Isvesti atsakyma


    public Uzduotis07() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Iveskite savo mase:");
        double mase = skaitytuvas.nextDouble();
        System.out.println("Iveskite savo ugi:");
        double ugis = skaitytuvas.nextDouble();

        System.out.println("Jusu KMI: " + kmi(mase,ugis));
    }

    public static double kmi (double a, double b){
        return a/(Math.pow(b,2));
    }
}
