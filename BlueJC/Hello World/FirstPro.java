
/**
* Write a description of class FirstPro here.
*
* @author (your name)
* @version (a version number or a date)
*/
import java.util.Scanner;
public class FirstPro
{
// instance variables - replace the example below with your own
private int x;

/**
 * Constructor for objects of class FirstPro
 */
public FirstPro()
{
    // initialise instance variables
    x = 0;
}

/**
 * An example of a method - replace this comment with your own
 *
 * @param  y  a sample parameter for a method
 * @return    the sum of x and y
 */
public static void main(String [] args)
{
    System.out.println("What is your name");
    
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    
        System.out.println("Hello " + name);
        String bruh = new String("Bro what");
    String string = "Thus s a stmv " + bruh;
    System.out.println(string);

    }
}
