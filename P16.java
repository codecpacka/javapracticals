
import java.util.Scanner;

public class P16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :- ");
        String num = sc.nextLine();
        System.out.println(num);
        int k = 0;
        int count = 0;

        for (int i = 0; i < num.length(); i++) {
            Character c = Character.valueOf(num.charAt(i));
            char p = c.charValue();
            if (p == '.') {
                count++;
                k = i;
            }
        }
        if (count == 1) {
            int a = Integer.parseInt(num.substring(0, k));
            float b = Integer.parseInt(num.substring(k + 1));
            // System.out.println(a + "+" + b);
            if (b > 0) {
                System.out.println("fraction number");
            } else {
                System.out.println("not fraction");
            }

        }

        else {
            System.out.println("not fraction");
        }

    }
}
