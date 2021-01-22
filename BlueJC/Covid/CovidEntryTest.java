import java.util.Scanner;
/**
 * Write a description of class CovidEntryTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CovidEntryTest
{
    // instance variables - replace the example below with your own
   public static void main(String[] args){
       System.out.println("Testing Begins");
       CovidEntry sample = new CovidEntry("MI", 5, 4, 
       1000, 2000, 4, 3);
       System.out.println(sample);
       
       
       
       CovidDatabase db = new CovidDatabase();
       String s = "GVSU";
       String result = s.substring(0,4);
       System.out.println(result);
       db.readCovidData("covid_data.csv");
       System.out.println(db.peakDailyDeaths("MI"));
       System.out.println(db.peakDailyDeaths(5,4));
       System.out.println(db.safeToOpen("MI"));
      // System.out.println("Total " + db.getTotalDeaths(9, 27));
       System.out.println(db.topTenDeaths(5,5));
       System.out.println(db.listMinimumDailyInfections(6,12,1000));
       System.out.println("Testing ends: ");
    }
}
