import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        Scanner scanImie = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        String imie = scanImie.next();

        Scanner scanNazwisko = new Scanner(System.in);
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanNazwisko.next();

        Scanner scanWiek = new Scanner(System.in);
        System.out.print("Podaj wiek: ");
        String wiek = scanWiek.next();

        Scanner scanNr = new Scanner(System.in);
        System.out.print("Podaj nr Indeksu: ");
        String nr = scanNr.next();

        System.out.println(imie+", "+nazwisko+", "+wiek+", "+nr);

        //--------------ZAD 2---------------------------------------------------


        Scanner scanliczbaA = new Scanner(System.in);
        System.out.print("Podaj pierwsza libcze: ");
        int liczbaA = scanliczbaA.nextInt();

        Scanner scanliczbaB = new Scanner(System.in);
        System.out.print("Podaj druga libcze: ");
        int liczbaB = scanliczbaB.nextInt();

        int wynik;

        wynik = liczbaA + liczbaB;
        System.out.println(wynik);

        wynik = liczbaA - liczbaB;
        System.out.println(wynik);

        wynik = liczbaA * liczbaB;
        System.out.println(wynik);

        wynik = liczbaA / liczbaB;
        System.out.println(wynik);

        wynik = liczbaA % liczbaB;
        System.out.println(wynik);



    }
}
