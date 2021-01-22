import java.text.DecimalFormat;
/**
 * Write a description of class GVdate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GVdate
{
    //declared instance variables
    private int month;
    private int day;
    private int year;
    final int BMONTH = 2;
    final int BDAY = 4;
private static DecimalFormat df = new DecimalFormat("00"); 
    //default constructor where variables are assigned values
    public GVdate() {
        month = 10;
        day = 12;
        year = 2020;
        

    }
    //Second constructor
    public GVdate(String date) {
        
        int Slash = date.indexOf ("/");
        int secSlash = date.indexOf("/", 3);
        int m = Integer.parseInt (date.substring (0, Slash));
        int d = Integer.parseInt (date.substring (Slash + 1, secSlash));
        int y = Integer.parseInt (date.substring (secSlash + 1));
        if(isDateValid(m,d,y) == true){
         month = m;
        day = d;
        year = y;
            
        }
        else {
            month = 10;
            day = 12;
            year = 2020;
            
        }
        
        System.out.println(month);
    }
    //Third constructor
    public GVdate(int m, int d, int y) {

        
        if(isDateValid(m,d,y) == true){
            month = m;
        day = d;
        year = y;
            
        }
        else {
            month = 10;
            day = 12;
            year = 2020;
            
        }
       

    }
    
    //block gets the month, day, and year
    public int getMonth() {

        return month;
    }
    public int getDay() {

        return day;  

    }
    public int getYear() {

        return year;
    }

    //converts the values into an actual date
    public String toString() {

        return String.format("%d/%d/%d",month,day,year );
    } 
    //formats the date 4 different ways
    public String toString(int format) {
        String result = "";
         String[] months = {"None","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
         String [] monthsLong = {"None","January","Febuary","March","April","May","June","July","Augest","September","October","November","December"};
        switch(format){ 
           
            case 1: 
            result = this.toString(); break;
            
            case 2: 
            result = df.format(month) + "/" + df.format(day) + "/" + year; break; 
            
            case 3:
            result = months[month] + " " + df.format(day) + ", " + year; break;
            
            case 4: 
            result = monthsLong[month] + " " + df.format(day) + ", " + year; break;
            
        }
        return result;
     
    }
    
    //checks whether its my birthday today
    public boolean isMyBirthday() {
        if (month == BMONTH && day == BDAY) {
            return true;   

        }
        else {
            return false;   

        }

    }
    //Checks to see if the year is a leap year
    public boolean isLeapYear(int y){
        return y % 400 == 0 || y % 4 == 0 && y % 100 != 0;

        
       

    }

    /*
     * gets the last day of a month
     * 
     */
     private int getLastDayOfMonth(int m, int y){
      

        
        if (m <= 12) {
            if (m <= 7 && m != 2){
                
                if (m % 2 == 0) {
                    
                    return m = 30;
                }
                else {
                    
                    return m = 31;
                }

            } 
            if(m >= 7 && m <= 12) {
                
                if (m % 2 != 0) {
                    return m = 30;
                    
                }
                else {
                    return m = 31;
                }
                
            }
            
            else if (m == 2) {
                
                if(isLeapYear(y) ) {
                    return m = 29;
                    
                    
                }
                else if (isLeapYear(y) == false) {
                    
                    return m = 28;
                }
                
            }
           
            
        }
        else {
            System.out.println("Not a valid month");
           
        }
        return m;
        
    }
    //Checks to see if the date vaild 
    public boolean isDateValid(int m, int d, int y) {
        
            if(d <= getLastDayOfMonth(m,y) && d > 0 && m <= 12 && m > 0 && y >= 0 ){
              return true;
                
                
            }
            
           
            
            else {
                
                return false;
            }
            
            
        
        
        
    }
    //block sets month, day, year, and date
    public void setMonth(int m) { 
        if(isDateValid(m,day,year)){
            
        month = m;
        
            
        }
        else {
           System.out.println("Error");
            
        }

    }
    public void setDay(int d) {
        
          if(isDateValid(month,d,year)){
            
        day = d;
        
            
        }
        else {
           System.out.println("Error");
            
        }

    }
    public void setYear(int y) {
        if(isDateValid(month,day,y)){
            
        year = y;
        
            
        }
        else {
           System.out.println("Error");
            
        }

    }
    public void setDate(int m, int d, int y) {
        
         if(isDateValid(m, d, y)){
             month = m;
        day = d;  
        year = y;
            
            
            
        }
        else {
            System.out.println("Error");
        }
    }
    //Advances the day by 1
    public void nextDay(){
        
        if(day == getLastDayOfMonth(month,year) ){
            if(year == 12 && isLeapYear(year)){
            day =1 ;
            month += 1;
            
            
        }
        
        day = 1;
        month += 1;
        
        if (month > 12) {
            month = 1;
           year += 1; 
        }
        
            
      }
      else if (day < getLastDayOfMonth(month,year)){
          
          day += 1;
        }
        
       
        
        
        
        
    }
    //Checks to see if two dates are the same
    public boolean equals(GVdate otherDate){
        
        
       if(otherDate.month == month && otherDate.day == day && otherDate.year == year) {
         return true;  
           
        }
        else {
         return false;   
        }
      
    }
    //Changes the date by the amount of days provided
    public void skipAhead(int numDays){
        int size = numDays;
        
        if(size < 0 ) {
            
            
        }
        else {
         for(int i = 0; i < size; i++){
            nextDay();
            
        }   
            
        }
        
    }

}
