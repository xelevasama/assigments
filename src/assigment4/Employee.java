package assigment4;

public abstract class Employee implements Workable, Compensable {
    private final int id;
    private final String name;
    protected double baseSalary; // monthly base

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    @Override
    public double calculatePay() {
        // default: base salary
        return baseSalary;
    }

    @Override
    public double calculateAnnualBonus() {
        // default: 10% of annual base
        return baseSalary * 12 * 0.10;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
               "id=" + id + ", name='" + name + '\'' +
               ", baseSalary=" + baseSalary +
               '}';
    }
}
