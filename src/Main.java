import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*int zmiennaInt = 7;
        char zmiennaChar = 'n';
        String zmiennaString = "jeden";
        short zmiennaShort = 15;

        System.out.println("zmienna int = " + zmiennaInt);

        System.out.println(zmiennaString + " " + zmiennaChar);
        System.out.println(zmiennaShort);*/


        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        int zmiennaA = 2, zmiennaB = 3, dowolnaInt;

        dowolnaInt = zmiennaA + zmiennaB;
        System.out.println(dowolnaInt);

        dowolnaInt = zmiennaA - zmiennaB;
        System.out.println(dowolnaInt);

        dowolnaInt = zmiennaA / zmiennaB;
        System.out.println(dowolnaInt);

        dowolnaInt = zmiennaA * zmiennaB;
        System.out.println(dowolnaInt);

        dowolnaInt = zmiennaA % zmiennaB;
        System.out.println(dowolnaInt);

        System.out.println("-----------");

        double zmiennaX = 4, zmiennaY = 5, dowolnaDouble;

        dowolnaDouble = zmiennaX + zmiennaY;
        System.out.println(dowolnaDouble);


        dowolnaDouble = zmiennaX - zmiennaY;
        System.out.println(dowolnaDouble);

        dowolnaDouble = zmiennaX / zmiennaY;
        System.out.println(dowolnaDouble);

        dowolnaDouble = zmiennaX * zmiennaY;
        System.out.println(dowolnaDouble);

        dowolnaDouble = zmiennaX % zmiennaY;
        System.out.println(dowolnaDouble);


    }
}
