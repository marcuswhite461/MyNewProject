import java.util.Scanner;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
 


   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int a1,b1,c1;
      int a2,b2,c2;
      boolean ifSatify;
      boolean ifSatify2;
      boolean solFound = false;
      int xSol = 0;
      int ySol = 0;
      //input
      a1 = scnr.nextInt();
      b1 = scnr.nextInt();
      c1 = scnr.nextInt();
      a2 = scnr.nextInt();
      b2 = scnr.nextInt();
      c2 = scnr.nextInt();
      
      for(int x = -10; x <= 10; x++){
          for(int y = -10; y <= 10; y++){
              
              ifSatify = (a1*x + b1*y == c1);
              ifSatify2 = (a2*x + b2*y == c2);
              if(ifSatify && ifSatify2){
                  
                  solFound = true;
                  xSol = x;
                  ySol = y;
                  break;
                  
                }
              
             
            }
          
          
        }
        
          if(solFound){
                    System.out.println(xSol + " " + ySol);
                    
                }else {
                    System.out.println("No Solution");
                    
                    
                }
     
   }

}
