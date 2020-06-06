package dzien_pierwszy_przyklady;

public class SwitchExample {

    public static void main(String[] args) {
        //String name = "Tomasz";

        int choice = 123;
        switch (choice) {
            case 3:
                System.out.println("Moje imię to Tomasz");
                break;
            case 2:
                System.out.println("Moje imię to Adrian");
                break;
            default:
                System.out.println("Nie mam imienia");
                break;
        }

        if (choice == 3) {
            System.out.println("Moje imię to Tomasz");
        } else if (choice == 2) {
            System.out.println("Moje imię to Adrian");
        } else {
            System.out.println("Nie mam imienia");
        }
    }
}
