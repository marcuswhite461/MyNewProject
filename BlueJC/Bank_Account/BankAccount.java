
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private String customerID;
    private double savingsBal;
    private double checkingBal;
    /*Constructor 
     * @param n Customer name of the bank account
     * @param amt Value that sets the Checking Balance
     */
    public BankAccount(String n, int amt) {
        customerID = n;
        checkingBal = amt;
        savingsBal = 1000;
        
        
        
    }
    
    public void setName (String n) {
        
        customerID = n;
    }
    public void setChecking(double amt){
        checkingBal = amt;
    }
    public void setSavings(double amt){
        savingsBal = amt;
        
    }
    
    public String getName(){
        return customerID;
        
    }
    public double getChecking() {
        
        return checkingBal;
    }
    public double getSavings() {
        
        return savingsBal;
        
    }
    
    public void depositChecking(double amt) {
     if (amt > 0 ) {
     checkingBal += amt;    
         
        }
    }
     public void depositSavings(double amt) {
         if ( amt > 0) {
         savingsBal += amt;
             
            }
         
         
        }
        
    public void withdrawChecking(double amt) {
        if( amt > 0) {
         checkingBal -= amt;   
        }
        
    }
    public void withdrawSavings(double amt) {
         if ( amt > 0) {
         savingsBal -= amt;
             
            }
         
         
        }
        
    public void transferToSavings(double amt) {
     if (amt > 0) {
     checkingBal -= amt;
     savingsBal += amt ;
        }
        
    }
    
    
}
   


        
        


    
 
