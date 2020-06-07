package dzien_drugi_przyklady.classes;

public class MethodExample {

    public static void main(String[] args) {
        int first = 3;
        int second = 4;
        int third = 5;

        int result = first + second + third * second;


        System.out.println(result);

        int result2 = MathUtils.makeCalculations(first, second, third);
        System.out.println(result2);


        int result3 = MathUtils.makeCalculations(23, 545, 23);
        System.out.println(result3);

    }


}
