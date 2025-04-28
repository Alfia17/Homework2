import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №11");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите a - ");
        double a = scan.nextDouble();
        System.out.println("Введите b - ");
        double b = scan.nextDouble();
        System.out.println("Введите c - ");
        double c = scan.nextDouble();
        double dis = b * b - 4 * a * c;
        if (dis > 0) {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println("Корни квадратного уравнения - x1 - " + x1 + " x2 = " + x2);
        } else if (dis == 0) {
            double x = -b / (2 * a);
            System.out.println("x1 = x2 = " +x);
        } else {
            System.out.println("Квадратное уравнение не имеет действительных корней");
        }
    }
}
