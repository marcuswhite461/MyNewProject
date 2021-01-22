import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void Main()
    {
       Scanner scrn = new Scanner(System.in);
       
       String newColor = scrn.next();
       
        Train train = new Train();
        Train myTrain = new Train(15,"green", "Samson", true);
        System.out.println(myTrain);
        myTrain.printTrain();
        
        Train fTrain = new Train(6,"green", "Percy", false);
        fTrain.printTrain();
        System.out.println("What color do you want");
        fTrain.setColor(newColor);
        System.out.printf("Tom is %s\n", fTrain.getColor());
        
        Train ffTrain = new Train(616, "black", "Homie", true);
       ffTrain.printTrain();
        
        
        
    }
   
}

