package assigment4;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Employee> staff = new ArrayList<>();
        staff.add(new Manager(101, "Alice", 6000.0, 6));
        staff.add(new Director(201, "Bob", 9000.0, 12, 2_000_000.0));

        // Polymorphism: same calls, different behavior at runtime
        for (Employee e : staff) {
            System.out.println("\n" + e);
            e.performDuties(); // Workable -> dynamic dispatch
            System.out.printf("Monthly pay: $%.2f%n", e.calculatePay()); // Compensable
            System.out.printf("Annual bonus: $%.2f%n", e.calculateAnnualBonus());
        }

        // Interface polymorphism (using only the contract)
        List<Workable> workers = Arrays.asList(
            new Manager(102, "Carla", 6500.0, 4),
            new Director(202, "Diego", 12000.0, 18, 5_000_000.0)
        );
        System.out.println("\n-- Interface-only workload --");
        for (Workable w : workers) {
            w.performDuties();
        }
    }
}
