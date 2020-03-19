import java.util.Scanner;

class Gcd {
    public int gcdCalc(int a, int b) {
        if (a == b)
            return a;

        if (a % b == 0)
            return b;

        if (b % a == 0)
            return a;
        if (a > b)
            return (gcdCalc(a % b, b));
        else
            return (gcdCalc(a, b % a));

    }
}

/**
 * P9
 */
public class P9 {

    public static void main(String[] args) {
        Gcd obj = new Gcd();
        Scanner s = new Scanner(System.in);
        System.out.print("enter 1st number:- ");
        int a = s.nextInt();
        System.out.print("enter 2nd number:- ");
        int b = s.nextInt();
        int gcd = obj.gcdCalc(a, b);
        System.out.println("gcd is " + gcd);
    }
}