
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectronicProduct smartphone = new ElectronicProduct(1, "smartphone", 599.9,"Samsung", 1);
      
        ClothingProduct tShirt = new ClothingProduct(2, "T-shirt", 19.99, "Medium", "Cotton");

        BookProduct oopBook = new BookProduct(3, "OOP", 39.99, "O’Reilly", "X Publications");

        System.out.println("Enter your customer ID:");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your address:");
        String address = scanner.nextLine();

        Customer customer = new Customer(customerId, name, address);

        System.out.println("How many products do you want to order?");
        int nProducts = scanner.nextInt();
        Cart cart = new Cart(customerId, nProducts);

        for (int i = 0; i < nProducts; i++) {
            System.out.println("Enter product details for product " + (i + 1) + ":");
            cart.addProduct(smartphone, i);
        }
    }
} 
