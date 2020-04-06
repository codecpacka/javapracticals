import java.util.Scanner;

/**
 * P15
 */
public class P15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary number/decimal no");
        String s = sc.nextLine();
        bin2Dec(s);
    }

    static void bin2Dec(String s) {
        try {
            Integer i = Integer.parseInt(s, 2);
            System.out.println(i + "= binary equivalent");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception    " + e.getMessage());

        }

    }
}