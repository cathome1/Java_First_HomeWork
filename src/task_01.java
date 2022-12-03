import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tr = 0;
        int fc = 1;
        for (int i = 1; i <= a; i++) {
            tr += i;
            fc *= i;
        }
        System.out.printf("Треугольное число %s : %s\n", a, tr);
        System.out.printf("Факториал числа %s : %s\n", a, fc);
    }
}
