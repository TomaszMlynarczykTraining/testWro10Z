package dzien_pierwszy_przyklady;

public class OperatorsExample {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int result;

        result = x + y;
        System.out.println(result);

        result += x;
        System.out.println(result);

        result *= y;
        System.out.println(result);

        System.out.println(result++);
        System.out.println(result);


        boolean isEqual = x == y;
        System.out.println(isEqual);

        boolean isNotEqual = x != y;
        System.out.println(isNotEqual);


        System.out.println(x >= y);

    }
}
