package dzien_pierwszy_zdadania.wyswietlanie.variables;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Initializing calculator...");

        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println("Pierwsza zmienna " + first);
        System.out.println("Druga zmienna " + second);

        System.out.println("Dodawanie " + (first + second));
        System.out.println("Odejmowanie " + (first - second));
        System.out.println("Mnożenie " + (first * second));
        System.out.println("Dzielenie " + (first / second));


    }
}
