package dzien_drugi_przyklady.recap;

import java.util.Scanner;

public class ScannerRecap {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        long firstValue = myScanner.nextLong();
        long secondValue = myScanner.nextLong();
        long thirdValue = myScanner.nextLong();


        long result;

        result = firstValue - secondValue - thirdValue;

        System.out.println("Wynik odejmowania to:" + result);
    }

}
