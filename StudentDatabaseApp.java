//Student DataBase
//Vincenzo D'Aria
import java.util.Scanner;

public class StudentDatabaseApp{
  
  public static void main(String[]args){
    String addStudentResponse = "";
    Scanner in = new Scanner(System.in);
      
    System.out.print("How many students do you want to add?: ");
    int quantityStudents = in.nextInt();
    System.out.println("\nOkay, adding " + quantityStudents + " student[s]...\n");
      
    //add 'n' number of new students
    Student[] students = new Student[quantityStudents]; //Array defining # of new students
    
    int n = 0;
    
    for(n = 0; n < quantityStudents; n++){
      
      students[n] = new Student();
      students[n].enroll();
      students[n].payTuition();
      System.out.println(students[n].toString());
    }
    
  }
  
}