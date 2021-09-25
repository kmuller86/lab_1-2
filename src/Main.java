import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int wiek = 21;

        if(wiek % 3 == 0){
            System.out.println("Podzielny przez 3");

        }
        else{
            System.out.println("Niepodzielny przez 3");
        }


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int indeks = 58178;

        if(indeks % 2 == 0){
            System.out.println("Parzysty!");
        }
        else {
            System.out.println("Nieparzysty!");
        }


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        Scanner scanliczba = new Scanner(System.in);

        System.out.print("Podaj Liczbe: ");
        double liczba = scanliczba.nextDouble();

        if(liczba > 3.14){
            System.out.println("Liczba > pi");
        }
        else {
            System.out.println("liczba <= pi");
        }

    }
}
