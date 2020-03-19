
import java.util.Scanner;

/**
 * P10
 */
public class P10 {

    static void reverse(int[] arr) {
        int rem, sum = 0;
        for (int i = 0; i < arr.length; i++) {

            while (arr[i] > 0) {
                rem = arr[i] % 10;
                sum = sum * 10 + rem;
                arr[i] = arr[i] / 10;
            }

            arr[i] = sum;
        }
    }

    static void disArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }

    }

    public static void main(String[] args) {

        System.out.println("enter 10 numbers");
        P10 obj = new P10();
        int arr[] = new int[3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }

        reverse(arr);
        disArr(arr);

    }

}
