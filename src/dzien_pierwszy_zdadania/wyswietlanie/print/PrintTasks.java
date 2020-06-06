package dzien_pierwszy_zdadania.wyswietlanie.print;

public class PrintTasks {

    public static void main(String[] args) {
        //1.1
        String name = "Tomasz";
        System.out.println("Witaj" + name + ".");

        //1.2
        System.out.print("Pierwszy ciag \n");
        // System.out.println();
        System.out.print("Drugi ciag \n");
        // System.out.println();

        //1.4. Wyrównanie do 15 znaków

        System.out.printf("%15s", "SDAASDASD    ");
        System.out.println();

        //1.5. Wyświetlanie hexadecymalne
        System.out.printf("%02x", 192);

    }
}
