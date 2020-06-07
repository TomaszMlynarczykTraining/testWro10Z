package dzien_drugi_przyklady.petle;

import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {

        boolean whileLoopBreaker = true;

        Scanner myScanner = new Scanner(System.in);

        while (whileLoopBreaker) {
            System.out.println("Czy przerwać pętlę?");
            String nextLine = myScanner.nextLine();

            if (nextLine.equals("TAK")) {
                whileLoopBreaker = false;
            }
        }


        int i = 0;

        while (i < 4) {
            System.out.println("Wartości iteratora to " + i);
            i++;
        }

/*        while (true) {
            System.out.println("Nieskończoność");
        }*/
    }
}
