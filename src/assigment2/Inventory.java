package assigment2;

import java.util.ArrayList;
import java.util.HashMap;

//Inventory Manager
class Inventory {
 private ArrayList<Product> products = new ArrayList<>();
 private HashMap<Integer, Integer> stock = new HashMap<>();

 // Add product
 public void addProduct(Product p, int quantity) {
     products.add(p);
     stock.put(p.getId(), quantity);
 }

 // List products
 public void listProducts() {
     for (Product p : products) {
         int qty = stock.getOrDefault(p.getId(), 0);
         System.out.println(p + " | Stock: " + qty);
     }
 }

 // Search product by ID
 public void searchProduct(int id) {
     for (Product p : products) {
         if (p.getId() == id) {
             System.out.println(" Found: " + p + " | Stock: " + stock.getOrDefault(id, 0));
             return;
         }
     }
     System.out.println(" Product not found.");
 }

 // Update stock
 public void updateStock(int id, int newQty) {
     if (stock.containsKey(id)) {
         stock.put(id, newQty);
         System.out.println(" Stock updated for product " + id);
     } else {
         System.out.println(" Product ID not found.");
     }
 }
}
