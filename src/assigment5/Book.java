package assigment5;

import java.util.*;

class Book {
    private String id;
    private String title;
    private boolean available = true;

    public Book(String id, String title) {
        this.id = id.trim().toUpperCase();  // string manipulation
        this.title = title.trim();
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean status) { this.available = status; }

    @Override
    public String toString() {
        return id + " - " + title + (available ? " (Available)" : " (On Loan)");
    }
}
