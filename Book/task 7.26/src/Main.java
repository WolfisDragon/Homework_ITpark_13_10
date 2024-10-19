//import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] temperature = new int[30];
        int res = 0;

        for(int i = 0; i < temperature.length; i++) {
            temperature[i] = rnd.nextInt(-30, 40);
            if (temperature[i]< 0){
                res++;
            }
        }
//        System.out.println(Arrays.toString(temperature));

        System.out.println(res);
    }
}