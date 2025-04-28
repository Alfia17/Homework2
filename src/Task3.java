import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №3");
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите животное\n 1. Кошка \n 2. Собака \n 3. Утка \n 4. Корова");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Гав");
                break;
            case 3:
                System.out.println("Кря");
                break;
            case 4:
                System.out.println("Му");
                break;
            default:
                System.out.println("Укажите номер из списка");
                scan.close();
        }
    }
}
