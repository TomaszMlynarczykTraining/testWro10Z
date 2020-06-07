package dzien_drugi_zadania.arrays;

public class ArraysTasks {

    public static void main(String[] args) {

        int[] processedArray = {3, 23, 1, 5};

        for (int element : processedArray) {
            System.out.println(element);
        }


        int result = processedArray[0];
        for (int element : processedArray) {
            if (element > result) {
                result = element;
            }
        }

        System.out.println("Największy element " + result);


        result = processedArray[0];
        for (int element : processedArray) {
            if (element < result) {
                result = element;
            }
        }

        System.out.println("Najmniejszy element " + result);


    }
}
