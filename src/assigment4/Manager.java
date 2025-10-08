package assigment4;

public class Manager extends Employee {
    private int teamSize;

    public Manager(int id, String name, double baseSalary, int teamSize) {
        super(id, name, baseSalary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }

    public void approveLeave(String employeeName) {
        System.out.println("Manager approved leave for " + employeeName);
    }

    @Override
    public void performDuties() {
        System.out.println("Manager " + getName() + " coordinates team of " + teamSize + " people.");
    }

    @Override
    public double calculatePay() {
        // Managers get a leadership stipend: $150 per direct report
        return baseSalary + (teamSize * 150);
    }

    @Override
    public double calculateAnnualBonus() {
        // Managers: 15% of annual base + $500 per direct report
        return baseSalary * 12 * 0.15 + (teamSize * 500);
    }
}
