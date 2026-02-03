import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adj1;
        String adj2;
        String adj3;
        String noun1;
        String verb1;

        System.out.print("Enter an adj");
        adj1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person)");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adj");
        adj2 = scanner.nextLine();
        System.out.print("Enter a verb (action)");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adj");
        adj3 = scanner.nextLine();

        System.out.println("Today i went to a " + adj1 + " zoo.");
        System.out.println("In an exhibit, i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");
        scanner.close();
    }
}
