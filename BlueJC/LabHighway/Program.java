
/**
 * Write a description of class Program here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
      boolean isAuxiliary = false;
      String highwayDir;

      highwayNumber = scnr.nextInt();
      //invaild highwayNum
      if ( highwayNumber > 999 || highwayNumber < 1 ) {
          
          System.out.println(highwayNumber + " is a Invaild Number");
          
        }
        else { //Aux
         if (highwayNumber > 99 ){
             isAuxiliary = true;
             //using modulo
             primaryNumber = highwayNumber % 100;
             
            }
            //Primary
            else {
                primaryNumber = highwayNumber;
                
            } //Even or odd logic
            if ((primaryNumber % 2) == 0) {
                
                highwayDir = "east/west";
                
            }
            else {
             highwayDir = "north/south";   
            }
            
            //Final print out
            
            if (isAuxiliary ){
             System.out.printf("I-%d is auxiliary, serving I-%d, going %s.\n", highwayNumber, primaryNumber, highwayDir );  
                
            }
            else{
                System.out.printf("I-%d is primary, going %s.\n", primaryNumber, highwayDir );
            }
        }
      
      
     
   }
}
