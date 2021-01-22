/**************************************************
 * Lab exam Fall 2020 class Course 
 * 
 * @author: Marcus F. White Jr
 ***************************************************/
public class Course {
    
       private String name;
       private int section;
       private String semester;
       private int year;
   
    private int [] grades;

    /*******************************
     * default constructor
     *******************************/
    public Course()    {
        // Do not modify these variables names or values
        name = "CIS162";
        section = 2;
        semester = "winter";
        year = 2020;
    }

    // TODO: Define second constructor to initialize 
    //       private fields (name, section, semester, year)
        public Course(String n, int sect, String s, int y){
          this.name = n;
          this.section = sect;
          this.semester = s;
          this.year = y;
            
        }
    // TODO: Define getters and setters methods:
    public String getName(){
     return name;   
        
    }
    public int getSection(){
       return section; 
        
    }
    public String getSemester(){
        return semester;
        
    }
    public int getYear(){
     return year;   
     
    }
    public int [] getGrades(){
        
        return grades;
    }
    public int getNumberStudents(){
        int num = 0;
        for(int i = 0; i < grades.length; i++){
            num++;
            
        }
        
        return num;
    }
    
    
    public void setName(String n) {
       this.name = n; 
        
    }
    public void setSection(int sect){
       this.section = sect; 
        
    }
    public void setSemester(String s){
       this.semester = s; 
        
    }
    public void setYear(int y){
        this.year = y;
        
    }
    // TODO: Define populateGrades() method
    public void populateGrades(int [] nums){
        int num = 0;
        
       for(int i = 0; i < nums.length; i++){
        num++;
        grades = new int[num];
        for(int j = 0; j < grades.length; j++){
           if(nums[i] >= 0 && nums[i] <= 100){
                grades[j] = nums[j];
                 
            }
            else {
              nums[i] = 0;  
            }
        }
        }
    }
    // TODO: Define getAverage() method
    public int getAverage(){
        int sum = 0;
        int c = 0;
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
           c++;
        }
        sum = sum / c;
        return sum;
    }
    // TODO: Define getHighest() method
    public int getHighest(){
        int high = 0;
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > high){
               high = grades[i]; 
            }
        }
        return high;
    }
    // TODO: Define countGrades() method
    public int countGrades(int value){
        int great = 0;
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > value){
                great++;
            }
        }
        return great;
    }
    // TODO: Define changeGrade() method
    public boolean changeGrade(int index, int grade){
        if(index > 0 && index < 7 && grade > 0 && grade < 100){
            grades[index] = grade;
            return true;
        }
        else {
            return false;
        }
    }
    // TODO: Define makeCurve() method
    public void makeCurve(int value){
        for(int i = 0; i < grades.length; i++){
            grades[i] += value; 
            if(grades[i] > 100){
               grades[i] = 100; 
                
            }
        }
    }
    
    /*************************************************
     * @param int - numeric value of grade
     * @return String- letter associated with value
     **************************************************/
    private String convertGradeToLetter(int grade) {
        if (grade >= 93)
            return "A";
        if (grade >= 83)
            return "B";
        if (grade >= 73)
            return "C";
        if (grade >= 60)
            return "D";
        return "F";
    }

    /*******************************
     *prints grades - one per line
     *******************************/
    public void printGrades( ) {
        for (int i = 0 ; i < grades.length ; i++) 
            System.out.println ("Student " + (i + 1) + ": " + grades[i] + 
                " - " + convertGradeToLetter (grades[i]));
    }

    /*******************************
     * @return String - converts the course to a String
     *******************************/
    public String toString () {
        String s = "";
        s += "Course Name: "+ name + " Section: " + section;
        s += "\nSemester: " + semester + " " + year;    
        s += "\nAverage grade: " + getAverage () + 
        " - " + convertGradeToLetter(getAverage());
        s += "\nHighest grade: " + getHighest() + 
        " - " + convertGradeToLetter(getHighest());
        return s;

    }

    /*******************************
     * main method to test class
     *******************************/
    public static void main () {
        /* Default constructor is given*/
        Course c = new Course ("CIS162 ",  2,  "winter ",  2020);
           
        // TODO: Invoke Populate Grades
          c.populateGrades(new int [] {93,68,74,75,77,81,90,94,88,72});
        // TODO: Invoke makeCurve to add 10 points to each grades
           c.makeCurve(10);
        // TODO: Printout object using toString method 
            System.out.println( c.toString());
           
           
           
            
        System.out.println ("\nGrades");
        System.out.println ("======");
        c.printGrades ();
    }
}