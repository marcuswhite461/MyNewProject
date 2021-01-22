import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
   public static void sampleReadData(String filename){
Scanner inFS = null;
FileInputStream fileByteStream = null;

try{
// open the File and set delimiters
fileByteStream = new FileInputStream(filename);
inFS = new Scanner(fileByteStream);
 inFS.useDelimiter("[,\r\n]+");

// continue while there is more data to read
while(inFS.hasNext()) {

// read three data elements
String name = inFS.next();
int age = inFS.nextInt();
double gpa = inFS.nextDouble();
System.out.println("Name: " + name + "Age: " + age + "GPA " + gpa);
System.out.println("Name: " + name + "Age: " + age + "GPA " + gpa);
}
fileByteStream.close();

// error while reading the file
}catch(IOException error1) {
System.out.println("Oops! Error related to: " + filename);
}

}
    public static void main(String[] args){
        sampleReadData("sample_data.csv.txt");
        sampleReadData("Covid_data.csv.txt");
    }
}
