package assigment2;
import java.util.Scanner;

//Main Program
public class InventorySystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Inventory inv = new Inventory();

     int option;
     do {
         System.out.println("\n--- Inventory Menu ---");
         System.out.println("1. Add product");
         System.out.println("2. List products");
         System.out.println("3. Search product by ID");
         System.out.println("4. Update stock");
         System.out.println("5. Exit");
         System.out.print("Choose an option: ");
         option = sc.nextInt();
         sc.nextLine();

         switch (option) {
             case 1:
                 System.out.print("ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Name: ");
                 String name = sc.nextLine();
                 System.out.print("Price: ");
                 double price = sc.nextDouble();
                 System.out.print("Quantity: ");
                 int qty = sc.nextInt();
                 inv.addProduct(new Product(id, name, price), qty);
                 break;

             case 2:
                 inv.listProducts();
                 break;

             case 3:
                 System.out.print("Enter ID: ");
                 int searchId = sc.nextInt();
                 inv.searchProduct(searchId);
                 break;

             case 4:
                 System.out.print("Enter ID: ");
                 int updateId = sc.nextInt();
                 System.out.print("New Quantity: ");
                 int newQty = sc.nextInt();
                 inv.updateStock(updateId, newQty);
                 break;

             case 5:
                 System.out.println("👋 Exiting...");
                 break;

             default:
                 System.out.println("Invalid option.");
         }
     } while (option != 5);

     sc.close();
 }
}