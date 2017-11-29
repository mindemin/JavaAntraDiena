package lt.kaunascoding.lt;

import java.util.Scanner;

public class Main {

    public static final int CHOISE_0 = 0; // konstanta, kad nesunkiai keistusi visoje programoje.
    public static final int CHOISE_1 = 1; // konstanta, kad nesunkiai keistusi visoje programoje.
    public static final int CHOISE_2 = 2; // konstanta, kad nesunkiai keistusi visoje programoje.
    public static final int CHOISE_3 = 3; // konstanta, kad nesunkiai keistusi visoje programoje.
    public static final int CHOISE_4 = 4;

    public static void main(String[] args) {
        // PLANAS
        // Parodyti vartotojui kiek yra uzduocius
        // Paklausti vartotojo kokia uzduoti parodyti
        // Nuskaityti vartotojo pasirinkima
        // Pagal ivesta skaiciu rodyti uzduoties vykdyma
        // programa kartoja sia seka kol neiveda 0

        // git init
        // git add --all
        // git commit -m "pirmas kelimas"
        // dvi komandos is github

        Scanner skaityvtuvas = new Scanner(System.in);
        while (true) {
            System.out.println("Turime is viso 1 uzduoti");
            System.out.println("Iveskite uzduoties numeri, kad  ja vykdyti.");
            System.out.println("Ivedus 0, programa bus baigta.");
            int pasirinkimas = skaityvtuvas.nextInt();

            switch (pasirinkimas) {
                case CHOISE_0:
                    return;
                case CHOISE_1: {
                    Uzduotis01 pirmoji = new Uzduotis01(); // Vykdo konstruktoriu.
                    break;
                }
            }


        }

    }
}
