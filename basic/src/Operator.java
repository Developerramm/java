public class Operator {
    public static void main(String[] args) {
        System.out.println("All operator");

        System.out.println(5 > 4);
        System.out.println( 5 < 4);
        System.out.println(5 != 4);

        System.out.println((5 > 4) && (3 < 5));
        System.out.println((5 > 4) || (3 < 5));

        System.out.println(!true);
        System.out.println(!false);

        int number1 = 10;
        System.out.println(number1++);
        System.out.println(number1);
        System.out.println(++number1);
        System.out.println(--number1);

       // System.out.println(10 === 10);
    }
}
