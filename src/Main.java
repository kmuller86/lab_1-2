import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("(a && b) : " + (a && b));
        System.out.println("(a && c) : " + (a && c));

        System.out.println("!a : " + !a);
        System.out.println("!b : " + !b);

        int x = 5;
        int y = 7;
        int z = 5;

        System.out.println("(x == y) : " + (x == y));
        System.out.println("(x == z) : " + (x == z));

        System.out.println("(x != y) : " + (x != y));
        System.out.println("(x != z) : " + (x != z));

    }
}
