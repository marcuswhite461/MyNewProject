import java.text.DecimalFormat;
/**
 * Write a description of class CovidEntry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CovidEntry implements Comparable
{
    // instance variables - replace the example below with your own
    private String state;
    private int month,day,dailyD,dailyIn,totalD,totalIn;
    
    private static DecimalFormat df = new DecimalFormat ("#,###,###");
    /**
     * Constructor for objects of class CovidEntry
     */
    public CovidEntry(String st, int m, int d, int di, int dd, int ti, int td)
    {
        // initialise instance variables
        this.state = st;
        this.month = m;
        this.day = d;
        this.dailyD = dd;
        this.dailyIn = di;
        this.totalD = td;
        this.totalIn = ti;
        
        
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public String getState(){
        return state;
    }
    
    public int getDailyInfections(){
        return dailyIn;
    }
    public int getDailyDeaths(){
        return dailyD;
    }
    public int getTotalDeaths(){
        return totalD;
    }
    public int getTotalInfections(){
        return totalIn;
    }
    public String toString(){
        return state + " " + month + 
        "/" + day +
        " " + df.format(dailyIn) + " infections" +
        " " + df.format(dailyD) + " deaths";
        
    }
    
    public int compareTo(Object other){
 CovidEntry c = (CovidEntry) other;
 return c.getDailyDeaths() - dailyD;
 }
    
    
    
    
    
   
}
