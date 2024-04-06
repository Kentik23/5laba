import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите знак операции:");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        int result = switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };

        System.out.println("Результат: " + result);
    }
}