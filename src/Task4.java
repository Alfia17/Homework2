import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №4");
        Scanner scan = new Scanner(System.in);
        System.out.println("x = ");
        double x = scan.nextDouble();
        System.out.println("y = ");
        double y = scan.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("Точка в 1-й четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка во 2-й четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка в 3-й четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка в 4-й четверти");
        } else {
            System.out.println("Введите x и y");
        }
    }
}

