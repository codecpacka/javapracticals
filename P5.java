import java.util.*;

public class P5 {
    public static void main(String[] args) {
        sort p = new sort();
        Scanner s = new Scanner(System.in);
        System.out.print("enter 1st  number ");
        int a = s.nextInt();
        System.out.print("enter 2nd number ");
        int b = s.nextInt();
        System.out.print("enter 3rd number ");
        int c = s.nextInt();
        p.max(a, b, c);
    }
}

class sort {
    int a, b, c;

    public void max(int k, int l, int m) {
        a = k;
        b = l;
        c = m;

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                }

                else {
                    System.out.println(a);
                    System.out.println(c);
                    System.out.println(b);
                }

            }
        }

        else if (b > c) {

            System.out.println(b);
            if (a > c) {
                System.out.println(a);
                System.out.println(c);
            }

            else {
                System.out.println(c);
                System.out.println(a);

            }
        }

        else if (c > a) {

            System.out.println(c);
            if (a > b) {
                System.out.println(a);
                System.out.println(b);
            }

            else {
                System.out.println(b);
                System.out.println(a);

            }

        }

    }

}
