import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaSqInches = 0.5 * base * height;
        double areaSqCm = areaSqInches * 6.4516; // 1 sq inch = 6.4516 sq cm

        System.out.println(
            "The area of the triangle is " + areaSqInches +
            " square inches and " + areaSqCm + " square centimeters"
        );
    }
}

