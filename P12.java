import java.util.Random;

/**
 * P12
 */
public class P12 {

    public static void main(String[] args) {
        Random rand = new Random(1000);
        for (int i = 0; i < 100; i++) {
            int p = rand.nextInt(50);
            System.out.print(p + " ");
        }
    }
}