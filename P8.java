import java.util.Scanner;

class Factorial {
    void findFact(int a) {
        System.out.print("factos are :- ");
        for (int i = 2; i <= a; i++) {
            if (a == 1)
                break;
            else if (a % i == 0) {
                System.out.print(i + " ");
                a = a / i;
                i--;
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
        System.out.print("enter a number:-  ");
        int a = s.nextInt();
        f.findFact(a);
    }

}