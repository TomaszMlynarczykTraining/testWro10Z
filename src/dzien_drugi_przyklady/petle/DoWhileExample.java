package dzien_drugi_przyklady.petle;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String nextLine = "dsds";
        do {
            System.out.println("Wykonam się chociaż raz");
            nextLine = myScanner.nextLine();
        }
        while (!nextLine.equals("KONIEC"));

    }
}
