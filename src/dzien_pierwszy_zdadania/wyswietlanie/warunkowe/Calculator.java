package dzien_pierwszy_zdadania.wyswietlanie.warunkowe;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Initializing calculator...");

        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println("Pierwsza zmienna " + first);
        System.out.println("Druga zmienna " + second);


        System.out.println("Podaj rodzaj operacji");
        int decision = scanner.nextInt();

        int result = 0;

        switch (decision) {
            case 1:
                System.out.println("Dodawanie " + (first + second));
                break;
            case 2:
                System.out.println("Odejmowanie " + (first - second));
                break;
            case 3:
                System.out.println("Mnożenie " + (first * second));
                break;
            case 4:
                System.out.println("Dzielenie " + (first / second));
                break;

            default:
                System.out.println("Nie rozpoznano operacji");
        }
    }
}
