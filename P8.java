import java.util.Scanner;

class Factorial {
    void findFact(int a) {
        for (int i = 2; i <= a || a == 1; i++) {

            if (a % i == 0) {
                System.out.println(i);
                a = a / i;
                i--;
            }

            else if (a == i) {
                System.out.println("number is prime");
            }
        }

    }

}

/**
 * P8
 */
public class P8 {

    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number:-  ");
        int a = s.nextInt();
        f.findFact(a);
    }

}