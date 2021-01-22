
/**
 * Write a description of class Train here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Train
{
    // instance variables - replace the example below with your own
    private int idNum;
    private String color;
    private String Name;
    private boolean isDiesel;

    /**
     * Default Constructor for objects of class Train
     */
    public Train()
    {
        // initialise instance variables
        this.idNum = -1;
        this.color = "000000";
        this.Name = "no name yet";
        this.isDiesel = false;
    }
    /**
     * COnstructor for objects of class train
     */
    public Train(int number, String color, String name, boolean isDiesel){
        
        this.idNum = number;
        this.color = color;
        this.Name = name;
        this.isDiesel = isDiesel;
        
    }
    
    /**prints the train object
     * 
     */
    public void printTrain(){
      
        
        
        System.out.printf("%s is a %s train whose number is %d\n", Name, color, idNum);
        
        
        
    }
    
    public String getColor(){
        
        return this.color;
        
    }
    
    public void setColor(String color){
        
        this.color = color;
        
    }
    

    
}
