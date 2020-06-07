package dzien_drugi_przyklady.arrays;

public class MulitdimensionalArrays {

    public static void main(String[] args) {

        int[][] multiArray = new int[2][2];

        multiArray[0][0] = 5;
        multiArray[0][1] = 10;

        System.out.println(multiArray[0][0]);

        for (int wiersz = 0; wiersz < 2; wiersz++) {
            for (int kolumna = 0; kolumna < 2; kolumna++) {
                System.out.println("Wartośc tablicy na pozycji "
                        + wiersz + " " + kolumna + " jest " + multiArray[wiersz][kolumna]);
            }
        }


    }
}
