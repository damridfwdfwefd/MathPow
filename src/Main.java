import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //перавый вариант
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(Math.pow(a,b));
        //второй вариант
        System.out.println(Math.pow(scanner.nextDouble(), scanner.nextDouble()));
        //третий вариант, но здесь надо делать ввод каждый раз с новой строки
        System.out.println(Math.pow(new Scanner(System.in).nextDouble(). new Scanner(System.in).nextDouble()));

    }
}
