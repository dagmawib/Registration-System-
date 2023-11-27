import java.util.Scanner;
public class Main {
    static int year;
    static int sem;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("|||||||||||||||||||||| Start Your Registration Here ||||||||||||||||||||||||||");

        System.out.println(" ");
        var student1 = new Student();
        student1.getProfile();
        student1.getBatch();
        System.out.println("|||||||||||||||||||||| Registered Successfully  ||||||||||||||||||||||||||");
        System.out.println(" ");
        student1.display();
    }
}
