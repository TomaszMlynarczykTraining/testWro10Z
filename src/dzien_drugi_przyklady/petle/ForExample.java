package dzien_drugi_przyklady.petle;

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {

        int outsideVar = 5;

        for (int i = 0; i < 5; i++) {
            Scanner newScanner = new Scanner(System.in);
            String nextLine = newScanner.nextLine();
            System.out.println("Wartość iteratora " + i);
            System.out.println("Wartość z konsoli " + nextLine);

            //zmienna zewnetrzna jest widoczna
            outsideVar = outsideVar + i;
            System.out.println("Wartość outside Var " + outsideVar);
        }

        System.out.println("Wartość outside Var " + outsideVar);

/*        for (int i = 4; i <= 5; i++) {
            System.out.println("Wartość iteratora " + i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Wartość iteratora " + i);
        }*/


/*        for (int i = 4; i < 5; ++i) {
            System.out.println("Wartość iteratora " + i);
        }*/

        //To nie zadziała
        //System.out.println("Wartość iteratora " + i);

    }
}
