package dzien_drugi_przyklady.classes;

public class Person {

    private int age;
    private String name;
    private long height;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int mulitplyAge(int multipliar) {
        return this.age * multipliar;
    }
}
