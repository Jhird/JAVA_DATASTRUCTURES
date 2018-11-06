import java.util.ArrayList;

public class GradeAnalyzer{
  
  // Constructor
  GradeAnalyzer(){
    
  }
  
  // Determine average
  public int getAverage(ArrayList<Integer> grades){
    if (grades.size() < 1){
      System.out.println("Input is empty. Please enter an array of size>2");
      return 0;
    }
    
    else{
      int sum = 0;
      for (int grade:grades){
        sum = sum + grade;
      }
      int average = sum/grades.size();
      System.out.println(average);
      return average;
    }
  }
  
  // Find minimum
  public int getMin(ArrayList<Integer> grades){
    
    int g = 100;
    
    for (int grade: grades){
      if (grade < g){
        g = grade;
      }
    }
    System.out.println("The minimum grade is " + g);
    return g;
  }
  
  public int getMax(ArrayList<Integer> grades){
    
    int g = 0;
    
    for (int grade: grades){
      if (grade > g){
        g = grade;
      }
    }
    System.out.println("The maximum grade is " + g);
    return g;
  }
  
  
  
  public static void main(String[] args){
    
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    
    myAnalyzer.getAverage(myClassroom);
    myAnalyzer.getMin(myClassroom);
    myAnalyzer.getMax(myClassroom);
  }
}