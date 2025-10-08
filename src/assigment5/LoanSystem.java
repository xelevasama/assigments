package assigment5;

import java.util.ArrayList;
import java.util.HashMap;

class LoanSystem {
    private HashMap<String, Book> books = new HashMap<>();
    private HashMap<String, Customer> customers = new HashMap<>();
    private ArrayList<Loan> loans = new ArrayList<>();

    public void addBook(String id, String title) throws InvalidInputException {
        if (id == null || id.isEmpty() || title == null || title.isEmpty())
            throw new InvalidInputException("Book ID and title cannot be empty.");
        books.put(id.toUpperCase(), new Book(id, title));
    }

    public void addCustomer(String id, String name) throws InvalidInputException {
        if (id == null || id.isEmpty() || name == null || name.isEmpty())
            throw new InvalidInputException("Customer ID and name cannot be empty.");
        customers.put(id.toUpperCase(), new Customer(id, name));
    }

    public void loanBook(String bookId, String customerId) throws LoanException {
        Book b = books.get(bookId.toUpperCase());
        Customer c = customers.get(customerId.toUpperCase());

        if (b == null) throw new LoanException("Book not found.");
        if (c == null) throw new LoanException("Customer not found.");
        if (!b.isAvailable()) throw new LoanException("Book is already on loan.");

        b.setAvailable(false);
        loans.add(new Loan(c, b));
    }

    public void returnBook(String bookId) throws LoanException {
        Book b = books.get(bookId.toUpperCase());
        if (b == null) throw new LoanException("Book not found.");
        if (b.isAvailable()) throw new LoanException("Book was not on loan.");
        b.setAvailable(true);
    }

    public void listBooks() {
        System.out.println("-- Books --");
        for (Book b : books.values()) {
            System.out.println(b);
        }
    }

    public void listLoans() {
        System.out.println("-- Loans --");
        for (Loan l : loans) {
            System.out.println(l);
        }
    }
}
