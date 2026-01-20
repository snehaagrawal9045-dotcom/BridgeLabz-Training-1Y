public class LogicalOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 5;

        // Logical AND (&&)
        System.out.println("a > c && b > a : " + (a > c && b > a));

        // Logical OR (||)
        System.out.println("a < c || b > a : " + (a < c || b > a));

        // Logical NOT (!)
        System.out.println("!(a > b) : " + !(a > b));
    }
}
