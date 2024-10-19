import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 1, b = 1;
        while (b <= n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(b);

        a = 1;
        b = 1;
        int sum = a + b;
        while (true) {
            int nextFib = a + b;
            if (nextFib > 1000) break;
            sum += nextFib;
            a = b;
            b = nextFib;
        }
        System.out.println(sum);
    }
}