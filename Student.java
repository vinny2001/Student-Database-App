import java.util.Scanner;

public class Student{
  private String firstName;
  private String lastName;
  private int gradeYear;
  private String studentID;
  private String courses = "";
  private int tuitionBalance;
  private static int courseCost = 600;
  private static int id = 1000;
  
  
  
  //Constructor: Enter Student's name and year
  public Student(){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter student first name: ");
    this.firstName = in.nextLine();
    System.out.println("\n");
    
    System.out.print("Enter student last name: ");
    this.lastName = in.nextLine();
    System.out.println("\n");
    
    System.out.print("Enter student grade level\n\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\n");
    this.gradeYear = in.nextInt();
    System.out.println("\n");
    
    setStudentID();
    
   
  }
  
  //Generate ID
  private void setStudentID(){
    //Grade Level + ID
    id++;
    this.studentID = gradeYear + "" + id;
    
  }
    

  //Enroll in courses
  
  public void enroll(){
    do{
      System.out.print("Enter course to enroll (Q to quit): ");
      Scanner in = new Scanner(System.in);
      System.out.println("\n");
      String course = in.nextLine();
      
      if (!course.equals ("Q")){
        
        courses = courses + "\n" + course;
        tuitionBalance = tuitionBalance + courseCost;
      }
      else { break; }
    }while (1!=0);
    
  }
  
  //View balance
  public void viewBalance(){
    
    System.out.println("Your Balance is: $" + tuitionBalance);
    
  }
  
  
  //Pay tuition
  public void payTuition(){
    viewBalance();
    System.out.print("Enter Your Payment: $");
    Scanner in = new Scanner(System.in);
    int payment = in.nextInt();
    System.out.println("\n");
    tuitionBalance = tuitionBalance - payment;
    System.out.println("Thank you for your payment of $" + payment);
    viewBalance();
    System.out.println("\n");
    
  }
  
  // Show status
  public String toString(){
    
    return "Name: " + firstName + " " + lastName +
           "\nGrade Level: " + gradeYear +"\n"+
           "\nStudent ID: " + studentID +"\n"+
           "\nCourses Enrolled:" +"\n"+ courses +"\n"+
           "\nBalance: $" + tuitionBalance;
    
  }
  
  
  
}