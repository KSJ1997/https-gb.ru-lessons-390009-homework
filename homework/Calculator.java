public class Calculator {

    // Метод для сложения
    public static double sum(double a, double b) {
        return a + b;
    }

    // Метод для умножения
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Метод для вычитания
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        // Пример использования
        double sumResult = Calculator.sum(5.5, 3.2);
        System.out.println("Sum: " + sumResult);

        double multiplyResult = Calculator.multiply(2.5, 3.5);
        System.out.println("Multiply: " + multiplyResult);

        double divideResult = Calculator.divide(10.0, 2.0);
        System.out.println("Divide: " + divideResult);

        double subtractResult = Calculator.subtract(7.5, 3.2);
        System.out.println("Subtract: " + subtractResult);
    }
}
