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
        int count = 0;

        for (int i = 0; i < eq.length(); i++) {
            Character c = Character.valueOf(eq.charAt(i));
            char p = c.charValue();
            if (p == '+' || p == '-' || p == '*' || p == '/' || p == '%') {
                count++;
                k = i;
            }
        }
        if (count == 1) {
            System.out.println("opertor at " + k);
            System.out.println("operator is " + eq.charAt(k));
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
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;

                default:
                    break;
            }
        }

        else {
            System.out.println("invalid operator");
        }

    }
}