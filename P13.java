import java.util.Scanner;

/**
 * P13
 */
public class P13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter eq :- ");
        String tr = sc.nextLine();
        String eq = tr.replaceAll(" ", "");
        System.out.println(eq);
        int k = 0;

        for (int i = 0; i < eq.length(); i++) {
            Character c = Character.valueOf(eq.charAt(i));
            char p = c.charValue();
            if (p == '+') {
                System.out.println("+");
                k = i;
            }
        }
        // int k = Integer.parseInt(c.charValue());/
        // p13 p=new p13();
        System.out.println(k);
        System.out.println(eq.charAt(k));
        int a = Integer.parseInt(eq.substring(0, k));
        int b = Integer.parseInt(eq.substring(k + 1));
        System.out.println(a + " " + b);

        switch (eq.charAt(k)) {
            case '+':
                System.out.println(a + b);

                break;
            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a + b);
                break;
            case '/':
                System.out.println(a / b);
                break;

            default:
                break;
        }

    }
}