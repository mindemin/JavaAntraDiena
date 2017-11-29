package lt.kaunascoding.lt;

import java.util.Scanner;

public class Uzduotis06 {
    // UZDUOTIS Parašyti programą, kuri leistų vartotojui įvesti savo masę ir ūgį, pagal gautus duomenis
    //    paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
    //            KMI = masė (kg) / (ūgis(m))^2
    // PLANAS
    // Paprasyti vartotojo mases
    // Prisiskirti kintamajam
    // Paprasyti vartotojo ugio
    // Prisiskirti kintamajam
    // Isvesti atsakyma


    public Uzduotis06() {
        Scanner skaitytuvas = new Scanner(System.in);

        System.out.println("Iveskite savo mase:");

        float mase = skaitytuvas.nextFloat();

        System.out.println("Iveskite savo ugi:");

        float ugis = skaitytuvas.nextFloat();

        System.out.println(mase / (Math.pow(ugis, 2)));
    }
}
