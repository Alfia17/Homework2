import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №10");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер квартиры");
        int number = scan.nextInt();
        var entrance = (number + 35) /36;
        number -= (entrance - 1) * 36;
        var floor = (number + 3) / 4;
        System.out.println("entrance = " + entrance);
        System.out.println("floor = " + floor);

    }
}
