package dzien_drugi_przyklady.recap;

public class StringRecap {

    public static void main(String[] args) {
        String firstString = "Jabłko";

        String stringCreatedByNewOperator = new String("Gruszka");

        stringCreatedByNewOperator = stringCreatedByNewOperator.toUpperCase();
        firstString = firstString.replace('ł', 'X');

        System.out.println(stringCreatedByNewOperator);
        System.out.println(firstString);


    }
}
