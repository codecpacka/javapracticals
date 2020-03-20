import java.util.Scanner;

import jdk.nashorn.api.tree.CaseTree;

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

        char[] a = new char[3];

        int count = 0;
        for (int i = 0; i < in.length(); i++) {
            Character c = Character.valueOf(in.charAt(i));
            char p = c.charValue();

            if (p == ' ') {
                // System.out.println("blank");
                continue;
            }
            System.out.print(s1.charAt(i));
            a[count] = s1.charAt(i);
            count++;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            System.out.print(a[i] + " ");
        }

    }

}