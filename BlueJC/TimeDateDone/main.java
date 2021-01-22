
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String [] args) {
        int error = 0;
        System.out.println("Testing Begins");

        //test the get month and day method
        GVdate today = new GVdate();
        if (today.getMonth() != 10){
            System.out.println("month should be 10");
            error++;
        }
        if (today.getDay() != 12){
            System.out.println("day should be 12");
            error++;
        }
        //test leap year method
        GVdate leap = new GVdate();
        if(leap.isLeapYear(2020) != true){
            System.out.println("Should be true");
            error++;
        }

        
        GVdate bDay = new GVdate();

        if(bDay.isMyBirthday() == true) {
            System.out.println("Thats wrong its not");
            error++;
        }
        else {
            System.out.println("Thats correct Birthday");   
        }
        GVdate myDate = new GVdate(2,28,2021);
        boolean yes = myDate.equals(today);
        if(yes == false){
            System.out.println("Those days are not the same");
        }
        else {
         System.out.println("Those days are the same");   
            
        }
         
        System.out.println("Date: " + myDate);
        myDate.nextDay();
        
        System.out.println("Next Day: " + myDate);
        
        System.out.println("Errors: " + error);
        System.out.println("Testing ends");
        GVdate b = new GVdate();
        System.out.println(b.toString(1));
        System.out.println(b.toString(3));
        
    }

}
