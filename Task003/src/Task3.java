import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = s.nextInt();
        triangularNumber(a);
    }

    static void triangularNumber(int a) {
        int sum = 0;
        System.out.print("Последовательность треугольных чисел T" + a + ": ");
        for (int i = 1; i <= a; i++) {
            sum += i;
            System.out.print(i + ", ");
        }
        System.out.println("\nТреугольное число от " + sum);
    }
}
