package dzien_pierwszy_przyklady;

public class StringExample {

    public static void main(String[] args) {

        String name = "Tomasz";

        int someInt = 4;

        int length = name.length();
        System.out.println(length);

        int indexOf = name.indexOf("a");
        System.out.println(indexOf);

        String newName = name.replace('s', 'x');
        System.out.println(newName);


        String value = String.valueOf(3);
        System.out.println(value);


        String myName = "Młyn";

        //Stringi i inne obiekty porównujemy przez equals
        boolean equals = myName.equals(name);
        boolean notEquals = !myName.equals(name);

        System.out.println("Tomasz " + "Młynarczyk");

        String fullName = myName + name;
        System.out.println(fullName);


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(myName);
        stringBuilder.append(newName);
        System.out.println(stringBuilder.toString());

    }
}
