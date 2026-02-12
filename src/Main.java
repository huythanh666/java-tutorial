import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the menu: ");
        int menuLength = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <=  menuLength; i++) {
            System.out.println("Enter food u want to add: ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
        foods.remove(0);
        System.out.println(foods);
        foods.set(0,"bun dau ");
        System.out.println(foods);}}