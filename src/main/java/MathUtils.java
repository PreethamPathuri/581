public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0; // Handle division by zero
        } else {
            return (double) a / b;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        MathUtils math = new MathUtils();
        System.out.println("Addition: " + math.add(5, 3)); // Output: 8
        System.out.println("Subtraction: " + math.subtract(5, 3)); // Output: 2
        System.out.println("Multiplication: " + math.multiply(5, 3)); // Output: 15
        System.out.println("Division: " + math.divide(5, 3)); // Output: 1.6666666666666667
        System.out.println("Division by zero: " + math.divide(5, 0)); // Output: -1.0
    }
}
