package dzien_drugi_przyklady.arrays;

import com.sun.org.apache.xpath.internal.operations.String;

public class ArraysExample {

    public static void main(String[] args) {

        int[] intArray = new int[3];

        int[] intArray2 = {3, 4, 5};

        intArray[0] = 5;
        intArray[1] = 23;
        intArray[2] = 24;

        System.out.println("Wartość 0: " + intArray[0]);
        System.out.println("Wartość 1: " + intArray[1]);
        // System.out.println("Wartość 56: " + intArray[56]);

        System.out.println("Długość tablicy: " + intArray.length);


        int[] longerArray = new int[23];

        for (int i = 0; i < 23; i++) {
            longerArray[i] = i + 1;
        }


        for (int i = 0; i < 23; i++) {
            System.out.println("Wartość tablicy na indeksie " + i + " wynosi " + longerArray[i]);
        }


        String[] stringArray = new String[3];
    }
}
