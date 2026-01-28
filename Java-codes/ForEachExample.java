public class ForEachExample {
    public static void main(String[] args) {
        // 1. Define an array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 2. Use the foreach loop to iterate through the array
        // Syntax: for (type element : collection/array)
        System.out.println("Printing numbers using a foreach loop with an array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}