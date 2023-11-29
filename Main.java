import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static int year;
    static int sem;
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("|||||||||||||||||||||| Start Your Registration Here ||||||||||||||||||||||||||");
        System.out.println(" ");
        var student1 = new Student();
        student1.getProfile();
        student1.getBatch();
        System.out.println("|||||||||||||||||||||| Registered Successfully  ||||||||||||||||||||||||||");
        System.out.println(" ");
        student1.display();

        try {
            FileWriter storeDetails = getFileWriter(student1);
            storeDetails.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static FileWriter getFileWriter(Student student1) throws IOException {
        FileWriter storeDetails = new FileWriter("detail.txt");
        storeDetails.write("***** Students Profile *****");
        storeDetails.write("\n =>" + " First Name -- " + student1.FName);
        storeDetails.write("\n =>" + " Last Name -- " + student1.LName);
        storeDetails.write("\n =>" + " ÏD number -- " + student1.Id);
        storeDetails.write("\n =>" + " Department -- " + student1.Dept);
        storeDetails.write("\n =>" + " Year -- " + student1.Year);
        storeDetails.write("\n =>" + " Semester -- " + student1.semester);
        return storeDetails;
    }
}
