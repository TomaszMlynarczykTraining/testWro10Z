package dzien_drugi_przyklady.classes;

public class PersonMain {

    public static void main(String[] args) {

        Person janusz = new Person(57, "Janusz");
        Person dorota = new Person(24, "Janusz");
        Person dad = new Person(57, "Janusz");

        janusz.setHeight(123);

        System.out.println(janusz.getHeight());
        System.out.println(janusz.getAge());
        System.out.println(janusz.getName());

        //if(dorota==janusz)

        if (dorota.getAge() == janusz.getAge()) {
            System.out.println("Mają ten sam wiek");
        }

        System.out.println("Wiek pomnożony o 5" + janusz.mulitplyAge(5));
    }
}
