package assigment5;

class Customer {
    private String name;
    private String id;

    public Customer(String id, String name) {
        this.id = id.trim().toUpperCase();
        this.name = name.trim();
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
