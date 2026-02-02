import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter ur name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ur gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are u a student: ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your grade is " + grade);
        System.out.println("Your gpa is " + gpa);
        if(isStudent) System.out.println("You are a enroll as a student");
        else{
            System.out.println("You are not enroll");
        }
       scanner.close();
    }
}
