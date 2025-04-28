import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №12");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите шестизначное число = ");
        int n = scan.nextInt();
        int left = (n / 100000) % 10 + (n / 10000) % 10 + (n / 1000) % 10;
        int right = (n/100) % 10 + (n/10) % 10 + n % 10;
        if  (left == right) {
            System.out.println("Удача");
        } else {
            System.out.println("Неудача");
        }
    }
}
