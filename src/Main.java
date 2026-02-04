import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
        System.out.print("What item would u like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.print("How many would u like?: ");
        quantity = scanner.nextInt();
        total = price * quantity;
        System.out.println("u need to pay " + total + currency);
        scanner.close();

    }
}
