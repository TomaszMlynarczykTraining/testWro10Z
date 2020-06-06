package dzien_pierwszy_przyklady;


import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        // tworzenie obiektu odpowiedzialnego za przyjmowanie danych
        Scanner myScanner = new Scanner(System.in);

        //przyjmowanie i zapis danych
        String myString = myScanner.nextLine();

        //wyświetlenie
        System.out.println(myString);

    }
}
