
public class uyi {
    public static void main(String[] args) {
        int bal = 4;
        int wid = 30;
        try {
            Integer i = Integer.parseInt("10", 2);
            throw new NumberFormatException(" balance is low ");

        } catch (NumberFormatException e) {
            System.out.println("money error" + e.getMessage());
        }

        finally {

            System.out.println("balance is " + bal);
        }
    }

}