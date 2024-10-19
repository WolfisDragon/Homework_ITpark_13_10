import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //a
        System.out.println("Задание 'а'");
        int sum1 = 0;
        for (int i = 100; i<=500; i++){
            sum1 += i;
        }
        System.out.println("Сумма чисел от 100 до 500: " + sum1);

        //г
        System.out.println("Задание 'г'");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        int b = sc.nextInt();
        int sum2 = 0;

        for(int j = a; j<=b; j++){
            sum2 += j;
        }
        System.out.printf("Сумма чисел от %d до %d: %d", a, b, sum2);

    }
}