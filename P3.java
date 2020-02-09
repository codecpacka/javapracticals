import java.util.*;

/*
 * P3 ///converting meter into feet by passing arguments
 */
class Met2Feet {
    double f;

    public double convert(int m) {
        f = m * 3.2;
        // System.out.println(f);
        return f;

    }

}

public class P3 {
    public double c;
    public int x;

    public static void main(String[] args) {
        Met2Feet obj = new Met2Feet();
        System.out.print("enter length  in meter:- ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double c = obj.convert(x);
        System.out.println("length in feet is:- " + c);

    }

}