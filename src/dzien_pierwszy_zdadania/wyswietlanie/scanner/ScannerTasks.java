package dzien_pierwszy_zdadania.wyswietlanie.scanner;

import java.util.Scanner;

public class ScannerTasks {

    public static void main(String[] args) {


        //1. Wprowadzanie wartości

        Scanner scanner = new Scanner(System.in);
        //String next = scanner.nextLine();

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        //int result = first + second;
        System.out.println("Wynik to " + (first + second));

        //2. Patrz calculator
    }
}
