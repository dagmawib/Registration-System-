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
        var student1 = new Student("John", "David", "2465/14", "Software", 1, 2);
        student1.getProfile();
        student1.getBatch();
        System.out.println("|||||||||||||||||||||| Registered Successfully  ||||||||||||||||||||||||||");
        System.out.println(" ");
        student1.display();

//        try catch for Writing the inputs on the detail.txt file
        try {
            FileWriter storeDetails = getFileWriter(student1);
            storeDetails.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static FileWriter getFileWriter(Student student1) throws IOException {
        FileWriter storeDetails = new FileWriter("detail.txt",true);
        storeDetails.write("\n***** Student Profile *****");
//        write the input multiple times
        do {
            storeDetails.append("\n =>" + " First Name -- ").append(student1.getFName());
            storeDetails.append("\n =>" + " Last Name -- ").append(student1.getLName());
            storeDetails.append("\n =>" + " ÏD number -- ").append(student1.getId());
            storeDetails.append("\n =>" + " Department -- ").append(student1.getDept());
            storeDetails.append("\n =>" + " Year -- ").append(String.valueOf(student1.getYear()));
            storeDetails.append("\n =>" + " Semester -- ").append(String.valueOf(student1.getSemester()));
            return storeDetails;
        }while (true);
    }
}
