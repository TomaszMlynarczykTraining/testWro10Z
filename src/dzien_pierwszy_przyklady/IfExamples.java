package dzien_pierwszy_przyklady;

public class IfExamples {

    public static void main(String[] args) {
        int x = 10;
        int y = 42;


        if (x < y) {
            x++;
            System.out.println("X jest mniejsze i powiększone o 1 " + x);
        } else if (x > y) {
            System.out.println("Y jest mniejsze");
        } else {
            System.out.println("X i Y są równe");
        }

        if (x < y || x < 20) {
            System.out.println("Coś");
        }
    }
}
