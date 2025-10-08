package assigment3;

public class Student {
    private int id;
    private String name;
    private String email;

    // Constructor
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "ID: " + id + " | " + name + " | " + email;
    }
}
