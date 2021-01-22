import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;

/**
 * Write a description of class CovidDatabase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CovidDatabase
{
    // instance variables - replace the example below with your own
    private ArrayList<CovidEntry> CovidEntryList;
    private static final int SAFE = 5;
    public CovidDatabase()
    {
        // initialise instance variables
        CovidEntryList =  new ArrayList<CovidEntry>();
    }

    public void readCovidData(String filename){
        Scanner inFS = null;
        FileInputStream fileByteStream = null;

        try{
            // open the File and set delimiters
            fileByteStream = new FileInputStream(filename);
            inFS = new Scanner(fileByteStream);
            inFS.useDelimiter("[,\r\n]+");
            //TODO: Read the first line of the file
            inFS.nextLine();
            // continue while there is more data to read
            while(inFS.hasNext()) {

                // read three data elements
                String state = inFS.next();
                int month = inFS.nextInt();
                int day = inFS.nextInt();
                int di = inFS.nextInt();
                int dd = inFS.nextInt();
                int ti = inFS.nextInt();
                int td = inFS.nextInt();

                CovidEntry temp = new CovidEntry(state, month, day, di,dd,ti,td);
                CovidEntryList.add(temp);

            }
            //System.out.println(CovidEntryList);
            fileByteStream.close();

            // error while reading the file
        }catch(IOException error1) {
            System.out.println("Oops! Error related to: " + filename);
        }

    }

    public int countRecords(){
        return CovidEntryList.size();
    }

    public int getTotalDeaths() {
        int total = 0;
        for(CovidEntry entry : CovidEntryList) {
            total += entry.getTotalDeaths();

        }
        return total;
    }

    public int getTotalInfections (){
        int total = 0;
        for(CovidEntry entry : CovidEntryList){
            total += entry.getTotalInfections();

        }
        return total; 
    }

    public int countTotalDeaths(int m, int d){
        int total = 0;
        for(CovidEntry entry : CovidEntryList){
            if(entry.getMonth() == m && entry.getDay() == d){
                total += entry.getTotalDeaths();  
            }
        }
        return total;
    }

    public int countTotalInfections(int m, int d){
        int total = 0;
        for (CovidEntry entry : CovidEntryList){
            if(entry.getMonth() == m && entry.getDay() == d){
                total += entry.getTotalInfections();

            }

        }
        return total;
    }

    public ArrayList <CovidEntry> safeToOpen(String st){
        int c = 1;
        ArrayList<CovidEntry> result = new ArrayList<CovidEntry>();
        int current = 100000;
        boolean safe = false;
        for(CovidEntry entry : CovidEntryList){
            if(entry.getState().equalsIgnoreCase(st)) {
                if(entry.getDailyInfections() < current){
                    c++; 
                    current = entry.getDailyInfections();
                    result.add(entry);

                }
                else{
                    c = 1;
                    current = entry.getDailyInfections();
                    result.clear();
                    result.add(entry);

                }
            }
            if(c == SAFE){
                safe = true;
                break; 
            }
        }
        if(safe == true){
            return result;
        }
        else {
            return null;  
        }
    }

    public ArrayList <CovidEntry> listMinimumDailyInfections(int m, int d, int min){
        ArrayList<CovidEntry> result = new ArrayList<CovidEntry>();
        for(CovidEntry entry : CovidEntryList){
            if(entry.getMonth() == m & entry.getDay() == d && entry.getDailyInfections() >= min) {
                result.add(entry);
            }
        }
        return result;
    }

    public CovidEntry peakDailyDeaths(String st){
        CovidEntry result = new CovidEntry("",0,0,0,0,0,0);
        int max = -1;
        for(CovidEntry entry: CovidEntryList){
            if(entry.getState().equalsIgnoreCase(st)){
                if(entry.getDailyDeaths() > max){
                    max = entry.getDailyDeaths();
                    result = entry;
                }
            }
            
           

        }
       if(max > -1){
            return result;
        }
        else {
            return null;  
        }
        
    }
    public CovidEntry peakDailyDeaths(int m, int d){
        CovidEntry result = new CovidEntry("",0,0,0,0,0,0);
       int max = -1;
       
        for(CovidEntry entry : CovidEntryList){
            if(entry.getMonth() == m && entry.getDay() == d){
                if(entry.getDailyDeaths() > max){
                    max = entry.getDailyDeaths();
                 result = entry; 
                 
                }
               
            }
            
        }
        if(max > -1){
            return result;
        }
        else {
            return null;  
        }
       

        
    }

    public CovidEntry mostTotalDeaths(){
        CovidEntry result = new CovidEntry("",0,0,0,0,0,0);

        return result;

    }

    public ArrayList<CovidEntry> getDailyDeaths(int m,int d){
        ArrayList<CovidEntry> result = new ArrayList<CovidEntry>();
        for(CovidEntry entry : CovidEntryList){
            if(entry.getMonth() == m && entry.getDay() == d){
                result.add(entry);
            }
        }
        return result;
    }

    public ArrayList<CovidEntry> topTenDeaths(int m,int d){
        ArrayList<CovidEntry> allDeaths = new ArrayList<CovidEntry>();
        allDeaths = getDailyDeaths(m, d);
        Collections.sort(allDeaths);
        ArrayList<CovidEntry> result = new ArrayList<CovidEntry>();
        for(int i = 0; i < 10; ++i){
            result.add(allDeaths.get(i));
        }
        return result;
    }

}
