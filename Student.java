import java.util.Arrays;
import java.util.InputMismatchException;
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
        while (true) {
            try {
                System.out.print("Enter your First name: ");
                FName = input.nextLine().toUpperCase();
                if (FName.matches("[a-zA-Z+' ']+")) {
                    setFname(FName);
                    break;
                } else {
                    throw new InputMismatchException();
                }
            } catch(InputMismatchException e){
                System.out.println("Invalid input try again");
            }
        }
        while (true) {
            try {
                System.out.print("Enter your Last name: ");
                LName = input.nextLine().toUpperCase();
                if (LName.matches("[a-zA-Z+' ']+")) {
                    setLname(LName);
                    break;
                     } else {
                    throw new InputMismatchException();
                }
            } catch(InputMismatchException e){
                System.out.println("Invalid input try again");
            }
        }
        while (true) {
            System.out.print("Enter your ID number: ");
            Id = input.nextLine();
            if (Id.matches("\\d+/\\d+")) {
                break;
            } else {
                System.out.println("Invalid ID format. Please enter again.");
            }
        }
        System.out.print("Enter your Department: ");
        Dept = input.nextLine();
    }
    private void setLname(String lName) {}
    private void setFname(String fName) {}
    public void getBatch( ){
        System.out.print("Enter your current year:  ");
        Year = input.nextInt();
        do {
            System.out.print("Enter your current semester: ");
            semester = input.nextInt();
            if(semester != 1 && semester != 2) {
                System.out.println("Invalid Semester input");
            }
        }while ( semester != 2 && semester != 1);
    }
    public void display(){
        System.out.println("************** Welcome " + FName + " " + LName+" **************");
        System.out.println("You are registered for " + Year + " year " + semester + " semester ");
        if(Year == 4 ) {
            if( semester == 2){
                System.out.println(" ");
            }
        }else {
            System.out.println("This semester's courses and instructors are ");
        }
        if(Year == 2 && semester == 2){
            System.out.println("    ---------------------------------");
            System.out.println("Courses   Cr.Hr    Instructors");
            for (String[] strings : secondYearSecondSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("    ---------------------------------");
        } else if (Year == 3 && semester == 1) {
            System.out.println("    ---------------------------------");
            System.out.println("Courses   Cr.Hr    Instructors");
            for (String[] strings : ThirdYearFirstSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("    ---------------------------------");
        }
        else if (Year == 3 && semester == 2) {
            System.out.println("    ---------------------------------");
            System.out.println("Courses           Cr.Hr    Instructors");
            for (String[] strings : ThirdYearSecondSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("    ---------------------------------");}
        else if (Year == 4 && semester == 1) {
            System.out.println("    ---------------------------------");
            System.out.println("Courses             Cr.Hr    Instructors");
            for (String[] strings : FourthYearFirstSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("    ---------------------------------");
        }else if (Year == 4 && semester == 2) {
            System.out.println("This whole semester is your Internship time.");
        }
        else if (Year == 5 && semester == 1) {
            System.out.println("    ---------------------------------");
            System.out.println("Courses            Cr.Hr    Instructors");
            for (String[] strings : FifthYearFirstSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("    ---------------------------------");
        }else if (Year == 5 && semester == 2) {
            System.out.println("    ---------------------------------");
            System.out.println("Courses             Cr.Hr    Instructors");
            for (String[] strings : FifthYearSecondSemester) {
                System.out.println(Arrays.deepToString(strings));
            }
            System.out.println("    ---------------------------------");
        }
        Date now = new Date();
        System.out.println("      " + now);
    }
}
