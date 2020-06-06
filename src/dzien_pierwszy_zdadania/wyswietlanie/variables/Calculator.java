package dzien_pierwszy_zdadania.wyswietlanie.variables;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Initializing calculator...");

        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        System.out.println("Pierwsza zmienna " + first);
        System.out.println("Druga zmienna " + second);

    }
}
