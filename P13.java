import java.util.Scanner;

/**
 * P13
 */
public class P13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter expr:- ");
        String in = sc.nextLine();
        String s1 = new String(in);
        System.out.println(s1);
        for (int i = 0; i < in.length(); i++) {
            Character c = Character.valueOf(in.charAt(i));
            char p = c.charValue();

            if (p == ' ') {
                System.out.println("blank");
                continue;
            }
            System.out.println(s1.charAt(i));

        }
        System.out.println(s1.length());
    }

}