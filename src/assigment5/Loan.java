package assigment5;

import java.util.Date;

class Loan {
    private Customer customer;
    private Book book;
    private Date loanDate;

    public Loan(Customer c, Book b) {
        this.customer = c;
        this.book = b;
        this.loanDate = new Date();
    }

    public Customer getCustomer() { return customer; }
    public Book getBook() { return book; }
    public Date getLoanDate() { return loanDate; }

    @Override
    public String toString() {
        return "Loan: " + book.getTitle() + " to " + customer.getName() +
               " on " + loanDate;
    }
}
