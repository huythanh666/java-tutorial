import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Student student = new Student("thanh",18,4.0);
        System.out.println(student.name);
        student.study();
    }
}