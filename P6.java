import java.util.*;

class IsVowel {
    public void checkVowel(String a) {
        switch (a) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("vowel");
                break;

            default:
                System.out.println("consonent");
                break;
        }
    }
}

/**
 * P6
 */
public class P6 {
    public static void main(String[] args) {
        IsVowel i = new IsVowel();
        Scanner s = new Scanner(System.in);
        System.out.print("enter a letter:- ");
        String p = s.next();
        i.checkVowel(p);
    }

}