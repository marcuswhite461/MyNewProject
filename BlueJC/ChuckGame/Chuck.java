import java.util.Arrays;
/**
 * Write a description of class Chuck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chuck
{
    // instance variables
    private int credits;
    GVdie[]dice;
    private String currMessage;
    boolean[] bets;
    
    
    
    /**
     * Constructor for objects of class Chuck
     */
    public Chuck()
    {
        // initialise instance variables
        dice = new GVdie[3];
        
        currMessage = " ";
        bets = new boolean[9];
        credits = 10;
        for(int i = 0; i < 3; i++){
            dice[i] = new GVdie(); 
            dice[i].setBlank();
           
        }
        for(int i = 0; i < 9; i++){
         bets[i] = false;   
            
        }
        
        
    }
    //Rolls the three dice while also starting the round
    public void roll() {
        
     for(int i = 0; i < 3; i++){
         if(enoughCredits() == true){
             dice[i].roll();
             
            }
            else{
                currMessage = "Not enough credits";
                dice[i].setBlank();
            }
         
        }
       checkAllBets();
       clearAllBets();
        
    }
    //gets the total amount of credits
    public int getCredits(){
       
        return credits;
    }
    //gets the current message
    public String getMessage() {
        
     return currMessage;   
        
    }
    //Returns the dice
    public GVdie [] getDice (){
        
     return dice;   
        
    }
    //gets the sum of roll
    private int getSumDiceValues() {
        
     int sum = 0;
     for(int i = 0; i < 3; i++){
         sum += dice[i].getValue();
         
        }
     return sum;
        
    }
    //checks to see if two dice match
    private boolean isDoubles(int num) {
        int c = 0;
     for(int i = 0; i < 3; i++) {
         
         
         
          if(dice[i].getValue() == num) {
                 c++;
                }
            if(c == 2) {
                
                return true;
            }
            else {
                
            return false;    
            }
             
            
            
        
        }
        return false;
    }
    //check to see if player has enough credits
    public boolean enoughCredits(){
        int c = 0;
       for(int i = 0; i < 9; i++){
           if(bets[i] == true){
             c++;  
               
            }
           
        }
        if(c <= credits){
            return true;
            
        }
        else{
            return false;
        }
        
    }
    //checks to see if all dice match
    private boolean isTriplets() {
      
        
        int num = dice[0].getValue();
        
        
        int match = 0;
        for(int i = 1; i < 3;i++) {
            if(num == dice[i].getValue() ) {
                match++;
              
                
            }
            
        }
          if(match == 2){
                   
                 return true;   
                    
                }
                else{
                 return false;   
                }
        
        
    }
    //Checks if player won betting large
    private void checkLarge() {
     int sum = getSumDiceValues(); 
     
     if(sum > 10 && !isTriplets()) {
         
         credits +=2;
         currMessage = "Player Won!";
         
        }
       
    }
        //Checks if player won betting small

    private void checkSmall() {
     int sum = getSumDiceValues(); 
     
     if(sum < 11 && !isTriplets()) {
         
         credits +=2;
         currMessage = "Player Won!";
         
        }
       
    }
    //checks the whole field
    private void checkField() {
     int sum = getSumDiceValues(); 
     
     if(sum < 8 ||sum > 12) {
         
         credits +=2;
         currMessage = "Player Won!";
         
        }
       
    }
    //checks if dice value matches a given number
    private void checkNumber(int num){
        int match = 0;
     for(int i = 0; i < 3; i++){
         
         if(dice[i].getValue() == num){
             match++;
             
            }
            
         
        }
        if(match == 3) {
               credits += 11; 
                
            }
            else if (match == 2) {
                
                credits += 3;
            }
            else if (match == 1){
             credits+=2;   
                
            }
        
    }
    //checks all the bets placed
    private void checkAllBets(){
     currMessage = ("Player Lost!");
     
     for(int i = 0; i < 9; i++){
         if(bets[i]){
             credits--;
             switch (i){
                 case 0: 
                 checkNumber(1);
                 break;
                 case 1:
                 checkNumber(2);
                 break;
                 case 2:
                 checkNumber(3);
                 break;
                 case 3:
                 checkNumber(4);
                 break;
                 case 4:
                 checkNumber(5);
                 break;
                 case 5:
                 checkNumber(6);
                 break;
                 case 6:
                 checkField();
                 break;
                 case 7:
                 checkSmall();
                 break;
                 case 8:
                 checkLarge();
                 break;
                }
            }
         
        }
        
    }
    //allows for testing of methids
    public void testRoll(int [] values){
     if(credits > 0) {
         //Checks for vaild input. Set otherwise
         for(int i = 0; i < 3; i++){
         if(values[i] < 1 || values[i] > 6){
             values[i] = 1;
            }
        }
        
    
        //Rolling each die until value matches incoming vale
        for(int i = 0; i < 3; i++){
         while(dice[i].getValue() != values[i]){
             dice[i].roll();
            }
            
        }
        checkAllBets();
        clearAllBets();
    } 
    }
    //gets the dice value and turns it into a string
    public String diceToString(){
       String form = "{";
 
        for(int i = 0; i < 3; i++){
            form += dice[i].getValue() + ", ";
        }
       form += "]";
       return form;
       
        
    }
    //allows player to add credits
    public void addCredits(int amount){
     if(amount < 0){
         credits = credits;
        }
        else if(amount > 0){
         credits += amount;   
            
        }
        
    }
    //allows player to place a bet
    public void placeBet(int bet){
        bets[bet - 1] = true;
        
    }
    //allow player to cancel a bet
    public void cancelBet(int bet){
        bets[bet - 1] = false;
        
    }
    //clears all bets
    public void clearAllBets() {
       for(int i = 0; i < 9; i++){
           bets[i] = false;
           
        }
        
    }
    //resets the game
    public void reset(){
        for(int i = 0; i < 3; i++){
             
            dice[i].setBlank();
            currMessage = " ";
            credits = 10;
            clearAllBets();
        }
        
    }
    

    
}
