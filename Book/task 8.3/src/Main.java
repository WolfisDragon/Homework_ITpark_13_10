public class Main {
    public static void main(String[] args) {
        System.out.println("A");
        int n = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.printf("%d ", n);
            }
            n++;
            System.out.println();
        }

        System.out.println("Б");
        int n1 = 5;
        int k = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("%d ", n1);
            }
            n1++;
            k--;
            System.out.println();
        }

        System.out.println("В");
        int n2 = 10;
        int l = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < l; j++) {
                System.out.printf("%d ", n2);
            }
            n2 += 10;
            l++;
            System.out.println();
        }

        System.out.println("Г");
        int n3 = 5;
        int d = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < d; j++) {
                System.out.printf("%d ", n3);
            }
            n3+=5;
            d--;
            System.out.println();
        }
    }
}