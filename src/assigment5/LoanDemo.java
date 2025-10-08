package assigment5;

import java.util.Scanner;

public class LoanDemo {
    public static void main(String[] args) {
        LoanSystem system = new LoanSystem();
        Scanner sc = new Scanner(System.in);

        try {
            // preload some data
            system.addBook("B1", "Java Programming");
            system.addBook("B2", "Data Structures");
            system.addCustomer("C1", "Alice");
            system.addCustomer("C2", "Bob");

            boolean running = true;
            while (running) {
                System.out.println("\n1. List Books\n2. Loan Book\n3. Return Book\n4. List Loans\n5. Exit");
                System.out.print("Choose: ");
                String choice = sc.nextLine();

                try {
                    switch (choice) {
                        case "1":
                            system.listBooks();
                            break;
                        case "2":
                            System.out.print("Enter Book ID: ");
                            String bid = sc.nextLine();
                            System.out.print("Enter Customer ID: ");
                            String cid = sc.nextLine();
                            system.loanBook(bid, cid);
                            System.out.println("Loan registered.");
                            break;
                        case "3":
                            System.out.print("Enter Book ID to return: ");
                            String rid = sc.nextLine();
                            system.returnBook(rid);
                            System.out.println("Book returned.");
                            break;
                        case "4":
                            system.listLoans();
                            break;
                        case "5":
                            running = false;
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                } catch ( LoanException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        } catch (InvalidInputException ex) {
            System.out.println("Setup error: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
