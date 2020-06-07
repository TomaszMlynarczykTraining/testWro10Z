package dzien_pierwszy_zdadania.wyswietlanie.string;

public class StringTasks {

    public static void main(String[] args) {
        String first = "pierwszy";
        String second = "drugi";

        System.out.println(first.toUpperCase() + second.toUpperCase());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(first.toUpperCase());
        stringBuilder.append(second.toUpperCase());

        System.out.println(stringBuilder.toString());


        System.out.println(first.substring(0, 1));


    }
}
