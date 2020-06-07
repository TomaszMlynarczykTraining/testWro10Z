package dzien_drugi_przyklady.arrays;

public class ForEachExample {

    public static void main(String[] args) {

        String[] topicsToLearn = {"zmienne", "pętle", "tablice", "historia Javy"};

        for (String topic : topicsToLearn) {
            System.out.println("Jeden z tematów to: " + topic);
        }

        for (int i = 0; i < topicsToLearn.length; i++) {
            System.out.println("W pętli for i : " + topicsToLearn[i]);
        }

    }
}
