import java.util.Random;

/**
 * P11
 */
public class P11 {

    public static void main(String[] args) {
        int arr[][] = new int[6][6];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(2);

            }
        }

        // printing 2d array

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // checking odd number of 1 in row
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1)
                    count++;

            }
            if ((count%2)!=0)


        }

    }
}