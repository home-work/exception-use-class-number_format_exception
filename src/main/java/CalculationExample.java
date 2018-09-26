import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vào y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng của 2 số là: " + a);
            System.out.println("Hiệu của 2 số là: " + b);
            System.out.println("Tích của 2 số là: " + c);
            System.out.println("Thương của 2 số là: " + d);
        } catch (ArithmeticException e) {
            System.out.println("Ngoại lệ " + e.getMessage());
        }
    }
}
