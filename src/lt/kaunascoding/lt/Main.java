package lt.kaunascoding.lt;

import java.util.Scanner;

public class Main {

    public static final int CHOISE_0 = 0; // konstanta, kad nesunkiai keistusi visoje programoje.
    public static final int CHOISE_1 = 1; // konstanta, kad nesunkiai keistusi visoje programoje.
    public static final int CHOISE_2 = 2; // konstanta, kad nesunkiai keistusi visoje programoje.
    public static final int CHOISE_3 = 3; // konstanta, kad nesunkiai keistusi visoje programoje.
    public static final int CHOISE_4 = 4;
    public static final int CHOISE_5 = 5;
    public static final int CHOISE_6 = 6;
    public static final int CHOISE_7 = 7;
    public static final int CHOISE_8 = 8;
    public static final int CHOISE_9 = 9;

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
            System.out.println("Turime is viso 5 uzduotis");
            System.out.println("Iveskite uzduoties numeri, kad  ja vykdyti.");
            System.out.println("Ivedus 0, programa bus baigta.");
            int pasirinkimas = skaityvtuvas.nextInt();

            switch (pasirinkimas) {
                case CHOISE_0:
                    return;
                case CHOISE_1:
                    Uzduotis01 pirmoji = new Uzduotis01(); // Vykdo konstruktoriu.
                    break;
                case CHOISE_2:
                    Uzduotis02 antroji = new Uzduotis02();
                    break;
                case CHOISE_3:
                    Uzduotis03 trecioji = new Uzduotis03();
                    break;
                case CHOISE_4:
                    Uzduotis04 ketvirta = new Uzduotis04();
                    break;
                case CHOISE_5:
                    Uzduotis05 penkta = new Uzduotis05();
                    break;
            }
        }


    }

}

