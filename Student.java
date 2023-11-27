import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;
public class Student extends Courses {
    Scanner input = new Scanner(System.in);
    public String Id;
    public String FName;
    public String LName;
    public String Dept;
    public int Year;
    public int semester;

    public void getProfile(){
        System.out.print("Enter your first name: ");
         FName= input.next();
        System.out.print("Enter your last name: ");
         LName= input.next();
        System.out.print("Enter your ID number: ");
         Id = input.next();
        System.out.print("Enter your Department: ");
         Dept = input.next();
    }
    public void getBatch( ){
        System.out.print("Enter your current year:  ");
        Year = input.nextInt();
        do {
            System.out.print("Enter your current semester: ");
            semester = input.nextInt();
            if(semester != 1 && semester != 2)
                 System.out.println("Invalid Semester input");
        }while ( semester != 2 && semester != 1);

    }
    public void display(){
        System.out.println("Welcome " + FName + " " + LName);
        System.out.println("You are registered for " + Year + " year " + semester + " semester ");
        if(Year == 4 ) {
            if( semester == 2){
                System.out.println(" ");
            }
        }else {
            System.out.println("This semester's courses and instructors are ");
        }

        if(Year == 2 && semester == 2){
            System.out.println("---------------------------------");
            for (String[] strings : secondYearSecondSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("---------------------------------");
        } else if (Year == 3 && semester == 1) {
            System.out.println("---------------------------------");
            for (String[] strings : ThirdYearFirstSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("---------------------------------");
        }
        else if (Year == 3 && semester == 2) {
            System.out.println("---------------------------------");
            for (String[] strings : ThirdYearSecondSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("---------------------------------");
        }
        else if (Year == 4 && semester == 1) {
            System.out.println("---------------------------------");
            for (String[] strings : FourthYearFirstSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("---------------------------------");
        }else if (Year == 4 && semester == 2) {
            System.out.println("This whole semester is your Internship time.");
        }
        else if (Year == 5 && semester == 1) {
            System.out.println("---------------------------------");
            for (String[] strings : FifthYearFirstSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("---------------------------------");
        }else if (Year == 5 && semester == 2) {
            System.out.println("---------------------------------");
            for (String[] strings : FifthYearSecondSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("---------------------------------");
        }
        Date now = new Date();
        System.out.println(now);
    }
}
