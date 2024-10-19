import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //a
        System.out.println("Задание 'a'");
        int mult1 = 1;
        for(int i = 8; i <= 15; i ++){
            mult1 *= i;
        }
        System.out.println("Произведение от 8 до 15: "+mult1);

        //г
        System.out.println("Задание 'г'");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int mult2 = 1;

        for(int j = a; j<=b; j ++){
            mult2 *= j;
        }
        System.out.printf("Произведение от %d до %d: %d", a, b, mult2);

    }
}