public class Main {
    public static void main(String[] args) {
        System.out.println("A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("5 ");
            }
            System.out.print("\n");
        }

        System.out.println("Б");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", j+1);
            }
            System.out.print("\n");
        }

        System.out.println("В");
        int num = 40;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                num++;
                System.out.printf("%d ", num);
            }
            System.out.print("\n");
        }
    }
}