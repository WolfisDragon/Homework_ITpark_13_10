import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String town;
        String maxDistTown = "";
        int maxdistance = 0;
        int distance;


        for (int i = 0; i < 5; i++) {
            town = sc.next();
            distance = sc.nextInt();
            if (maxdistance<distance){
                maxdistance = distance;
                maxDistTown = town;
            }
        }

        System.out.printf("Город: %s, Расстояние: %d км", maxDistTown, maxdistance);
    }
}