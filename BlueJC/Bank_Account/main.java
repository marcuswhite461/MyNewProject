
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main {
    public static void main (String args[]) {
        int errors = 0;
        System.out.println("Testing begins");

        BankAccount b = new BankAccount("Mickey", 500);

        if(b.getSavings() != 1000.0) {
             errors++;
             System.out.println("Savings should be 1000.0");
             
        }
        b.setChecking(500);
        b.setSavings(500);
        b.withdrawSavings(100);
        b.withdrawChecking(100);
        b.transferToSavings(300);
        System.out.println("Errors: " + errors);
             System.out.println("Testing ends");

    }
}