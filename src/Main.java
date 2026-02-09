
public class Main{
    public static void main(String[] args) throws InterruptedException {
        double result = 0;
        result = cube(5);
        System.out.println(result);
    }
    static void happyBirthday(){}
    static String getFullname(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    static int square(int width){
        return width * width;
    }
    static double cube(double number){
        return number * number * number;
    }

}