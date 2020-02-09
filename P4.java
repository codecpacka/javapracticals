
/**
 * P4
 *
 */
import java.util.*;

public class P4 {
    int h, w;

    public static void main(String[] args) {
        Bmi obj = new Bmi();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your height in inches :-");
        int h = sc.nextInt();
        System.out.print("enter your weight in pounds :-");
        int w = sc.nextInt();
        obj.bmiFinder(h, w);
    }
}

class Bmi {
    static double pound = 0.45359237, inche = 0.0254;
    double bmi;

    public void bmiFinder(double h, double w) {
        h = pound * h;
        w = inche * w;
        System.out.println("h= " + h + " meter");
        System.out.println("w= " + w + " kg");
        bmi = (float) (w / (h * h));

        System.out.println("bmi is " + bmi);
    }

}