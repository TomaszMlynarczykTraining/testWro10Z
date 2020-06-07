package dzien_drugi_przyklady.recap;

import java.util.Scanner;

public class IfRecap {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int first = myScanner.nextInt();

        if (first == 0) {
            System.out.println("$");
        } else if (first == 1) {
            System.out.println("#");
        } else if (first == 2 || first == 10) {
            System.out.println("*");
        } else {
            System.out.println("Znak nierozpoznany");

        }


        switch (first) {
            case 0:
                System.out.println("$");
                break;
            case 1:
                System.out.println("#");
                break;
            case 2:
            case 10:
                System.out.println("*");
                break;
            default:
                System.out.println("Znak nierozpoznany");
                break;
        }
    }
}
