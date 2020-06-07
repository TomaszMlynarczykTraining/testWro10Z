package dzien_drugi_przyklady.petle;

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Scanner newScanner = new Scanner(System.in);
            String nextLine = newScanner.nextLine();
            System.out.println("Wartość iteratora " + i);
            System.out.println("Wartość z konsoli " + nextLine);
        }

        for (int i = 4; i <= 5; i++) {
            System.out.println("Wartość iteratora " + i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Wartość iteratora " + i);
        }


/*        for (int i = 4; i < 5; ++i) {
            System.out.println("Wartość iteratora " + i);
        }*/

        //To nie zadziała
        //System.out.println("Wartość iteratora " + i);

    }
}
