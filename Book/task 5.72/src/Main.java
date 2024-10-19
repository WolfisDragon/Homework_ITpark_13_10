public class Main {
    public static void main(String[] args) {
        double result = 10.0;
        double all = result;
        for (int i = 2; i <= 10; i++) {
            result += result * 0.1;
            System.out.printf("За %d день пробежал: %.3f км \n",i, result);
            if (i <= 7) all += result;
        }
        System.out.printf("За 7 дней бегун пробежал: %.3f км",all);
    }
}